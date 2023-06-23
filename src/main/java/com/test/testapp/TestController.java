package com.test.testapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	
	@GetMapping("/api/v1/greet")
	public String getGreetings() {
		return "Hello, User Wish you a good day!";
	}
	
	@GetMapping("/api/v1/persgreet/{id}") 
	public String getPersonalGreeting(@PathVariable String id) {
		if (id!=null && id.length()>0) {
			return "Hello "+id+", Wish you a good day!";
		}
		return "Hello User!";
	}

}
