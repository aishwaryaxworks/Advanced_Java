package com.xworks.vegetable.service;

import java.util.Collection;

import com.xworks.vegetable.dto.VegetableDTO;

public interface VegetableService {
	boolean validateandsave(VegetableDTO dto);

	default int total() {
		return 0;
	}

	default Collection<VegetableDTO> getAll() {
		return null;
	}
}
