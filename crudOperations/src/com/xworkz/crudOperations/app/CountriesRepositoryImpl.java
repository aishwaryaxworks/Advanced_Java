package com.xworkz.crudOperations.app;

import java.util.Arrays;
import java.util.Collections;

import com.xworkz.crudOperations.interfaces.CountriesRepository;

public class CountriesRepositoryImpl implements CountriesRepository {

	private String[] country = new String[ITEMS];
	private int index=0;
	private int countryCount=0;

	@Override
	public void saveCount(String name) {
		System.out.println("Count saving method of Countries Repository, Country name:"+name);
		if(this.index<ITEMS) {
			System.out.println("Number of countries saved:"+this.countryCount);
			System.out.println("Country saved at index:"+this.index);
			this.country[index]=name;
			this.countryCount++;
			index++;
			System.out.println("Next index will be:"+this.index);
		}else {
			System.err.println("Dataset is full ...!");
		}
	}

	@Override
	public String findReturnUpperCase(String name) {
		for(int i=0; i<ITEMS;i++) {
			String str2=country[i];
			if(str2.equals(name)) {
				return str2.toUpperCase();
			}
		}
		return null;
	}
	
	@Override
	public String[] findStartsWith(String name) {
		String[] temp = new String[ITEMS];
		int tempIndex=0;
		
		for(int i=0;i<ITEMS;i++) {
			String str3 = this.country[i];
			
			if(str3.startsWith(name)) {
				temp[tempIndex]=str3;
				tempIndex++;
			}
		}
		return temp;
	}
	
	@Override
	public String[] findEndsWith(String name) {
		String[] temp = new String[ITEMS];
		int tempIndex=0;
		
		for(int i=0;i<ITEMS;i++) {
			String str4 = this.country[i];
			
			if(str4.endsWith(name)) {
				temp[tempIndex]=str4;
				tempIndex++;
			}
		}
		return temp;
	}
	
	@Override
	public String[] orderAscending() {
		Arrays.sort(country);
		System.out.println(Arrays.toString(country));
		return null;
	}
	
	@Override
	public String[] orderDescending() {
		Arrays.sort(country, Collections.reverseOrder());
		System.out.println(Arrays.toString(country));
		return null;
	}
	
	@Override
	public boolean isExists(String name) {
		for(int i=0;i<ITEMS;i++) {
			String ref = this.country[i];
			System.out.println("Trying to match ref "+ref);
			if(ref.equals(name)) {
				System.out.println("Name mached with ref :"+ref);
				return true;
			}else {
				System.out.println("Name not matched ...!");
			}
		}
		return false;
	}

	@Override
	public void display() {
		System.out.println("invoking display method from repository interface !");
		for(int i=0;i<ITEMS;i++) {
			System.out.println("Country name at index "+i+" is :"+this.country[i]);
		}
	}

}
