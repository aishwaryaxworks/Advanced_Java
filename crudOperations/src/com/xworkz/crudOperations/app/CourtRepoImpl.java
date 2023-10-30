package com.xworkz.crudOperations.app;

import com.xworkz.crudOperations.dto.CourtDTO;
import com.xworkz.crudOperations.interfaces.CourtRepository;

public class CourtRepoImpl implements CourtRepository{
	CourtDTO[] dto = new CourtDTO[ITEMS];
	private int index=0;
	
	@Override
	public void save(CourtDTO courtdto) {
		System.out.println("Invoking save in repo...");
		if(index<ITEMS) {
			this.dto[index]=courtdto;
			System.out.println("Court is saved at index:"+this.index);
			this.index++;
		}else {
			System.err.println("dataset full...");
			//stop execution
			//data or logic : Logic -> Runtime exception    Data -> checked exception
			throw new RuntimeException("Index is full, cannot save more than 3 elements...");
		}
	}
	
	@Override
	public boolean isExists(CourtDTO courtdto) {
		System.out.println("isExists in court repo impl");
		for (int pos=0;pos<this.dto.length;pos++) { 
			CourtDTO temp = this.dto[pos]; /* 0=null, 1=null, 2=null */
			if(temp!=null) {
				if(temp.getType().equals(courtdto.getType()) && temp.getLocation().equals(courtdto.getLocation())){
					System.err.println("Court already exists... "+courtdto);
					return true;
				}
			}
		}
		System.out.println("Court does not exist... Can save...");
		return CourtRepository.super.isExists(courtdto);
	}

}
