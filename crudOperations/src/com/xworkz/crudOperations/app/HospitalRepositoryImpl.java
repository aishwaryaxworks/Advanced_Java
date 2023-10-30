package com.xworkz.crudOperations.app;

import com.xworkz.crudOperations.interfaces.HospitalRepository;

public class HospitalRepositoryImpl implements HospitalRepository {
	private String[] name = new String[MAX];
	private int index=0;
	

	@Override
	public void visited(String name) {
		System.out.println("Patient visited "+name+" hospital.");
		if(this.index<MAX) {
			System.out.println("Hospital name saved at index:"+this.index);
			this.name[index]=name;
			index++;
			System.out.println("Next index is:"+this.index);
		}else {
			System.err.println("Dataset is full ...!");
		}

	}

	@Override
	public void display() {
		System.out.println("invoking display method from repository interface !");
		for(int i=0;i<MAX;i++) {
			System.out.println("Hospital name at index "+i+" is :"+this.name[i]);
		}
	}

}
