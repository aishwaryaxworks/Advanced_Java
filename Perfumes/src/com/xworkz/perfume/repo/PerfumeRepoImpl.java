package com.xworkz.perfume.repo;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.perfume.dto.PerfumeDTO;

@Component
public class PerfumeRepoImpl implements PerfumeRepo {
	
	@Autowired
	Collection<PerfumeDTO> perfumes;

	@Override
	public boolean save(PerfumeDTO pdto) {
		if(perfumes!=null) {
			perfumes.add(pdto);
			System.out.println("Saved successfully");
			return true;
		}
		return false;
	}
	
	@Override
	public Collection<PerfumeDTO> read(){
		return perfumes.stream().collect(Collectors.toList());
	}

	@Override
	public Collection<PerfumeDTO> readAll() {
		return perfumes;
	}

	@Override
	public boolean updatePriceByUsingName(String brandName, Integer price) {
		for(PerfumeDTO dto : perfumes) {
			if(dto.getBrandName().equals(brandName)) {
				dto.setPrice(price);
				return true;
			}System.out.println("Brand name not matched, moving to next index...");
		}
		System.out.println("Brand name does not match in entire dataset!!!");
		return false;
	}

}
