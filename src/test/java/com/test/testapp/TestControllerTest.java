package com.test.testapp;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class TestControllerTest {

	
	@Autowired
	private TestController testController;
	
	@Test
	public void testgreet() {
		Assertions.assertEquals(this.testController.getGreetings(), "Hello, User Wish you a good day!");
		
	}
	
	@Test
	public void testPersonalgreet() {
		Assertions.assertEquals(this.testController.getPersonalGreeting("Sushant"), "Hello Sushant, Wish you a good day!");
		Assertions.assertEquals(this.testController.getPersonalGreeting(null), "Hello User!");
	}
	
	
	
}
