package com.xworkz.perfume.service;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.xworkz.perfume.dto.PerfumeDTO;
import com.xworkz.perfume.repo.PerfumeRepo;

@Component
public class PerfumeServImpl implements PerfumeService {

	@Autowired
	PerfumeRepo repo;

	@Override
	public boolean validateAndSave(PerfumeDTO pdto) {
		if (pdto != null) {
			if (pdto.getBrandName() != null && pdto.getBrandName().length() > 3) {
				if (pdto.getPrice() > 500) {
					if (pdto.getPerfumeNote() != null) {
						System.out.println("Data is validated...");
						boolean check = isExist(pdto);
						if (!check) {
							repo.save(pdto);
							return true;
						}
					}
				}
			}
		}
		return false;
	}

	@Override
	public Collection<PerfumeDTO> read() {
		repo.read().forEach(p -> System.out.println(p));
		return repo.read();
	}

	@Override
	public void findByName() {
		repo.read().stream().filter(p -> p.getBrandName().equals("Dior")).forEach(p -> System.out.println(p));
	}

	@Override
	public Collection<PerfumeDTO> readAll() {
		Collection<PerfumeDTO> perfumes = repo.readAll();
		return perfumes;
	}

	@Override
	public boolean isExist(PerfumeDTO dto) {
		Collection<PerfumeDTO> listAll = repo.readAll();
		for (PerfumeDTO perfumedto : listAll) {
			if (perfumedto.getBrandName().equals(dto.getBrandName())) {
				if (perfumedto.getPerfumeNote().equals(dto.getPerfumeNote())) {
					System.out.println("Perfume already exists...");
					return true;
				}
			}
		}
		System.out.println("Perfume does not exist...");
		return false;
	}

	@Override
	public boolean updatePriceByUsingName(String brandName, Integer price) {
		if(brandName != null && price > 400) {
			boolean update = repo.updatePriceByUsingName(brandName, price);
			return update;
		}
		return false;
	}
	
	@Override
	public void removeByBrand(String brandName) {
		List<PerfumeDTO> plist = repo.readAll().stream().collect(Collectors.toList());
		Iterator<PerfumeDTO> itr = plist.iterator();
		
		while(itr.hasNext()) {
			PerfumeDTO p = itr.next();
			if(p.getBrandName().equals(brandName)) {
				itr.remove();
				System.out.println("Data removed...");
			}
		}
		
//		List<PerfumeDTO> plist = repo.read().stream().collect(Collectors.toList());
//		ListIterator<PerfumeDTO> listitr = plist.listIterator();
		
//		while(listitr.hasNext()) {
//			PerfumeDTO p = listitr.next();
//			if(p.getBrandName().equals(brandName)) {
//				listitr.remove();
//				System.out.println("Data removed using List iterator...");
//			}
//		}
				
	}
}
