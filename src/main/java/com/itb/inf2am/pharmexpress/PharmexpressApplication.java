package com.itb.inf2am.pharmexpress;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PharmexpressApplication {

	public static void main(String[] args) {
		SpringApplication.run(PharmexpressApplication.class, args);
		System.out.println("Sua API foi iniciada!");
	}

}
