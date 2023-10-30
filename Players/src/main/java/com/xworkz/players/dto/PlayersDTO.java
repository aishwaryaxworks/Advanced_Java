package com.xworkz.players.dto;

import com.xworkz.players.enums.Sport;

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

public class PlayersDTO {
	private int id;
	private String name;
	private String country;
	private Sport sport;
	private int age;
}
