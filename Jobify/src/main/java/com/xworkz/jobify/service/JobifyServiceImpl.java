package com.xworkz.jobify.service;

import java.time.LocalDate;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.xworkz.jobify.dto.JobifyDTO;
import com.xworkz.jobify.dto.JobifyEntity;
import com.xworkz.jobify.repo.JobifyRepository;

@Service
public class JobifyServiceImpl implements JobifyService {

	@Autowired
	private JobifyRepository repo;

	@Override
	public boolean ValidateAndSave(JobifyDTO dto, Model model) {
		if (dto.getName() != null && !dto.getName().isEmpty()) {
			if (dto.getEmail() != null && !dto.getEmail().isEmpty()) {
				if (dto.getPassword() != null && !dto.getPassword().isEmpty()) {
					if (dto.getConfirmPass() != null && !dto.getConfirmPass().isEmpty()) {
						
						JobifyEntity entity = new JobifyEntity();
						
						entity.setCreatedBy(dto.getEmail());
						entity.setCreatedOn(LocalDate.now());
						
						BeanUtils.copyProperties(dto, entity);
						
						boolean exist = isExists(entity.getEmail());
						if (!exist) {
							
//							JobifyEntity entity = new JobifyEntity();
//							entity.setCreatedBy(dto.getEmail());
//							entity.setCreatedOn(LocalDate.now());
//							BeanUtils.copyProperties(dto, entity);
//							
							System.out.println("Email doesnt exist");
							return repo.save(entity);
						} else {
							System.out.println("Account already exists");
							model.addAttribute("accExists",
									"Account already exists with this email, use sign in instead.");
							return false;
						}

					}
				}
			}
		}

		return true;
	}

	// @Override
	// public boolean isExists(JobifyEntity entity, Model model) {
	// Collection<JobifyEntity> coll = repo.readAll();
	// for(JobifyEntity e : coll) {
	// if(entity.getEmail().equals(e.getEmail()) &&
	// entity.getName().equals(e.getName())) {
	// model.addAttribute("accExists", "Account already exists, Please use Sign
	// In");
	// }
	// }
	// return false;
	//
	// }

	@Override
	public boolean isExists(String email) {
		JobifyEntity entity = repo.findByEmail(email);
		if (entity != null) {
			System.out.println("Email exists");
			return true;
		}
		return false;
	}

	@Override
	public JobifyEntity findByEmail(String email, Model model) {
		if (email != null && !email.isEmpty()) {
			JobifyEntity en = repo.findByEmail(email);
			if (en == null) {
				model.addAttribute("Email does not exists", "emailExists");
				return en;
			}
			model.addAttribute("Email already exists", "emailExists");
			return en;
		}
		return null;
	}
}
