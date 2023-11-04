package com.springboot.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.contact.dao.UserRepository;
import com.springboot.contact.entities.User;
@Controller
public class MyController {

@Autowired
	private UserRepository userRepository;
	
@GetMapping("/test")
@ResponseBody
public String test() {
	User user=new User();
	user.setName("shiwangi");
	user.setEmail("shivi1@gmail.com");
	userRepository.save(user);
	return "working";
}


}
