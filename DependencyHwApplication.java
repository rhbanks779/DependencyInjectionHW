package com.example.demo;

import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DependencyHwApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext Context=	SpringApplication.run(DependencyHwApplication.class, args);
		
		MovieTheater mt1 = Context.getBean(MovieTheater.class);
		Restaurant r1= Context.getBean(Restaurant.class);
		Seats s = Context.getBean(Seats.class);
		
		mt1.setSeat(s);
		mt1.setName("5 Rivers Movie Theater");
		mt1.welcome();
		mt1.showComfort();
		mt1.showCapacity();
		
		System.out.println();
		
		r1.setSeat(s);
		r1.setName("Pizza Palace");
		r1.setType("pizza");
		r1.welcome();
		r1.showComfort();
		r1.showCapacity();
		
	}

}
