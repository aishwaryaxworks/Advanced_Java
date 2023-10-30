package com.xworkz.crudOperations.runner;

import com.xworkz.crudOperations.app.PoliticianRepositoryImpl;
import com.xworkz.crudOperations.interfaces.PoliticianRepository;

public class PoliticianRunner {

	public static void main(String[] args) {
		PoliticianRepository repo = new PoliticianRepositoryImpl();
		repo.save("DKS");
		repo.save("BSY");
		repo.save("Modi");
		repo.save("Siddu");
		repo.save("HDK");
		repo.save("Deve Gowda");
		repo.save("Amit Shah");
		repo.save("Khejriwal");
		repo.save("Sriramulu");
		repo.save("Bommai");
		repo.save("Mamata Banerjee");
		
		repo.display();
		System.out.println("--------------------");
		
		boolean found = repo.isExists("prathap");
		System.out.println("Found:"+found);
		System.out.println("--------------------");
		
		String res1 = repo.findReturnUpperCase("Bommai");
		System.out.println("Finding Upper Case name:"+res1);
		System.out.println("--------------------");
		
		String[] res2 = repo.findStartsWith("M");
		for(int i=0;i<res2.length;i++) {
			String str = res2[i];
			if(str!=null) {
				System.out.println("Name is:"+str);
			}
		
		}
		
		
	}

}
