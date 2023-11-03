package com.xworkz.perfume.repo;

import java.util.Collection;

import com.xworkz.perfume.dto.PerfumeDTO;

public interface PerfumeRepo {
	public boolean save(PerfumeDTO pdto);
	
	public Collection<PerfumeDTO> read();
	
	public Collection<PerfumeDTO> readAll();
	
	public boolean updatePriceByUsingName(String brandName, Integer price);
	
}
