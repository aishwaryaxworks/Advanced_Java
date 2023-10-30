package com.xworkz.crudOperations.app;

import com.xworkz.crudOperations.interfaces.OlympicRepository;

public class OlympicRepositoryImpl implements OlympicRepository {
	private int[] year= new int[MAX];
	private int index=0;

	@Override
	public void year(int year) {
		System.out.println("Olympic year:"+year);
		if(this.index<MAX) {
			System.out.println("Olympic year is saved at index:"+this.index);
			this.year[index]=year;
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
			System.out.println("Olympic year at index "+i+" is :"+this.year[i]);
		}
	}

}
