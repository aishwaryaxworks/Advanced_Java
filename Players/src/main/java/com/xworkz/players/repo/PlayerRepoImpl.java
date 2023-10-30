package com.xworkz.players.repo;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.players.dto.PlayersDTO;

public class PlayerRepoImpl implements PlayerRepo{
	private PlayersDTO[] dto = new PlayersDTO[ITEMS];
	
	private Collection<PlayersDTO> group = new LinkedList<PlayersDTO>();

	@Override
	public void save(PlayersDTO pdto) {
		System.out.println("Running save in Repo");
		boolean saved = this.group.add(pdto);
		if (saved) {
			System.out.println("Data saved");
		} else {
			System.out.println("Not saved");
		}
	}
	
	@Override
	public int total() {
		return this.group.size();
	}
	
	@Override
	public Collection<PlayersDTO> getAll() {
		return this.group;
	}

}
