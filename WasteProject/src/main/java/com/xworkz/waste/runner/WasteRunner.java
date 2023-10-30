package com.xworkz.waste.runner;

import com.xworkz.waste.dto.WasteDTO;
import com.xworkz.waste.repository.WasteRepository;
import com.xworkz.waste.repository.WasteRepositoryImpl;

public class WasteRunner {
	public static void main(String[] args) {
		WasteDTO wdto1 = new WasteDTO("Vegetable Peels", "Organinc", 0.500);
		WasteDTO wdto2 = new WasteDTO("Plastic Covers", "Plastic", 0.250);
		System.out.println(wdto1);
		
		WasteRepository wrepo =  new WasteRepositoryImpl();
		wrepo.save(wdto1);
		wrepo.save(wdto2);
		
	}

}
