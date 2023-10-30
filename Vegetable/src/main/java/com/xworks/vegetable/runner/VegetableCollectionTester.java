package com.xworks.vegetable.runner;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

import com.xworks.vegetable.dto.VegetableDTO;
import com.xworks.vegetable.repository.VegetableRepo;
import com.xworks.vegetable.repository.VegetableRepoImpl;

public class VegetableCollectionTester {
	public static void main(String[] args) {
		VegetableDTO vdto1 = new VegetableDTO(1,"Carrot",25,2.5);
		VegetableDTO vdto2 = new VegetableDTO(2,"Broccoli",40,2);
		VegetableDTO vdto3 = new VegetableDTO(3,"Beans",120,1.5);
		VegetableDTO vdto4 = new VegetableDTO(4,"Beet",15,3);
		VegetableDTO vdto5 = new VegetableDTO(5,"Raddish",30,1);
		
		VegetableRepo vrepo = new VegetableRepoImpl();
		vrepo.save(vdto1);
		vrepo.save(vdto2);
		vrepo.save(vdto3);
		vrepo.save(vdto4);
		vrepo.save(vdto5);
		
		Collection<VegetableDTO> tester = new HashSet<VegetableDTO>();
		tester.add(vdto1);
		tester.add(vdto2);
		tester.add(vdto3);
		System.out.println("Collection size: "+tester.size());
		
		tester.addAll(tester);
		System.out.println("Collection size: "+tester.size());
		
		for(VegetableDTO vdto : tester) {
			System.out.println(vdto.getName());
			if(vdto.getName().equals("Carrot")) {
				tester.remove(vdto);
				System.out.println(vdto);
			}else if(vdto.getName().equals("Beet")) {
				tester.remove(vdto);
				System.out.println("Collection size: "+tester.size());
			}else if(vdto.getName().equals("Beans")) {
				tester.removeAll(tester);
				System.out.println("Collection size: "+tester.size());
			} else if(vdto.getName().equals("Broccoli")) {
				tester.retainAll(tester);
			}
			System.out.println("Collection size: "+tester.size());
			System.out.println("Is tester collection empty? : "+tester.isEmpty());
			System.out.println("Checking for CONTAINS ALL : "+tester.containsAll(tester));
		}
		
		System.out.println("----Iterator----");
		Iterator<VegetableDTO> itr = tester.iterator();
		while(itr.hasNext()) {
			VegetableDTO elem = itr.next();
			System.out.println(elem.getName());
			
			if(elem.getName().equals("Raddish")) {
				itr.remove();
			}
		}
				
		System.out.println(tester.toArray());
	}
}
