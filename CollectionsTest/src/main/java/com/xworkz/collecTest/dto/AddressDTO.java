package com.xworkz.collecTest.dto;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString
@Setter
@Getter

public class AddressDTO {
	private Integer id;
	private Integer doorNumber;
	private String street;
	private String city;
	private String state;
	private Integer pincode;

}
