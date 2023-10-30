package com.xworkz.crudOperations.runner;

import com.xworkz.crudOperations.app.CustomerRepositoryImpl;
import com.xworkz.crudOperations.dto.CustomerDTO;
import com.xworkz.crudOperations.interfaces.CustomerRepository;

public class CustomerRunner {

	public static void main(String[] args) {
		CustomerDTO cdto1 = new CustomerDTO("Aishwarya","abc@gmail.com","Banglore",false);
		CustomerDTO cdto2 = new CustomerDTO("Ravi","bcd@gmail.com","blore",true);
		System.out.println(cdto1); /* ??shows default toString : FQN@hexadecimal */
		
		CustomerRepository crep = new CustomerRepositoryImpl();
		crep.save(cdto1);
		crep.save(cdto2);
		
	}

}
