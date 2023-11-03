package com.xworkz.perfume.service;

import java.util.Collection;

import com.xworkz.perfume.dto.PerfumeDTO;

public interface PerfumeService {
	public boolean validateAndSave(PerfumeDTO pdto);

	public Collection<PerfumeDTO> read();
	
	public void findByName();
	
	public Collection<PerfumeDTO> readAll();
	
	public boolean isExist(PerfumeDTO dto);
	
	public boolean updatePriceByUsingName(String brandName, Integer price); 
	
	public void removeByBrand(String brandName);
}
