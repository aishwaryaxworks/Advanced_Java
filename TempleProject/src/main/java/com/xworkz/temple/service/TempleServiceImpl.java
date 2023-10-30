package com.xworkz.temple.service;

import java.util.Collection;

import com.xworkz.temple.dto.TempleDTO;
import com.xworkz.temple.repository.TempleRepo;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@EqualsAndHashCode
@ToString
public class TempleServiceImpl implements TempleService {
	private TempleRepo repo;
	
	public TempleServiceImpl(TempleRepo repo)
	{
		this.repo=repo;
	}

	@Override
	public boolean validateandsave(TempleDTO dto) {
		System.out.println("Validate and save in Service: " + dto);
		repo.save(dto);
		return true;
	}

	@Override
	public int total() {
		return this.repo.total();
	}

	public Collection<TempleDTO> getAll() {
		return this.repo.getAll();
	}

}
