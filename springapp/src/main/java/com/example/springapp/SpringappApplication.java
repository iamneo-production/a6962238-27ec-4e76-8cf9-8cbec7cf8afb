package com.example.springapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringappApplication {

	public static void main(String[] args) {
		System.out.println("Welcome to spring app");
		System.out.println("I am going to show how github works");
		SpringApplication.run(SpringappApplication.class, args);
		
	}

}
