package com.xworks.vegetable.repository;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

import com.xworks.vegetable.dto.VegetableDTO;

public class VegetableRepoImpl implements VegetableRepo{
	private VegetableDTO[] dto = new VegetableDTO[ITEMS];
	private int index=0;
	
	private Collection<VegetableDTO> group = new LinkedList<VegetableDTO>();

	@Override
	public void save(VegetableDTO vdto) {
		System.out.println("Running save in Repo");
		boolean saved = this.group.add(vdto);
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
	public Collection<VegetableDTO> getAll() {
		return this.group;
	}

}
