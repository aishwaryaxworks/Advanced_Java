package com.xworkz.crudOperations.runner;

import com.xworkz.crudOperations.random.Bag;
import com.xworkz.crudOperations.random.Box;

public class BagRunner {
	public static void main(String[] args) {
		Box box = new Box();
		Bag bag1 = new Bag(box);
		bag1.keepFood();  //Null pointer exception --->>> since box in bag is not referenced to any value 
						  //it will be pointing to null value
	}

}
