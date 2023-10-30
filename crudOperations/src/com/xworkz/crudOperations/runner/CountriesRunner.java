package com.xworkz.crudOperations.runner;

import com.xworkz.crudOperations.app.CountriesRepositoryImpl;
import com.xworkz.crudOperations.interfaces.CountriesRepository;

public class CountriesRunner {

	public static void main(String[] args) {
		CountriesRepository country = new CountriesRepositoryImpl();
		country.saveCount("Australia");
		country.saveCount("Germany");
		country.saveCount("China");
		country.saveCount("Canada");
		country.saveCount("Bangladesh");
		country.saveCount("Japan");
		country.saveCount("France");
		country.saveCount("Afghanisthan");
		country.saveCount("Denmark");
		country.saveCount("Belgium");
		country.saveCount("Greece");
		
		country.findEndsWith("ny");
		country.isExists("China");
		country.findReturnUpperCase("Japan");
		country.orderAscending();
		country.orderDescending();
		
		country.display();
		
	}

}
