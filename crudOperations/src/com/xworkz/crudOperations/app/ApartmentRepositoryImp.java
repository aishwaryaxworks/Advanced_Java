package com.xworkz.crudOperations.app;

import com.xworkz.crudOperations.interfaces.ApartmentRepository;

public class ApartmentRepositoryImp implements ApartmentRepository {
	private String[] roomName = new String[ROOMS];
	private int index=0;

	@Override
	public void room(String name) {
		System.out.println("This is "+name+" room");
		if(this.index<ROOMS) {
			System.out.println("Room saved at:"+this.index);
			this.roomName[index]=name;
			index++;
			System.out.println("Next index is:"+this.index);
		}else {
			System.err.println("Dataset is full ...!");
		}

	}

	@Override
	public void display() {
		System.out.println("invoking display method from repository interface !");
		for(int i=0;i<ROOMS;i++) {
			System.out.println("Room name at index "+i+" is: "+this.roomName[i]+" room");
		}
	}

}
