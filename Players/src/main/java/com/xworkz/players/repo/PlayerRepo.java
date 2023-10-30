package com.xworkz.players.repo;

import java.util.Collection;

import com.xworkz.players.dto.PlayersDTO;

public interface PlayerRepo {
	int ITEMS = 3;
	
	void save(PlayersDTO pdto);
	
	default int total() {
		return 0;
	}
	
	default Collection<PlayersDTO> getAll(){
		return null;
	}

}
