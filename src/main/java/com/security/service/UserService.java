package com.security.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.security.models.User;

@Service
public class UserService {

	List<User> list=new ArrayList<>();

	public UserService() {
     
		
		  list.add(new User("abc","abc","abc@gmail.com", null)); list.add(new
		  User("xyz","xyz","xya@gmail.com", null));
		 
	}
	
	// get all user
	public List<User> getAllUser()
	{
		return this.list;
	}
	
	// get  single user
	
	public  User getSingleUser(String username)
	{

		return this.list.stream().filter(user->(user.getUsername())
				.equals(username)).findAny().orElse(null);
		
	}
	
	// add  new user 
	public User addUser(User user)
	{
		 this.list.add(user);
		 return user;
	}
	
}
