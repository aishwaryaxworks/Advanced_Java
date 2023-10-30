package com.xworkz.crudOperations.runner;

import com.xworkz.crudOperations.app.HospitalRepositoryImpl;
import com.xworkz.crudOperations.interfaces.HospitalRepository;

public class HospitalRunner {

	public static void main(String[] args) {
		HospitalRepository hosp = new HospitalRepositoryImpl();
		hosp.visited("Apollo Hospital");
		hosp.visited("Manipal Hospital");
		hosp.visited("Fortis Hospital");
		hosp.visited("Narayana Health");
		hosp.visited("Columbia Asia Hospital");
		hosp.visited("KIDVAI Hospital");
		
		hosp.display();

	}

}
