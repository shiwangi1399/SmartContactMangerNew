package com.springboot.contact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@SpringBootApplication
@EntityScan("com.springboot.contact.entities")
public class SmartContactMangerNewApplication {

	public static void main(String[] args) {
		SpringApplication.run(SmartContactMangerNewApplication.class, args);
	}

}
