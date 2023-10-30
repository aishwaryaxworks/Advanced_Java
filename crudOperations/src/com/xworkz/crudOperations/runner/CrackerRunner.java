package com.xworkz.crudOperations.runner;

import java.time.LocalDateTime;

import com.xworkz.crudOperations.dto.CrackerDTO;

public class CrackerRunner {

	public static void main(String[] args) {
		CrackerDTO crackerdto = new CrackerDTO("Rocket","Standard",20.50);
		crackerdto.setWhenCreated(LocalDateTime.now());
		crackerdto.setWhoCreated("Aishwarya");
		System.out.println(crackerdto);
	}
}
