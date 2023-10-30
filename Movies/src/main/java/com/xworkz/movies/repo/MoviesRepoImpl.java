package com.xworkz.movies.repo;

import java.util.Collection;
import java.util.LinkedList;

import com.xworkz.movies.dto.MoviesDTO;

public class MoviesRepoImpl implements MoviesRepo{
	private MoviesDTO[] dto = new MoviesDTO[ITEMS];
	
	private Collection<MoviesDTO> group = new LinkedList<MoviesDTO>();

	@Override
	public void save(MoviesDTO pdto) {
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
	public Collection<MoviesDTO> getAll() {
		return this.group;
	}

}
