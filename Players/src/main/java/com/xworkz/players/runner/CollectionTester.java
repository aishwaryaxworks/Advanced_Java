package com.xworkz.players.runner;

import java.util.Collection;
import java.util.HashSet;

import com.xworkz.players.dto.PlayersDTO;
import com.xworkz.players.enums.Sport;

public class CollectionTester {
	public static void main(String[] args) {
		Collection<PlayersDTO> coll1 = new HashSet<PlayersDTO>();
		Collection<PlayersDTO> country = new HashSet<PlayersDTO>();
		Collection<PlayersDTO> sports = new HashSet<PlayersDTO>();
		Collection<PlayersDTO> twenties = new HashSet<PlayersDTO>();
		Collection<PlayersDTO> thirties = new HashSet<PlayersDTO>();
		Collection<PlayersDTO> forties = new HashSet<PlayersDTO>();

		coll1.add(new PlayersDTO(1, "player1", "India", Sport.BADMINTON, 20));
		coll1.add(new PlayersDTO(2, "player2", "West Indies", Sport.CRICKET, 30));
		coll1.add(new PlayersDTO(3, "player3", "India", Sport.SOCCER, 40));
		coll1.add(new PlayersDTO(4, "player4", "Spain", Sport.BASEBALL, 25));
		coll1.add(new PlayersDTO(5, "player5", "China", Sport.CRICKET, 50));

		coll1.forEach((p) -> {
			if (p.getCountry().equals("India")) {
				System.out.println("All players from Country India:");
				System.out.println(p);
				country.add(p);
				System.out.println("-------------------------");
			}
		});
		coll1.forEach((p) -> {
			if (p.getSport().equals(Sport.CRICKET)) {
				System.out.println("All players from Cricket:");
				System.out.println(p);
				sports.add(p);
				System.out.println("-------------------------");
			}
		});

		coll1.forEach((p) -> {
			if (p.getAge() > 20 && p.getAge() < 30) {
				System.out.println("Players between age 20 & 30 :" + p);
				twenties.add(p);
				System.out.println("-------------------------");
			}
		});
		coll1.forEach((p) -> {
			if (p.getAge() >= 30) {
				System.out.println("All players aged 30 and above:" + p);
				thirties.add(p);
				System.out.println("-------------------------");
			}
		});
		coll1.forEach((p) -> {
			if (p.getAge() > 40) {
				System.out.println("Players aged above 40:" + p);
				forties.remove(p);
				System.out.println("-------------------------");
			}
		});

		coll1.forEach((abc) -> {
			System.out.println("Newly collected data:" + abc);
			System.out.println("-------------------------");
		});
		
		//Stream API : Sequence of elements
		coll1.stream().filter((e) -> e.getAge()>30).forEach((e) -> System.out.println(e.getName()));
		
	}

}
