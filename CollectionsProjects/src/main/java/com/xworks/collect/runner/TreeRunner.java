package com.xworks.collect.runner;

import java.util.Set;
import java.util.TreeSet;

import com.xworks.collect.dto.GroceryDTO;

public class TreeRunner {

	public static void main(String[] args) {
		Set<Integer> set = new TreeSet<Integer>();
		set.add(56);
		set.add(786);
		set.add(24);
		set.add(7964);
		set.add(123);
		
		set.forEach(e -> System.out.println(e));
		
		Set<GroceryDTO> set2 = new TreeSet<GroceryDTO>((e1,e2) -> Double.compare(e1.getPrice(), e2.getPrice()));
		set2.add(new GroceryDTO("Apple", "Fruit", 50.5, 2));
		set2.add(new GroceryDTO("Rice", "Dal", 75.0, 5));
		set2.add(new GroceryDTO("Wheat", "Dal", 80.0, 10));
		
		set2.forEach(g -> System.out.println(g));
		
	}

}
