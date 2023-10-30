package com.xworkz.collecTest.dto;

import com.xworkz.collecTest.enums.Type;

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

public class ProductDTO {
	private Integer id;
	private String name;
	private Type type;
	private BrandDTO brand;
	private Double price;
	private Integer quantity;

}
