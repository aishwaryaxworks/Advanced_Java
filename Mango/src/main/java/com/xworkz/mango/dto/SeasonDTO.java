package com.xworkz.mango.dto;

public class SeasonDTO {
	private String country="India";
	private String name = new String("Rainy");
	private Integer months = new Integer(0);
	private Integer days = 60;   //auto boxing
	private Integer value = months;   //auto unboxing
	private Boolean active;
}
