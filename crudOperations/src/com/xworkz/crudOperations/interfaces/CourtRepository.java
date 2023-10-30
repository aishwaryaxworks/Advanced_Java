package com.xworkz.crudOperations.interfaces;

import com.xworkz.crudOperations.dto.CourtDTO;

public interface CourtRepository {
	int ITEMS=3;
	public void save(CourtDTO courtdto);
	
	public default boolean isExists(CourtDTO courtdto) {
		return false;	
	}

}
