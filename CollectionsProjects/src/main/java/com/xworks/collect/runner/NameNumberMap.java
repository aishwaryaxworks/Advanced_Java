package com.xworks.collect.runner;

import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class NameNumberMap {

	public static void main(String[] args) {
		Map<String, String> nameNumber = new HashMap<String, String>();
		nameNumber.put("6201279480", "Ravi");
		nameNumber.put("6379589419", "Hari");
		nameNumber.put("7676739420", "Sagar");
		nameNumber.put("9900236481", "Sarvesh");
		nameNumber.put("8217634102", "Aishwarya");
		nameNumber.put("8217634102L", "abcdefghijklmnopqrstuvwxyz");
		
		Collection<Entry<String, String>> nm = nameNumber.entrySet();
		nm.forEach(n -> System.out.println(n.getValue()));
		
		//Collect all names with more than 10 char
		List<String> nameLongerThan10 = nm.stream()
				.filter(a -> a.getValue().length() > 10).map(n -> n.getValue())
				.collect(Collectors.toList());
		nameLongerThan10.forEach(a -> System.out.println(a));
		System.out.println("-----------------------------------");
		
		//Collect all names less than 10 char
		List<String> nameShorterThan10 = nm.stream()
				.filter(a -> a.getValue().length() < 10).map(n -> n.getValue())
				.collect(Collectors.toList());
		nameShorterThan10.forEach(a -> System.out.println(a));
		System.out.println("-----------------------------------");
		
		//Collect all names in upper case
		List<String> nameUpper = nm.stream().sorted((n1,n2) -> n1.getValue().compareTo(n2.getValue()))
				.map(a -> a.getValue().toUpperCase())
				.collect(Collectors.toList());
		nameUpper.forEach(a -> System.out.println(a));
		System.out.println("-----------------------------------");
		
		//Collect all mobile ending with 0
		Collection<Entry<String, String>> endsWith = nm.stream()
				.filter(p -> p.getKey().endsWith("0"))
				.collect(Collectors.toList());
		endsWith.forEach(p -> System.out.println(p));
		System.out.println("-----------------------------------");
		
		//Collect all mobile starting with 8
		Collection<Entry<String, String>> startsWith = nm.stream()
				.filter(p -> p.getKey().startsWith("8"))
				.collect(Collectors.toList());
		startsWith.forEach(p -> System.out.println(p));
		System.out.println("-----------------------------------");
		
	}

}
