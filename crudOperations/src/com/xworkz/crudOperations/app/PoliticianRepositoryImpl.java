package com.xworkz.crudOperations.app;

import com.xworkz.crudOperations.interfaces.PoliticianRepository;

public class PoliticianRepositoryImpl implements PoliticianRepository {

	private String[] names = new String[TOTAL_ITEMS];
	private int index=0;

	@Override
	public void save(String name) {
		System.out.println("Save method of Politician Repository, Name saved:"+name);
		if(this.index<TOTAL_ITEMS) {
			System.out.println("Name saved at index:"+this.index);
			this.names[index] = name;
			index++;
			System.out.println("Next index is:"+this.index);
		}else {
			System.err.println("Dataset is full ...!");
		}
	}
	
	@Override
	public boolean isExists(String name) {
		for(int i=0;i<TOTAL_ITEMS;i++) {
			String ref = this.names[i];
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
	public boolean isExistsIgnoreCase(String name) {
		for(int i=0;i<TOTAL_ITEMS;i++) {
			String str = names[i];
			if(str.equalsIgnoreCase(name)) {
				System.out.println("Name mached with ref :"+str);
				return true;
			}else {
				System.out.println("Name not matched...!");
			}
		}
		return false;
	}
	
	@Override
	public String findReturnUpperCase(String name) {
		for(int i=0; i<TOTAL_ITEMS;i++) {
			String str2=names[i];
			if(str2.equals(name)) {
				return str2.toUpperCase();
			}
			
		}
		return null;
	}
	
	@Override
	public String[] findStartsWith(String name) {
		String[] temp = new String[TOTAL_ITEMS];
		int tempIndex=0;
		
		for(int i=0;i<TOTAL_ITEMS;i++) {
			String str3 = this.names[i];
			
			if(str3.startsWith(name)) {
				temp[tempIndex]=str3;
				tempIndex++;
			}
		}
		return temp;
	}

	@Override
	public void display() {
		System.out.println("invoking display method from repository interface !");
		for(int i=0;i<TOTAL_ITEMS;i++) {
			System.out.println("Politician name at index "+i+" is :"+this.names[i]);
		}
	}

}
