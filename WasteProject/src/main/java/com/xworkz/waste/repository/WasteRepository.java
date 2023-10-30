package com.xworkz.waste.repository;

import com.xworkz.waste.dto.WasteDTO;

public interface WasteRepository {
	int ITEMS=3;
	
	void save(WasteDTO wdto);
	
}
