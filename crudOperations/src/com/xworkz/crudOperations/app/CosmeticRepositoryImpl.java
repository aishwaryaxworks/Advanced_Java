package com.xworkz.crudOperations.app;

import com.xworkz.crudOperations.dto.CosmeticDTO;
import com.xworkz.crudOperations.interfaces.CosmeticRepository;

public class CosmeticRepositoryImpl implements CosmeticRepository {
	private CosmeticDTO[] cosmetic = new CosmeticDTO[ITEMS];
	private int index = 0;

	@Override
	public boolean validateandsave(CosmeticDTO cosdto) {
		if (index < ITEMS) {
			if (cosdto.getBrand() != null && !cosdto.getBrand().isEmpty() && cosdto.getBrand().length() > 3
					&& cosdto.getBrand().length() < 30 && cosdto.getName() != null && !cosdto.getName().isEmpty()
					&& cosdto.getName().length() > 3 && cosdto.getName().length() < 30 && cosdto.getPrice() > 0
					&& cosdto.getPrice() < 2000000) {
				System.out.println(cosdto.getBrand() + " is cosmetic brand data...");
				this.cosmetic[index] = cosdto;
				this.index++;
			} else {
				System.err.println(cosdto + " is error in cosmetic data...");
			}
		}

		return false;
	}

	@Override
	public CosmeticDTO findbyCosmeticName(String name) {
		// for(int i=0; i<index;i++) --->>> Either do this to avoid null pointer
		// exception or check for null

		for (int i = 0; i < cosmetic.length; i++) {
			if (cosmetic[i] != null) {
				if (cosmetic[i].getName().equals(name)) {
					System.out.println("Found cosmetic name...");
					return cosmetic[i];
				}
				System.err.println("Name not matching... checking next index...");
			}
		}
		System.err.println("Name not found...");
		return null;
	}

	@Override
	public CosmeticDTO findbyCosmeticNameandBrand(String name, String brand) {
		for(int i=0;i<cosmetic.length;i++) {
			if(cosmetic[i]!=null) {
				if(cosmetic[i].getBrand().equalsIgnoreCase(brand) && cosmetic[i].getName().equalsIgnoreCase(name)) {
					System.out.println("Found name and brand...");
					return cosmetic[i];
				}
				System.err.println("Name and brand not matching...");
			}
		}
		System.err.println("Name and brand not found...");
		return null;
	}
}
