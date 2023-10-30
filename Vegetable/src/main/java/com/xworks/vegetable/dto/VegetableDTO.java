package com.xworks.vegetable.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@EqualsAndHashCode
@ToString

//@Data

public class VegetableDTO implements Comparable<VegetableDTO>{
	private int id;
	private String name;
	private double price;
	private double weight;
	
	@Override
	public int compareTo(VegetableDTO arg) {
		//System.out.println("comparable based on id is running... ====> ascending");
		VegetableDTO current = this;
//		if(current.getId()==arg.getId()) {
//			return 0;
//		}else if(current.getId()>arg.getId()) {
//			return 1;
//		}else if(current.getId()<arg.getId()) {
//			return -1;
//		}
//		throw new IllegalArgumentException("Cannot sort this list...");
//		
		System.out.println("comparable based on name is running... ====> ascending");
		return current.getName().compareTo(arg.getName());
	}
	
}
