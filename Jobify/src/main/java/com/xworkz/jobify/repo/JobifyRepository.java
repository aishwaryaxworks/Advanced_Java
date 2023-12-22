package com.xworkz.jobify.repo;

import java.util.Collection;

import com.xworkz.jobify.dto.JobifyEntity;

public interface JobifyRepository {
	
	public boolean save(JobifyEntity dto);
	
	public Collection<JobifyEntity> readAll();
	
	public JobifyEntity findByEmail(String email);
	
}
