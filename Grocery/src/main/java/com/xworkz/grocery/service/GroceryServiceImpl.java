package com.xworkz.grocery.service;

import java.util.Collection;

import com.xworkz.grocery.dto.GroceryDTO;
import com.xworkz.grocery.repo.GroceryRepo;
import com.xworkz.grocery.repo.GroceryRepoImpl;

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
@EqualsAndHashCode
@ToString
public class GroceryServiceImpl implements GroceryService {
	private GroceryRepo repo;

	@Override
	public boolean validateandsave(GroceryDTO dto) {
		System.out.println("Validate and save in Service " + dto);
		repo.save(dto);
		return true;
	}

	@Override
	public int total() {
		return this.repo.total();
	}

	@Override
	public Collection<GroceryDTO> getAll() {
		return this.repo.getAll();
	}

}
