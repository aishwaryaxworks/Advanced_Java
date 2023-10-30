package com.xworkz.crudOperations.interfaces;

import com.xworkz.crudOperations.dto.CosmeticDTO;

public interface CosmeticRepository {
	int ITEMS=3;
	
	public boolean validateandsave(CosmeticDTO cosdto);
	public CosmeticDTO findbyCosmeticName(String name);
	public CosmeticDTO findbyCosmeticNameandBrand(String name, String brand);

}
