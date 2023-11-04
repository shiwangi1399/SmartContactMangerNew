package com.springboot.contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springboot.contact.entities.User;
import com.springboot.contact.DAO.UserRepository;
public class MyController {

@Controller
@EntityScan("com.springboot.contact.entities")
public class HomeController {

	@Autowired
	UserRepository userRepository;
	
@GetMapping("/test")
@ResponseBody
public String test() {
	User user=new User();
	user.setName("shiwangi");
	user.setEmail("shivi@gmail.com");
	userRepository.save(user);
	return "working";
}
}

}
