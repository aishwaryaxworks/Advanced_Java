package com.xworkz.temple.repository;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

import com.xworkz.temple.dto.TempleDTO;

public class TempleRepoImpl implements TempleRepo{

	private TempleDTO[] tdto = new TempleDTO[ITEMS];
	private int index = 0;
	
	private Collection<TempleDTO> group =  new LinkedList<TempleDTO>();
	
	@Override
	public void save(TempleDTO tdto) {
		System.out.println("Running save in Repo");
		boolean saved = this.group.add(tdto);
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
	public Collection<TempleDTO> getAll() {
		return this.group;
	}

}
