package com.xworkz.crudOperations.runner;

import com.xworkz.crudOperations.app.OlympicRepositoryImpl;
import com.xworkz.crudOperations.interfaces.OlympicRepository;

public class OlympicRunner {

	public static void main(String[] args) {
		OlympicRepository oly = new OlympicRepositoryImpl();
		oly.year(2020);
		oly.year(2016);
		oly.year(2012);
		oly.year(2008);
		oly.year(2004);
		oly.year(2000);
		
		oly.display();
	}

}
