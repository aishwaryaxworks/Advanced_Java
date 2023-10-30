package com.xworkz.temple.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repository.TempleRepo;
import com.xworkz.temple.repository.TempleRepoImpl;

public class CollectionTester {
	public static void main(String[] args) {
		TempleDTO tdto1 = new TempleDTO("abc", "def", "ghi", 1996, "jkl");
		TempleDTO tdto2 = new TempleDTO("xyz", "def", "ghi", 1996, "jkl");
		TempleDTO tdto3 = new TempleDTO("cde", "def", "ghi", 1996, "jkl");
		TempleDTO tdto4 = new TempleDTO("efg", "def", "ghi", 1996, "jkl");
		System.out.println(tdto1);
		
		TempleRepo trepo = new TempleRepoImpl();
		trepo.save(tdto1);
		trepo.save(tdto2);
		
		Collection<TempleDTO> collection = new HashSet<TempleDTO>();
		collection.add(tdto1);
		collection.add(tdto2);
		collection.add(tdto3);
		collection.add(tdto4);
		
		System.out.println("Total entries:"+collection.size());
		
		//access elements: " for each loop " or "iterator()" or "stream" or "forEach method"
		for(TempleDTO tdto:collection) {
			System.out.println(tdto.getName());
			if(tdto.getName().equals("cde")) {
				collection.remove(tdto);
			}
		}
		
		System.out.println("----ITERATOR----");
		//abstraction
		Iterator<TempleDTO> iterator = collection.iterator();
		while(iterator.hasNext()) {
			TempleDTO elem = iterator.next();
			System.out.println(elem.getName());
			
			if (elem.getName().equals("cde")) {
				iterator.remove();
			}
		}
		
	}
}
