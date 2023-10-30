package com.xworkz.crudOperations.runner;

import com.xworkz.crudOperations.app.PlayerRepoImpl;
import com.xworkz.crudOperations.dto.PlayerDTO;
import com.xworkz.crudOperations.interfaces.PlayerRepository;
import com.xworkz.crudOperations.services.PlayerService;
import com.xworkz.crudOperations.services.PlayerServiceImpl;

public class PlayerRunner {

	public static void main(String[] args) {
		PlayerDTO dto1 = new PlayerDTO("Sachin","Cricket");
		PlayerRepository repository=new PlayerRepoImpl();
		
		PlayerService serv1 = new PlayerServiceImpl(repository);
		boolean res1 = serv1.validate(dto1);
		if(res1) {
			System.out.println("Saved player is :"+res1);
		}else {
			System.err.println(res1);
		}
		
		System.out.println("--------------------------------------------------------");
		
		PlayerDTO dto2 = new PlayerDTO("Ronaldo","Soccer");
			
		boolean res2 = serv1.validate(dto2);
		if(res2) {
			System.out.println("Saved player is :"+res2);
		}else {
			System.err.println(res2);
		}
		
		System.out.println("--------------------------------------------------------");
		
	}

}
