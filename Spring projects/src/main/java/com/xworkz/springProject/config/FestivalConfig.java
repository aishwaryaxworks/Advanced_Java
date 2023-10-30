package com.xworkz.springProject.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.xworkz.springProject.app.Diwali;
import com.xworkz.springProject.app.Dussehra;

@Configuration
public class FestivalConfig {
	
	public String getString() {
		String str = new String();
		return str;
	}
	
	@Bean
	public Dussehra getDussehra() {
		Dussehra obj = new Dussehra();
		return obj;
	}
	
	@Bean
	public Diwali getDiwali() {
		return new Diwali();
	}

}
