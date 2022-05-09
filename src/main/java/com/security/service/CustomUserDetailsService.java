package com.security.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.security.Repository.UserRepository;
import com.security.models.CustomUserDetail;
import com.security.models.User;

@Service
public class CustomUserDetailsService  implements UserDetailsService{

	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
      
          User byId = this.userRepository.findByUsername(username);
          
          if(byId==null)
          {
        	  throw new UsernameNotFoundException("No User");
          }
          
          return new CustomUserDetail(byId);
          
	}

	
}
