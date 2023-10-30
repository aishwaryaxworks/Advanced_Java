package com.xworkz.springProject.app;

public class Dussehra implements Festival{

	@Override
	public void celebrate() {
		System.out.println("Celebrating method - Dussehra");
	}

	@Override
	public void doPooja() {
		System.out.println("Do pooja - Dussehra");
	}

}
