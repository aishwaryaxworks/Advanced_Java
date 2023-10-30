package com.xworks.collect.runner;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Optional;
import java.util.stream.Collectors;

import com.xworks.collect.dto.ActorDTO;

public class CollectionsClass {
	public static void main(String[] args) {
		Collection<Integer> collection = new LinkedList<Integer>();
		collection.add(654);
		collection.add(64);
		collection.add(54);
		collection.add(6);
		collection.add(7);
		collection.add(8);
		collection.add(7);

		collection.stream().filter(r -> r.equals(7)).collect(Collectors.toList()).forEach(System.out::println);
		// the above is the same as below
		boolean check1 = collection.contains(7);
		System.out.println(check1);

//		 data :---> primitive : simple values non primitive : complex or different
//		 types of data (ex : dtos, classes)

		Collection<ActorDTO> actor = new LinkedList<ActorDTO>();
		actor.add(new ActorDTO(1, "actor1", "Kannada", "Female", "India"));
		actor.add(new ActorDTO(2, "actor2", "Kannada", "Female", "India"));
		actor.add(new ActorDTO(3, "actor3", "Kannada", "Female", "India"));
		actor.add(new ActorDTO(4, "actor4", "Kannada", "Female", "India"));

		Optional<ActorDTO> optional = actor.stream().filter(a -> a.getId() == 2 && a.getCountry().equals("India")).findFirst();
		System.out.println(optional.isPresent());

		// or do as below
		boolean contain = actor.contains(new ActorDTO(2, "actor2", "Kannada", "Female", "India"));
		System.out.println(contain);
		
		actor.remove(new ActorDTO(3, "actor3", "Kannada", "Female", "India"));
		
		//contains method and remove method always depends on the dto's "equals" method internally. Hence we MUST override it.
	}

}
