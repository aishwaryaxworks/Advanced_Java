package com.xworkz.grocery.service;

import java.util.Collection;

import com.xworkz.grocery.dto.GroceryDTO;

public interface GroceryService {
	boolean validateandsave(GroceryDTO dto);

	default int total() {
		return 0;
	}

	default Collection<GroceryDTO> getAll() {
		return null;
	}
}
