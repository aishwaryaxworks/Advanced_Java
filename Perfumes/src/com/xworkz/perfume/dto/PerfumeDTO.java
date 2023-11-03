package com.xworkz.perfume.dto;

import java.io.Serializable;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@EqualsAndHashCode

@Component
public class PerfumeDTO implements Serializable{
	private String brandName;
	private Integer price;
	private String originCountry;
	private Integer quantity;
	private String perfumeNote;

}
