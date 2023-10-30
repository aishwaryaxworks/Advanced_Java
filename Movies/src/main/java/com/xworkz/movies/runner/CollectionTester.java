package com.xworkz.movies.runner;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.movies.dto.MoviesDTO;
import com.xworkz.movies.enums.Lang;

public class CollectionTester {
	public static void main(String[] args) {
		Collection<MoviesDTO> coll1 = new HashSet<MoviesDTO>();
		Collection<MoviesDTO> country = new HashSet<MoviesDTO>();
		Collection<MoviesDTO> sports = new HashSet<MoviesDTO>();
		Collection<MoviesDTO> twenties = new HashSet<MoviesDTO>();
		Collection<MoviesDTO> thirties = new HashSet<MoviesDTO>();
		Collection<MoviesDTO> forties = new HashSet<MoviesDTO>();

		coll1.add(new MoviesDTO(1, "movie1", "prod1", Lang.ENGLISH, "dir1"));
		coll1.add(new MoviesDTO(2, "movie2", "prod2", Lang.HINDI, "dir2"));
		coll1.add(new MoviesDTO(3, "movie3", "prod3", Lang.KANNADA, "dir3"));
		coll1.add(new MoviesDTO(4, "movie4", "prod4", Lang.KOREAN, "dir1"));
		coll1.add(new MoviesDTO(5, "movie5", "prod5", Lang.HINDI, "dir5"));

		coll1.forEach((p) -> {
			if (p.getDirector().equals("dir1")) {
				System.out.println("All movies from director 1:");
				System.out.println(p);
				country.add(p);
				System.out.println("-------------------------");
			}
		});
		coll1.forEach((p) -> {
			if (p.getLang().equals(Lang.HINDI)) {
				System.out.println("All movies from Hindi:");
				System.out.println(p);
				sports.add(p);
				System.out.println("-------------------------");
			}
		});

		coll1.forEach((p) -> {
			if (p.getId() > 2 && p.getId() < 5) {
				System.out.println("movies between age 2 & 5 :" + p);
				twenties.add(p);
				System.out.println("-------------------------");
			}
		});
		coll1.forEach((p) -> {
			if (p.getId() >= 3) {
				System.out.println("All movies from id 3:" + p);
				thirties.add(p);
				System.out.println("-------------------------");
			}
		});
		coll1.forEach((p) -> {
			if (p.getId() < 4) {
				System.out.println("movies id less than 4:" + p);
				forties.remove(p);
				System.out.println("-------------------------");
			}
		});

		coll1.forEach((abc) -> {
			System.out.println("Newly collected data:" + abc);
			System.out.println("-------------------------");
		});
		
		//Stream API : Sequence of elements
		coll1.stream().filter((e) -> e.getId()>30).forEach((e) -> System.out.println(e.getName()));
		
	}

}
