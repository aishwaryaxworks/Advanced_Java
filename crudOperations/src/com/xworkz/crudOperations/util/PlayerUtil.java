package com.xworkz.crudOperations.util;

public class PlayerUtil {
	public static boolean validate(String str) {
		if(str != null && !str.isEmpty() && str.length()>3 && str.length()<40) {
			return true;
		}else {
			System.err.println(str);
		}
		return true;
	}
}
