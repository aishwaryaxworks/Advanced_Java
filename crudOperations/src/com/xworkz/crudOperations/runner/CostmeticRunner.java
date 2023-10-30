package com.xworkz.crudOperations.runner;

import com.xworkz.crudOperations.app.CosmeticRepositoryImpl;
import com.xworkz.crudOperations.dto.CosmeticDTO;
import com.xworkz.crudOperations.interfaces.CosmeticRepository;
import com.xworkz.crudOperations.services.CosmeticService;
import com.xworkz.crudOperations.services.CosmeticServiceImpl;

public class CostmeticRunner {
	public static void main(String[] args) {
		//brand:null, empty, min 3 chars, max 30 chars
		CosmeticDTO dto1 = new CosmeticDTO("compact powder", "Lakme", 250.00);
		System.out.println(dto1.toString());
		
		CosmeticDTO dto2 = new CosmeticDTO(null,"Lakme",250.00);
		CosmeticDTO dto3 = new CosmeticDTO(null,"",250.00);
		CosmeticDTO dto4 = new CosmeticDTO(null,null,-150);
		
		CosmeticRepository repo = new CosmeticRepositoryImpl();
		System.out.println(repo.validateandsave(dto1));
		System.out.println(repo.validateandsave(dto2));
		System.out.println(repo.validateandsave(dto3));
		System.out.println(repo.validateandsave(dto4));
		
		CosmeticService cosServ = new CosmeticServiceImpl();
		CosmeticDTO foundDTO1 = cosServ.findbyCosmeticName("Lakme");
		System.out.println("Found:"+foundDTO1);
		
		CosmeticDTO foundDTO2 = cosServ.findbyCosmeticName("compact powder");
		System.out.println("found:"+foundDTO2);
		
		CosmeticDTO foundDTO3 = cosServ.findbyCosmeticNameandBrand("Lakme","compact powder");
		System.out.println("Found:"+foundDTO3);
	}
}
