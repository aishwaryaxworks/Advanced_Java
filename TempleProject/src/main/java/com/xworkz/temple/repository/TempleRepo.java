package com.xworkz.temple.repository;

import java.util.Collection;
import com.xworkz.temple.dto.TempleDTO;

public interface TempleRepo {
	int ITEMS=3;
	
	void save(TempleDTO tdto);
	
	default int total() {
		return 0;
	}
	
	default Collection<TempleDTO> getAll(){
		return null;
	}
}
