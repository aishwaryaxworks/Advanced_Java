package com.xworkz.temple.functions;

import java.util.function.Predicate;

public class Tester2 {
	public static void main(String[] args) {
		
		//interface 1
		NewsPaper np = (param1) -> {
			if(param1.equals("TOI")) {
				System.out.println("Times of India, Price:");
				return 8;
			}else if(param1.equals("DH")) {
				System.out.println("Deccan Herald, Price:");
				return 5;
			}else if(param1.equals("HT")) {
				System.out.println("Hindustan Times, Price:");
				return 4;
			}return -1;
		};
		
		paper(np, "TOI");
		paper(np, "DH");
		paper(np, "HT");
		
		System.out.println("------------------------------------");
		
		//interface 2
		IPhone ip = () -> {
			System.out.println("Running abstract method in IPhone interface, using lambda expression...");
			return true;
		};
		
		phone(ip);
		
		System.out.println("------------------------------------");
		
		//interface 3
		Tyre t = (param2, param3, param4) -> {
			if(param2.equals("MRF") && param3 == 17 && param4.equals("TWO")) {
				System.out.println("MRF-17:");
				return 1300;
			}else if(param2.equals("TVS") && param3 == 12 && param4.equals("TWO")) {
				System.out.println("TVS:");
				return 900;
			}else if (param2.equals("MRF") && param3 == 15 && param4.equals("TWO")) {
				System.out.println("MRF-15:");
				return 1500;
			}return -1;
		};
		
		tyreName(t,"MRF", 15, "TWO");
		tyreName(t,"MRF", 17, "TWO");
		tyreName(t,"TVS", 12, "TWO");
		
		System.out.println("------------------------------------");
	
		//Predicate<String> predicate = (p) -> {return true;};
		Predicate<String> predicate1 = (p) -> true;
		Predicate<String> predicate2 = (p) -> 
		{
			return p.equals("Dell");
		};
		
		inbuild(predicate1);
		inbuild(predicate2);
	}
	
	static void paper(NewsPaper np, String agency) {
		double price = np.priceByAgency(agency);
		System.out.println("Price based on agency:"+price);
	}
	
	static void phone(IPhone ip) {
		boolean good = ip.looksGood();
		System.out.println("Interface check:"+good);
	}
	
	static void tyreName(Tyre t, String brand, int size, String type) {
		double price = t.getPrice(brand, size, type);
		System.out.println("Tyre price:"+price);
	}
	
	static void inbuild(Predicate<String> predicate) {
		System.out.println("Predicate...");
	}

}

//jdk1.8 --->
//optional
//default methods
// functional interface
//lambda expressions
//stream
