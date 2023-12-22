package com.xworkz.chocolate.config;

import org.springframework.context.annotation.Bean;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;

public class DBConfiguration {
	
	@Bean
	public LocalEntityManagerFactoryBean getLocalEntityManager() {
		LocalEntityManagerFactoryBean managerFactory = new LocalEntityManagerFactoryBean();
		managerFactory.setPersistenceUnitName("chocolateConnection");
		return managerFactory;
		
	}
}
