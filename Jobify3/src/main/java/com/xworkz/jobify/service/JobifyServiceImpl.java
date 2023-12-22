package com.xworkz.jobify.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.jobify.dtos.JobifyDTO;
import com.xworkz.jobify.dtos.JobifyEntity;
import com.xworkz.jobify.repo.JobifyRepositoryImpl;
import com.xworkz.jobify.util.OutlookEmail;
import com.xworkz.jobify.util.PasswordEncryption;

@Service
public class JobifyServiceImpl implements JobifyService {

	@Autowired
	private JobifyRepositoryImpl repo;
	
	@Autowired
    private PasswordEncoder passwordEncoder;

	@Override
	public boolean ValidateAndSave(JobifyDTO dto, Model model) {
		boolean isValid = true;
		if (dto != null) {
			if (dto.getName() == null || dto.getName().isEmpty() || dto.getName().length() <= 2) {
				model.addAttribute("nameInvalid", "Please fill this field");
				isValid = false;
			}
			if (dto.getEmail() == null || dto.getEmail().isEmpty()
					|| dto.getEmail().matches("/^[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,4}$/")) {
				model.addAttribute("emailInvalid", "Please Enter Correct Email");
				isValid = false;
			}
			if (!dto.getMobile().matches("(0|91)?[6-9][0-9]{9}")) {
				model.addAttribute("mobileInvalid", "Please enter a valid Mobile Number");
				isValid = false;
			}
			if (!dto.getPassword().matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()])(?=\\S+$).{8,20}$")) {
				model.addAttribute("passwordInvalid",
						"Enter a password with min. 8 characters, one uppercase and one symbol");
				isValid = false;
			}
			if (!dto.getConfirmPassword().equals(dto.getPassword())) {
				model.addAttribute("confirmPasswordInvalid", "Password doesnot match");
				isValid = false;
			}
			if(isExists(dto,model)) {
				isValid=false;
			}
			if (isValid == true) {
				
				String hashedPassword = passwordEncoder.encode(dto.getPassword());
			    dto.setPassword(hashedPassword);
				JobifyEntity entity = new JobifyEntity();
				entity.setCreatedBy(dto.getEmail());
				entity.setCreatedOn(LocalDate.now());
				BeanUtils.copyProperties(dto, entity);
				OutlookEmail email = new OutlookEmail();
				email.newEmail(dto.getEmail(),dto.getName());
					return repo.save(entity);
			}
			
		}
		return isValid;

	}
	
	

	@Override
	public List<JobifyEntity> readAll() {
		return repo.readAll();
	}

	@Override
	public boolean isExists(JobifyDTO dto, Model model) {
		List<JobifyEntity> list = repo.readAll();
		for (JobifyEntity jobifyEntity : list) {
			if(jobifyEntity.getEmail().equals(dto.getEmail())) {
				model.addAttribute("emailExists","Email already exists");
				return true;
			}
			
		}
		return false;
	}

	@Override
	public JobifyEntity findByEmail(String email, Model model) {
		if(email!=null && !email.isEmpty()) {
			return repo.findByEmail(email);
		}
		return null;
	}

}
