package com.xworkz.jobify.service;

import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.jobify.dtos.JobifyDTO;
import com.xworkz.jobify.dtos.JobifyEntity;

public interface JobifyService {
	
	public boolean ValidateAndSave(JobifyDTO dto, Model model);
	
	public List<JobifyEntity> readAll();
	
	public boolean isExists(JobifyDTO dto,Model model);
	
	public JobifyEntity findByEmail(String email, Model model);

}
