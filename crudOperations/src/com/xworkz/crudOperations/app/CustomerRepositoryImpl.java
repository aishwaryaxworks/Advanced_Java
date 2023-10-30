package com.xworkz.crudOperations.app;

import com.xworkz.crudOperations.dto.CustomerDTO;
import com.xworkz.crudOperations.interfaces.CustomerRepository;

public class CustomerRepositoryImpl implements CustomerRepository {
	
	private CustomerDTO[] cdto = new CustomerDTO[ITEMS];
	private int index = 0;

	@Override
	public void save(CustomerDTO cdto) {
		
		System.out.println("Invoking save method");
		System.out.println("Customer saved:"+cdto);
		if(this.index<ITEMS) {
			this.cdto[index]=cdto;
			System.out.println("Customer saved at:"+this.index);
			index++;
		}else {
			System.err.println("Dataset is full...");
		}
	}

}
