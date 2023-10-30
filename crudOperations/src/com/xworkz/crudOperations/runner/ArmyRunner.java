package com.xworkz.crudOperations.runner;

import com.xworkz.crudOperations.app.ArmyRepositoryImpl;
import com.xworkz.crudOperations.interfaces.ArmyRepository;

public class ArmyRunner {

	public static void main(String[] args) {
		ArmyRepository army = new ArmyRepositoryImpl();
		army.assigned("Western Command");
		army.assigned("Eastern Command");
		army.assigned("Northern Command");
		army.assigned("Southern Command");
		army.assigned("South Western Command");
		army.assigned("Training Command");
		
		army.display();
	}

}
