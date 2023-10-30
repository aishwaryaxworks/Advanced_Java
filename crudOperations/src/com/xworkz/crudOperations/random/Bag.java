package com.xworkz.crudOperations.random;

public class Bag {
	
	/* initialising box --> 2 ways : methods , constructor */
	
	private Box box; //variable of type Box  //encapsulation
	//association ==>> to use members of the class without inheritance
	
	public Bag(Box box) {
		this.box=box;
	}
	
	public void keepFood() {
		System.out.println("invoking keep food...");
		box.store();
	}

}
