package com.xworkz.crudOperations.app;

import com.xworkz.crudOperations.dto.PlayerDTO;
import com.xworkz.crudOperations.interfaces.PlayerRepository;

public class PlayerRepoImpl implements PlayerRepository {
	private PlayerDTO[] player = new PlayerDTO[ITEMS];
	private int index = 0;

	@Override
	public boolean validateandsave(PlayerDTO player) {
		if(index<ITEMS) {
			this.player[index]=player;
			System.out.println(player +  " is player's data.");
			this.index++;
		}else {
			System.err.println(player+" is player's data.");
		}
		return true;
	}

}
