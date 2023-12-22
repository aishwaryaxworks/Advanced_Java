package com.xworkz.jobify.service;

import org.springframework.ui.Model;

import com.xworkz.jobify.dto.JobifyDTO;
import com.xworkz.jobify.dto.JobifyEntity;

public interface JobifyService {
	
	public boolean ValidateAndSave(JobifyDTO dto, Model model);
	
	public boolean isExists(String email);
	
	public JobifyEntity findByEmail(String email, Model model);

}
