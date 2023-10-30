package com.xworkz.springProject.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.springProject.app.Diwali;
import com.xworkz.springProject.app.Dussehra;
import com.xworkz.springProject.app.Festival;
import com.xworkz.springProject.config.FestivalConfig;

public class FestivalRunner {
	public static void main(String[] args) {
		/*
		 * //Tightly coupled Dussehra fest1 = new Dussehra(); //Dussehra fest4 = new
		 * Diwali();
		 * 
		 * //Loosely coupled Festival fest3 = new Dussehra(); Festival fest5 = new
		 * Diwali();
		 * 
		 * Diwali fest2 = new Diwali();
		 */

		ApplicationContext context = new AnnotationConfigApplicationContext(FestivalConfig.class);
		Festival fest = context.getBean(Dussehra.class);
		fest.celebrate();

	}
}
