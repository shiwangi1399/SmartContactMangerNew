package com.springboot.contact.controller;

import org.springframework.web.bind.annotation.GetMapping;

public class HomeController {
	
	@GetMapping("/home")
	public String HomeHandler(){
		return "Home";
	}

}
