package com.xworks.vegetable.dto;

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

public class BrandDTO implements Comparable<BrandDTO>{
	private String name;
	private String owner;
	private Double revenue;
	private String country;
	
	@Override
	public int compareTo(BrandDTO arg) {
		BrandDTO temp=this;
		return temp.getName().compareTo(arg.getName());
	}
	
//	@Override
//	public int compareTo(BrandDTO arg) {
//		BrandDTO current = this;
//		if(current.getRevenue() == 20) {
//			return 0;
//		}else if(current.getRevenue() > 20) {
//			return 1;
//		}else if(current.getRevenue() < 20) {
//			return -1;
//		}
//		throw new IllegalArgumentException("Cannot sort this list...");
//	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((country == null) ? 0 : country.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		BrandDTO other = (BrandDTO) obj;
		if (country == null) {
			if (other.country != null) {
				return false;
			}
		} else if (!country.equals(other.country)) {
			return false;
		}
		if (name == null) {
			if (other.name != null) {
				return false;
			}
		} else if (!name.equals(other.name)) {
			return false;
		}
		return true;
	}
	
	

}
