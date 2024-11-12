package com.test.student.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentRestController {

	@Value("${test.username}") 
	private String testUser;
	@Value("${test.password}") 
	private String testPass;
	
	@Value("${test.userdb}") 
	private String testUserdb;
	@Value("${test.passwordb}") 
	private String testPassdb;
	
	@GetMapping("/properties")
	public String getProperties() {
		
		return "testUser::: " + testUser +"testPass ::: " + testPass +"testUserdb:::"+ testUserdb +"testPassdb :::" + testPassdb;
	}
	
	
}
