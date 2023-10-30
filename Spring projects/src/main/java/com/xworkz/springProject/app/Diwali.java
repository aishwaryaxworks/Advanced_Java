package com.xworkz.springProject.app;

public class Diwali implements Festival {

	@Override
	public void celebrate() {
		System.out.println("Celbrate method - Diwali");
	}

	@Override
	public void doPooja() {
		System.out.println("do pooja - diwali");
	}

}
