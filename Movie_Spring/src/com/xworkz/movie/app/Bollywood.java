package com.xworkz.movie.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Bollywood implements Movie {

	@Autowired
	@Qualifier("hindi")
	private Language lang;
	
	@Override
	public void produce() {
		System.out.println("Bolly produce");
		lang.speak();
	}

	@Override
	public void promote() {
		System.out.println("Bolly promote");
	}

	@Override
	public void release() {
		System.out.println("Bolly release");
	}

}
