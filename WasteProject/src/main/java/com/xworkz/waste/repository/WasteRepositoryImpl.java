package com.xworkz.waste.repository;

import com.xworkz.waste.dto.WasteDTO;

public class WasteRepositoryImpl implements WasteRepository{
	
	private WasteDTO[] wdto= new WasteDTO[ITEMS];
	private int index = 0;

	@Override
	public void save(WasteDTO wdto) {
		System.out.println("Invoking save method");
		System.out.println("Waste saved:"+wdto);
		if(this.index<ITEMS) {
			this.wdto[index]=wdto;
			System.out.println("Waste saved at:"+this.index);
			index++;
		}else {
			System.err.println("Dataset is full...");
		}
	}

}
