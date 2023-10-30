package com.xworkz.crudOperations.services;

import com.xworkz.crudOperations.app.CosmeticRepositoryImpl;
import com.xworkz.crudOperations.dto.CosmeticDTO;
import com.xworkz.crudOperations.interfaces.CosmeticRepository;
import com.xworkz.crudOperations.util.ValidateUtil;

public class CosmeticServiceImpl implements CosmeticService{
	CosmeticRepository crepo = new CosmeticRepositoryImpl();
	
	@Override
	public boolean validateandsave(CosmeticDTO cdto) {
		System.out.println();
		if(cdto!=null) {
			System.out.println("good data");
			//get properties
			/*cdto.getBrand();
			cdto.getName();
			cdto.getPrice();*/
			
			if(cdto.getBrand()!=null && !cdto.getBrand().isEmpty() && cdto.getBrand().length()>=3 && cdto.getBrand().length()<30) {
				System.out.println("Brand is :"+cdto.getBrand());
			}else {
				System.err.println("Brand error...");
			}
			
			if(cdto.getName()!=null && !cdto.getName().isEmpty() && cdto.getName().length()>=3 && cdto.getName().length()<30) {
				System.out.println("Name of cosmetic is :"+cdto.getName());
			}else {
				System.err.println("Name error...");
			}
			
			if(cdto.getPrice() > 0 && cdto.getPrice()<10000) {
				System.out.println("Price is :"+cdto.getPrice());
			}else {
				System.err.println("Price error...");
			}
			
			//if(brand!=null && !brand.isEmpty() && brand.length()>=3 && brand.length <= 30) else err
			//if(name!=null && !name.isEmpty() && name.length()>=3 && name.length <= 30) else err
			//if(price > 0 && price < 100000 ) else err
			
		}else {
			System.out.println("bad data");
		}
		return true;
	}

	@Override
	public CosmeticDTO findbyCosmeticName(String name) {
		boolean isValid=ValidateUtil.validateString(name);
		if(isValid) {
			System.out.println("Name valid... sending to repo...");
			CosmeticDTO foundDTO = crepo.findbyCosmeticName(name);
			return foundDTO;
		}else {
			System.err.println("name not valid...");
		}
		return null;
	}

	@Override
	public CosmeticDTO findbyCosmeticNameandBrand(String name, String brand) {
		boolean isNameValid=ValidateUtil.validateString(name);
		boolean isBrandValid=ValidateUtil.validateString(brand);
		if(isNameValid && isBrandValid) {
			System.out.println("Name and brand valid... sending to repo...");
			CosmeticDTO foundDTO = crepo.findbyCosmeticNameandBrand(name, brand);
			return foundDTO;
		}
		System.err.println("Name and brand not valid...");
		return null;
	}
}
