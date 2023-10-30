package com.xworkz.crudOperations.runner;

import com.xworkz.crudOperations.app.ApartmentRepositoryImp;
import com.xworkz.crudOperations.interfaces.ApartmentRepository;

public class ApartmentRunner {
	public static void main(String[] args) {
		ApartmentRepository ap = new ApartmentRepositoryImp();
		ap.room("Bed");
		ap.room("Puja");
		ap.room("Living");
		ap.room("Kitchen");
		ap.room("Bath");
		ap.room("2nd Bed");
		
		ap.display();				
	}

}
