package com.xworkz.perfume.config;

import java.util.ArrayList;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.xworkz.perfume.dto.PerfumeDTO;

@Configuration
@ComponentScan("com.xworkz.perfume")
public class PerfumeConfig {
	
	@Bean
	public ArrayList<PerfumeDTO> getList(){
		return new ArrayList<PerfumeDTO>();
	}

}
