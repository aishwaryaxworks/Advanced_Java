package com.xworkz.grocery.runner;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.repo.GroceryRepo;
import com.xworkz.grocery.repo.GroceryRepoImpl;

public class GroceryRunner {

	public static void main(String[] args) {
		GroceryDTO gdto1 = new GroceryDTO("Apple","Fruits",25.50,5);
		GroceryDTO gdto2 = new GroceryDTO("Carrot","Vegetable",20,5);
		System.out.println(gdto1);
		
		GroceryRepo grepo = new GroceryRepoImpl();
		grepo.save(gdto1);
		grepo.save(gdto2);
	}

}
