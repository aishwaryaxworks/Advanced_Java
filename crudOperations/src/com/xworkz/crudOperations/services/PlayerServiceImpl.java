package com.xworkz.crudOperations.services;

import com.xworkz.crudOperations.dto.PlayerDTO;
import com.xworkz.crudOperations.interfaces.PlayerRepository;
import com.xworkz.crudOperations.util.PlayerUtil;

public class PlayerServiceImpl implements PlayerService {
	private PlayerRepository player1;

	public PlayerServiceImpl(PlayerRepository repository) {
		this.player1 = repository;
	}

	@Override
	public boolean validate(PlayerDTO player) {
		String name = player.getName();
		String sportName = player.getSportName();

		if (PlayerUtil.validate(name)) {
			System.out.println("Player name is :" + name);
		} else {
			System.err.println(name);
		}

		if (PlayerUtil.validate(sportName)) {
			System.out.println("Sport name is :" + sportName);
		} else {
			System.err.println(sportName);
		}

		player1.validateandsave(player);

		return true;
	}

}
