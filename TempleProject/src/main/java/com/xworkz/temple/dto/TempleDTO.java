package com.xworkz.temple.dto;

import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
//@EqualsAndHashCode

public class TempleDTO implements Serializable{
	private String name;
	private String place;
	private String mainGod;
	private int constYear;
	private String constBy;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		TempleDTO other = (TempleDTO) obj;
		if (constBy == null) {
			if (other.constBy != null) {
				return false;
			}
		} else if (!constBy.equals(other.constBy)) {
			return false;
		}
		if (constYear != other.constYear) {
			return false;
		}
		if (mainGod == null) {
			if (other.mainGod != null) {
				return false;
			}
		} else if (!mainGod.equals(other.mainGod)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		if (place == null) {
			if (other.place != null) {
				return false;
			}
		} else if (!place.equals(other.place)) {
			return false;
		}
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((place == null) ? 0 : place.hashCode());
		return result;
	}
	
	
}
