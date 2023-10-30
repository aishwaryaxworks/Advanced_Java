package com.xworkz.crudOperations.interfaces;

import com.xworkz.crudOperations.dto.CustomerDTO;

public interface CustomerRepository {
	int ITEMS=5;
	
	void save(CustomerDTO cdto);

}
