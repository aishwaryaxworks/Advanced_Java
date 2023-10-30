package com.xworks.vegetable.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import com.xworks.vegetable.dto.BrandDTO;

public class BrandTester {

	public static void main(String[] args) {
		BrandDTO dto1 = new BrandDTO("Nike", "Phil Nike", 30.7, "USA");
		BrandDTO dto2 = new BrandDTO("Google", "Sundar Pichai", 280.0, "USA");
		BrandDTO dto3 = new BrandDTO("Titan", "Tata", 5.1, "India");
		BrandDTO dto4 = new BrandDTO("Apple", "Tim Cook", 800.0, "USA");
		BrandDTO dto5 = new BrandDTO("Tesla", "Elon Musk", 8.14, "USA");
		BrandDTO dto6 = new BrandDTO("Christian Dior", "Christian Dior", 253.0, "France");
		BrandDTO dto7 = new BrandDTO("Tommy Hilfiger", "Tommy Hilfiger", 4.7, "USA");
		BrandDTO dto8 = new BrandDTO("MAC", "Frank Toskan", 2.11, "USA");
		BrandDTO dto9 = new BrandDTO("Valentino", "Valentino", 2.13, "Italy");
		BrandDTO dto10 = new BrandDTO("Gucci", "Guccio Gucci", 10.49, "Italy");

		Collection<BrandDTO> collection = new HashSet<BrandDTO>();
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

		System.out.println("====================");
		System.out.println("<<<----sort ascending---->>>");
		collection.stream().sorted().forEach(b -> System.out.println(b));

		System.out.println("====================");
		System.out.println("<<<----revenue greater than 20---->>>");
//		List<BrandDTO> l1 = collection
//				.stream()
//				.filter((e) -> e.getRevenue() > 20)
//				.collect(Collectors.toList())
//				.forEach((e) -> System.out.println(e));;
//				
		collection.stream().filter((e) -> e.getRevenue() > 20).collect(Collectors.toList())
		.forEach((e) -> System.out.println(e));

		System.out.println("====================");
		System.out.println("<<<----revenue lesser than 20---->>>");
		List<BrandDTO> l2 = collection.stream().filter((e) -> e.getRevenue() < 20).collect(Collectors.toList());
		l2.forEach((e) -> System.out.println(e));
		
		System.out.println("====================");
		System.out.println("<<<----all brands from USA---->>>");
		List<BrandDTO> l3 = collection.stream().filter((e) -> e.getCountry().equals("USA")).collect(Collectors.toList());
		l3.forEach((e) -> System.out.println(e));
		
		System.out.println("====================");
		System.out.println("<<<----all brands not from USA---->>>");
		List<BrandDTO> l4 = collection.stream().filter((e) -> !e.getCountry().equals("USA")).collect(Collectors.toList());
		l4.forEach((e) -> System.out.println(e));
		
		System.out.println("====================");
		System.out.println("<<<----all brands from country names starting with I---->>>");
		List<BrandDTO> l5 = collection.stream().filter((e) -> e.getCountry().startsWith("I")).collect(Collectors.toList());
		l5.forEach((e) -> System.out.println(e));
		
		System.out.println("====================");
		System.out.println("<<<----all brands with owner name length greater than 5---->>>");
		List<BrandDTO> l6 = collection.stream().filter((e) -> e.getOwner().length()>5).collect(Collectors.toList());
		l6.forEach((e) -> System.out.println(e));
		
		System.out.println("====================");
		System.out.println("<<<----all brands with owner name length lesser than than 5---->>>");
		List<BrandDTO> l7 = collection.stream().filter((e) -> e.getOwner().length()<5).collect(Collectors.toList());
		l7.forEach((e) -> System.out.println(e));
		
		System.out.println("====================");
		System.out.println("<<<----Comparator to sort---->>>");
		collection.stream().sorted((b1,b2) -> b1.getCountry().compareTo(b2.getCountry())).forEach(b -> System.out.println(b));
		
		System.out.println("====================");
		System.out.println("<<<----revenue by descending using comparable---->>>");
		collection.stream().sorted((e1,e2) -> e2.getRevenue().compareTo(e1.getRevenue())).forEach(e -> System.out.println(e));
		
		//Mapping
		System.out.println("====================");
		System.out.println("<<<----Using Map methods---->>>");
		
		collection
		.stream()
		.map(brand -> {
			return brand.getName().toUpperCase();
		})
		.forEach(b -> System.out.println(b));
		
		System.out.println("====================");
		System.out.println("<<<----Using Map methods to get only revenue---->>>");
		collection
		.stream()
		.map(element -> element.getRevenue())
		.forEach(b -> System.out.println(b));
		
		System.out.println("====================");
		System.out.println("<<<----Collect all unique countries using map and collect---->>>");
		Set<String> countries = collection
				.stream()
				.map(ref -> ref.getCountry())
				.collect(Collectors.toSet());
		
		countries.forEach(b -> System.out.println(b));
		
		
		
		}

}
