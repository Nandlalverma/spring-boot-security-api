package com.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/public")
public class HomeController {

	
	@GetMapping("/home")
	public String Home()
	{
		return "this is home page";
	}
	
	
	@GetMapping("/login")
	public String logint()
	{
		return "this is login page";
	}
	
	
	@GetMapping("/register")
	public String Register()
	{
		return "this is register page";
	}
}
