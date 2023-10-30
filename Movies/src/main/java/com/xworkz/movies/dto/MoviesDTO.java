package com.xworkz.movies.dto;

import com.xworkz.movies.enums.Lang;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

//@Data
@ToString
@EqualsAndHashCode
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class MoviesDTO {
	private int id;
	private String name;
	private String producer;
	private Lang lang;
	private String director;
}
