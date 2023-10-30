package com.xworkz.crudOperations.services;

import com.xworkz.crudOperations.dto.CosmeticDTO;

public interface CosmeticService {
	boolean validateandsave(CosmeticDTO cdto);
	
	public CosmeticDTO findbyCosmeticName(String name);
	
	public CosmeticDTO findbyCosmeticNameandBrand(String name, String brand);
}
