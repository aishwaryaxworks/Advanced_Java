package com.xworkz.perfume;

import java.util.Collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.perfume.config.PerfumeConfig;
import com.xworkz.perfume.dto.PerfumeDTO;
import com.xworkz.perfume.service.PerfumeServImpl;
import com.xworkz.perfume.service.PerfumeService;

public class PerfumeOpener {

	public static void main(String[] args) {
		PerfumeDTO dto1 = new PerfumeDTO("Gucci", 5600, "France", 50, "Evening");
		PerfumeDTO dto2 = new PerfumeDTO("Dior", 8500, "France", 100, "Spring");

		ApplicationContext context = new AnnotationConfigApplicationContext(PerfumeConfig.class);

		PerfumeService serv = context.getBean(PerfumeServImpl.class);
		serv.validateAndSave(dto1);
		serv.validateAndSave(dto2);

		System.out.println("--------------------------------------");
		serv.read();

		System.out.println("--------------------------------------");
		serv.findByName();

		System.out.println("--------------------------------------");
		Collection<PerfumeDTO> pdto = serv.readAll();
		for (PerfumeDTO perfume : pdto) {
			System.out.println(perfume);
		}

		System.out.println("--------------OR ELSE----------------");
		pdto.forEach(p -> System.out.println(p));

		System.out.println("--------------------------------------");
		serv.validateAndSave(dto2);

		System.out.println("--------------------------------------");
		boolean check = serv.isExist(dto1);
		System.out.println("dto check is exist :" + check);

		System.out.println("--------------------------------------");

		System.out.println("Data before update");
		Collection<PerfumeDTO> list = serv.readAll();
		list.forEach(p -> System.out.println(p));

		serv.updatePriceByUsingName("Gucci", 9000);

		System.out.println("Data after update");
		Collection<PerfumeDTO> list1 = serv.readAll();
		list1.forEach(p -> System.out.println(p));

		System.out.println("--------------------------------------");
		serv.removeByBrand("Gucci");
		serv.readAll().stream().forEach(p -> System.out.println("Data after remove:" + p));

	}

}
