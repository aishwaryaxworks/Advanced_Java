package com.xworks.collect.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString

public class GroceryDTO implements Comparable<GroceryDTO>{
	private String name;
	private String type;
	private double price;
	private double quantity;
	
	@Override
	public int compareTo(GroceryDTO o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
