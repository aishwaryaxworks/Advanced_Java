package com.xworkz.crudOperations.runner;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateRunner {

	public static void main(String[] args) {
		//ctrl+shift+T ---> class searching
		//decompiler or source code or javadoc
		//feature of jdk 1.8
		LocalDate ld = LocalDate.now();    //current date
		System.out.println(ld);
		System.out.println(ld.getEra());
		
		//saving dob ---> saving past or future dates
		System.out.println("Past date:"+ld.of(2002, 9, 11));
		System.out.println("Future date:"+ld.of(2023, 9, 10));
		
		//comparing two dates
		LocalDate ld2 = LocalDate.of(1997, 6, 4);
		
		boolean check1 = ld2.isAfter(ld);
		boolean check2 = ld2.isBefore(ld);
		boolean check3 = ld2.isEqual(ld);
		System.out.println("Check is after: "+check1);
		System.out.println("Check is before: "+check2);
		System.out.println("Check is equal: "+check3);
		
		LocalDateTime ldt = LocalDateTime.now();
		System.out.println(ldt);
		System.out.println(ldt.getDayOfWeek());
		System.out.println(ldt.getDayOfWeek().toString().toLowerCase());
		
		LocalDateTime past = LocalDateTime.of(1968, 6, 25, 7, 37);
		System.out.println("Past date time: "+past);
		
		LocalDateTime future = LocalDateTime.of(2024, 6, 25, 7, 37);
		System.out.println("Future date time: "+future);
		
		boolean check4 = ldt.isAfter(past);
		System.out.println("Check is after: "+check4);
		
		boolean check5 = ldt.isBefore(future);
		System.out.println("Check is before: "+check5);
		
		boolean check6 = ldt.isEqual(ldt);
		System.out.println("Check is equal: "+check6);
	}
}
