package com.security.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.security.models.User;
import com.security.service.UserService;

@RestController
@RequestMapping("/users")
public class UserController {

	
	@Autowired
	private UserService userService;
	
	// all user
	
	@GetMapping("/")
	public List<User> allUser()
	{
	   return this.userService.getAllUser();	
	}
	
	// return single user
//	@PreAuthorize("hasRole('ADMIN')")
	@GetMapping("/{username}")
	public User getSingleUser(@PathVariable("username") String  username)
	{
		return this.userService.getSingleUser(username);
	}
	
	// add user
	
	@PostMapping("/")
	public User addUser( @RequestBody User user)
	{
		return this.userService.addUser(user);
	}
	
	
	
	
}
