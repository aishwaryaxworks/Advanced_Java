package com.xworkz.movie.runner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.xworkz.movie.app.Bollywood;
import com.xworkz.movie.app.Movie;
import com.xworkz.movie.config.MovieConfig;

public class MovieTester {

	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(MovieConfig.class);

		Movie bolly = context.getBean(Bollywood.class);
		bolly.produce();
	}

}
