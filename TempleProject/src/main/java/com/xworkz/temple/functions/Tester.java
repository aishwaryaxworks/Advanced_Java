package com.xworkz.temple.functions;

public class Tester {
	public static void main(String[] args) {
		
		//interface 1
		Goat goat = () -> {
			System.out.println("Running abstract method in Goat interface, using lambda expression...");
			return true;
		};
		
		call(goat);
		
		//interface 2
		Rain rain = (place) -> {
			if(place.equals("BLR")) {
				return 10;
			}else if(place.equals("DEL")) {
				return 30;
			}else if(place.equals("GOA")) {
				return 10;
			}return -1;
		};
		
		check(rain,"BLR");
		check(rain,"GOA");
	}

	static void call(Goat goat) {
		boolean check = goat.alive();
		System.out.println("Check :" + check);
		goat.run();
	}
	
	static void check(Rain rain, String place) {
		double val = rain.getMeasurement(place);
		System.out.println("Measurement is:"+val);
	}
}
