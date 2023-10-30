package com.xworks.collect.runner;

import java.util.ArrayList;
import java.util.List;

public class ListRunner {

	public static void main(String[] args) {
		List<String> movies = new ArrayList<String>();
		//index based
		movies.add("Spider Man");
		movies.add("One piece");
		movies.add(1, "Jailer");
		movies.add(0, "Jawan");
		
		movies.forEach(m -> System.out.println(m));
	}

}
