package com.xworkz.crudOperations.runner;

import com.xworkz.crudOperations.app.CourtRepoImpl;
import com.xworkz.crudOperations.dto.CourtDTO;
import com.xworkz.crudOperations.interfaces.CourtRepository;

public class CourtRunner {

	public static void main(String[] args) {
		CourtDTO courtdto1 = new CourtDTO("Civil", "Delhi", 20, 1000);
		CourtDTO courtdto2 = new CourtDTO("High", "Delhi", 5, 1000);
		CourtDTO courtdto3 = new CourtDTO("High", "Delhi", 5, 1000);

		CourtRepository courtRepo = new CourtRepoImpl();

		boolean exist = courtRepo.isExists(courtdto1);
		if (exist) {
			courtRepo.save(courtdto1);
			System.out.println("court dto is saved... " + courtdto1);
		}

		exist = courtRepo.isExists(courtdto2);
		if (exist) {
			courtRepo.save(courtdto2);
			System.out.println("court dto is saved... " + courtdto2);
		}

		exist = courtRepo.isExists(courtdto3);
		if (exist) {
			courtRepo.save(courtdto3);
			System.out.println("court dto is saved... " + courtdto3);
		}

		courtRepo.save(courtdto1);
		courtRepo.save(courtdto2);
		courtRepo.save(courtdto3);
	}

}
