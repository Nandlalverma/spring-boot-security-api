package com.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.security.Repository.UserRepository;
import com.security.models.User;

@SpringBootApplication
public class Application implements CommandLineRunner {

	
	
	@Autowired
	private UserRepository userRepository;
	
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		  User user= new User(); user.setEmail("iet@gmail.com");
		  user.setUsername("nand");
		  user.setPassword(this.bCryptPasswordEncoder.encode("xyz"));
		  user.setRole("ROLE_NORMAL"); this.userRepository.save(user);
		  
		  User user1=new User(); user1.setEmail("kit@gmail.com");
		  user1.setUsername("Roshani");
		  user1.setPassword(this.bCryptPasswordEncoder.encode("pqr"));
		  user1.setRole("ROLE_ADMIN"); this.userRepository.save(user1);
		 
	}

	
	
}
