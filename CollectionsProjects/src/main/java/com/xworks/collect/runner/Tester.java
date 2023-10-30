package com.xworks.collect.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworks.collect.dto.ActorDTO;

public class Tester {

	public static void main(String[] args) {
		ActorDTO dto1 = new ActorDTO(1, "Leonardo DiCaprio", "English", "Male", "United States");
		ActorDTO dto2 = new ActorDTO(2, "Penélope Cruz", "Spanish", "Female", "Spain");
		ActorDTO dto3 = new ActorDTO(3, "Shah Rukh Khan", "Hindi", "Male", "India");
		ActorDTO dto4 = new ActorDTO(4, "Cate Blanchett", "English", "Female", "Australia");
		ActorDTO dto5 = new ActorDTO(5, "Jackie Chan", "Mandarin", "Male", "China");
		ActorDTO dto6 = new ActorDTO(6, "Isabelle Huppert", "French", "Female", "France");
		ActorDTO dto7 = new ActorDTO(7, "Antonio Banderas", "Spanish", "Male", "Spain");
		ActorDTO dto8 = new ActorDTO(8, "Charlize Theron", "Afrikaans", "Female", "South Africa");
		ActorDTO dto9 = new ActorDTO(9, "Gael García Bernal", "Spanish", "Male", "Mexico");
		ActorDTO dto10 = new ActorDTO(10, "Tilda Swinton", "English", "Female", "United Kingdom");
		ActorDTO dto11 = new ActorDTO(11, "Cate Blanchett", "English", "Female", "Australia");
		ActorDTO dto12 = new ActorDTO(12, "Jackie Chan", "Mandarin", "Male", "China");
		ActorDTO dto13 = new ActorDTO(13, "Isabelle Huppert", "French", "Female", "France");

		Collection<ActorDTO> collection = new HashSet<ActorDTO>();
		collection.add(dto1);
		collection.add(dto2);
		collection.add(dto3);
		collection.add(dto4);
		collection.add(dto5);
		collection.add(dto6);
		collection.add(dto7);
		collection.add(dto8);
		collection.add(dto9);
		collection.add(dto10);
		collection.add(dto11);
		collection.add(dto12);
		collection.add(dto13);

		System.out.println("====================");
		System.out.println("<<<----sort ascending---->>>");
		collection.stream().sorted().forEach(b -> System.out.println(b));

		// Mapping
		System.out.println("====================");
		System.out.println("<<<----Using Map methods---->>>");

		System.out.println("====================");
		System.out.println("<<<----Collect only unique actors using map and collect---->>>");
		Set<String> actors = collection.stream().sorted((a1, a2) -> a2.getName().compareTo(a1.getName()))
				.map(ref -> ref.getName()).collect(Collectors.toSet());

		actors.forEach(b -> System.out.println(b));

		System.out.println("====================");
		System.out.println("<<<----Collect actors in descending and then print only names---->>>");
		List<String> l1 = collection.stream().sorted((a1, a2) -> a2.getName().compareTo(a1.getName()))
				.map(ref -> ref.getName()).collect(Collectors.toList());
		l1.forEach(e -> System.out.println(e));

		System.out.println("====================");
		System.out.println("<<<----Collect only ids in ascending order and print using map and collect---->>>");
		collection.stream().sorted((i1, i2) -> i1.getId().compareTo(i2.getId())).map(i -> i.getId())
				.collect(Collectors.toList()).forEach(i -> System.out.println(i));

		System.out.println("====================");
		System.out.println("<<<----Collect all actors in ascending order by lang and print using map and collect---->>>");
		collection.stream()
		.sorted((lang1,l2) -> lang1.getLang().compareTo(l2.getLang()))
		.map(l -> l.getName())
		.collect(Collectors.toList()).forEach(l -> System.out.println(l));
		
		System.out.println("====================");
		System.out.println("<<<----Collect all actors in descending order by lang and print using map and collect---->>>");
		collection.stream()
		.sorted((lang1,l2) -> l2.getLang().compareTo(lang1.getLang()))
		.map(l -> l.getName())
		.collect(Collectors.toList()).forEach(l -> System.out.println(l));
		
		System.out.println("====================");
		System.out.println("<<<----Collect all actors who are male and print using map and collect---->>>");
		collection.stream().filter(g -> g.getGender().equals("Male"))
		.map(g -> g.getName())
		.collect(Collectors.toList()).forEach(g -> System.out.println(g));
		
		System.out.println("====================");
		System.out.println("<<<----Collect all actors who are female, sort in ascending and print using map and collect---->>>");
		collection.stream()
		.filter(g -> g.getGender().equals("Female")).sorted((g1,g2)-> g1.getGender().compareTo(g2.getGender()))
		.map(g -> g.getName())
		.collect(Collectors.toList()).forEach(g -> System.out.println(g));
		
		System.out.println("====================");
		System.out.println("<<<----Filter and collect by country & print using map and collect---->>>");
		Long count = collection.stream()
		.filter(g -> g.getCountry().equals("France")).count();
		System.out.println("Count:"+count);
		
		System.out.println("====================");
		System.out.println("<<<----Filter and collect by id > 5 & print using map and collect---->>>");
		collection.stream()
		.filter(g -> g.getId()>5)
		.sorted((i1,i2) -> i1.getName().compareTo(i2.getName()))
		.map(g -> g.getName())
		.collect(Collectors.toList()).forEach(g -> System.out.println(g));
		
	}

}
