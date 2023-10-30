package com.xworks.collect.dto;

import java.time.LocalDate;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
@ToString
public class WarDTO implements Comparable<WarDTO>{
	private Integer id;
	private String warName;
	private LocalDate startDate;
	private LocalDate endDate;
	private Collection<CountryDTO> participants;
	private String wonBy;
	
	
	
	@Override
	public int compareTo(WarDTO args) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((startDate == null) ? 0 : startDate.hashCode());
		result = prime * result + ((wonBy == null) ? 0 : wonBy.hashCode());
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
		WarDTO other = (WarDTO) obj;
		if (startDate == null) {
			if (other.startDate != null) {
				return false;
			}
		} else if (!startDate.equals(other.startDate)) {
			return false;
		}
		if (wonBy == null) {
			if (other.wonBy != null) {
				return false;
			}
		} else if (!wonBy.equals(other.wonBy)) {
			return false;
		}
		return true;
	}
	
	

}
