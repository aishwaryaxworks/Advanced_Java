package com.xworkz.crudOperations.interfaces;

public interface PoliticianRepository {
	int TOTAL_ITEMS =10;
	
	void save(String name);
	
	default boolean isExists(String name) {
		return false;
	}
	
	default boolean isExistsIgnoreCase(String name) {
		return false;
	}
	
	default String findReturnUpperCase(String name) {
		return null;
	}
	
	default String[] findStartsWith(String name) {
		return null;
	}
	
	void display();
}
