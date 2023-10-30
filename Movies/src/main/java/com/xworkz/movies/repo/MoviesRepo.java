package com.xworkz.movies.repo;

import java.util.Collection;

import com.xworkz.movies.dto.MoviesDTO;

public interface MoviesRepo {
	int ITEMS = 3;
	
	void save(MoviesDTO pdto);
	
	default int total() {
		return 0;
	}
	
	default Collection<MoviesDTO> getAll(){
		return null;
	}

}
