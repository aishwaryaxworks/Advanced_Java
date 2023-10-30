package com.xworkz.crudOperations.util;

public class ValidateUtil {

	public static boolean validateString(String name) {
		if(name!=null && !name.isEmpty() && name.length()>3 && name.length()<30) {
			System.out.println("Name is valid...");
		}else {
			System.err.println("Name is invalid...");
		}
		return false;
	}

}
