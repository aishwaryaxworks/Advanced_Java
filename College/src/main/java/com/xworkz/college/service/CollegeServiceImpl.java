package com.xworkz.college.service;

import java.util.List;

import com.xworkz.college.dto.CollegeDto;
import com.xworkz.college.repo.CollegeRepo;
import com.xworkz.college.repo.CollegeRepoImpl;

public class CollegeServiceImpl implements CollegeService {
	
	
	CollegeRepo repo = new CollegeRepoImpl();

	@Override
	public String save(CollegeDto dto) {
		System.out.println(dto.toString());
		if(dto.getName().length()>2) {
			if(dto.getName()!=null && !dto.getName().isEmpty()) {
				if(dto.getLocation()!=null && !dto.getLocation().isEmpty()) {
					if(dto.getNoOfStaffs()>0) {
						if(dto.getNoOfStudents()>0) {
							System.out.println("save method from service");
							return repo.save(dto);
						}
					}
				}
			}
		}
			return "Name is not valid";
		
	}

	@Override
	public List<CollegeDto> readAll() {
		
		return repo.readAll();
	}

}
