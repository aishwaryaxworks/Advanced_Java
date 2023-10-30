package com.xworkz.waste.service;

import com.xworkz.waste.dto.WasteDTO;
import com.xworkz.waste.repository.WasteRepository;
import com.xworkz.waste.repository.WasteRepositoryImpl;

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

public class WasteServiceImpl implements WasteService {
	WasteRepository wrepo = new WasteRepositoryImpl();
	
	@Override
	public boolean validateandsave(WasteDTO wdto) {
		if (wdto != null) {
			System.out.println("good data");
			if (wdto.getName() != null && !wdto.getName().isEmpty() && wdto.getName().length() >= 3
					&& wdto.getName().length() < 30) {
				System.out.println("Name of Waste is :" + wdto.getName());
			} else {
				System.err.println("Name error...");
			}

			if (wdto.getType() != null && !wdto.getType().isEmpty() && wdto.getType().length() >= 3
					&& wdto.getType().length() < 30) {
				System.out.println("Type of Waste is :" + wdto.getType());
			} else {
				System.err.println("Type error...");
			}
			
			if(wdto.getWeight() > 0 && wdto.getWeight()<10000) {
				System.out.println("Weight is :"+wdto.getWeight());
			}else {
				System.err.println("Weight error...");
			}

		} else {
			System.out.println("bad data");
		}
		return true;
	}

}
