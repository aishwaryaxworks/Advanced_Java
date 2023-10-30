package com.xworkz.crudOperations.dto;

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
@ToString
@EqualsAndHashCode

public class CosmeticDTO implements Serializable {
	private String name;
	private String brand;
	private double price;
	
		
	//setter & getters
	//to string
	//equals
	
	//lombok 1.18.28 -> download -> install and specify location of eclipse
	//project -> properties -> java build path -> libraries -> add external jars -> apply
	// on top of class -> @noArgconstructor  , @allArgConstructor , @getter, @setters, @toString, @equalsandHashcode
}
