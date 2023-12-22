package com.xworkz.chocolate.repo;

import java.util.List;

import org.springframework.ui.Model;

import com.xworkz.chocolate.dto.ChocolateDTO;
import com.xworkz.chocolate.dto.ChocolateEntity;

public interface ChocolateRepo {
	public boolean save(ChocolateEntity cdto);
	
	public ChocolateDTO findById(int id);
	
	public List<ChocolateDTO> readAll ();
	
	public ChocolateDTO findByName(String name);
	
	public boolean updateQuantityByName(int quantity, String name);

	public boolean deleteByName(String name);
}
