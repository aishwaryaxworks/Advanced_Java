package com.xworkz.crudOperations.interfaces;

import com.xworkz.crudOperations.dto.PlayerDTO;

public interface PlayerRepository {
	int ITEMS = 5;
	public boolean validateandsave(PlayerDTO player);

}
