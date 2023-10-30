package com.xworks.collect.dto;

import java.util.Collection;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CountryDTO extends PresidentDTO {
	private Integer id;
	private String countryName;
	private PresidentDTO president;
	private String continent;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((countryName == null) ? 0 : countryName.hashCode());
		result = prime * result + ((president == null) ? 0 : president.hashCode());
		return result;
	}
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
		CountryDTO other = (CountryDTO) obj;
		if (countryName == null) {
			if (other.countryName != null) {
				return false;
			}
		} else if (!countryName.equals(other.countryName)) {
			return false;
		}
		if (president == null) {
			if (other.president != null) {
				return false;
			}
		} else if (!president.equals(other.president)) {
			return false;
		}
		return true;
	}
	
	public int compareTo(CountryDTO args) {
		// TODO Auto-generated method stub
		return 0;
	}

}
