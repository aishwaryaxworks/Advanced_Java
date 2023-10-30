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

public class BrandDTO {
	private Integer id;
	private String name;
	private Long gstNo;
	private AddressDTO address;
	private Integer establishedSince;
}
