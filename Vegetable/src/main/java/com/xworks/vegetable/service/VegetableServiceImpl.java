package com.xworks.vegetable.service;

import java.util.Collection;

import com.xworks.vegetable.dto.VegetableDTO;
import com.xworks.vegetable.repository.VegetableRepo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class VegetableServiceImpl implements VegetableService {
	private VegetableRepo repo;

	@Override
	public boolean validateandsave(VegetableDTO dto) {
		System.out.println("Validate and save in Service: " + dto);
		repo.save(dto);
		return true;
	}
	
	@Override
	public int total() {
		return this.repo.total();
	}
	
	@Override
	public Collection<VegetableDTO> getAll() {
		return this.repo.getAll();
	}

}
