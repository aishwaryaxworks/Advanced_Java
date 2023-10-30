package com.xworks.vegetable.repository;

import java.util.Collection;

import com.xworks.vegetable.dto.VegetableDTO;

public interface VegetableRepo {
	int ITEMS=3;
	
	void save(VegetableDTO vdto);
	
	default int total() {
		return 0;
	}
	
	default Collection<VegetableDTO> getAll() {
		return null;
	}
}