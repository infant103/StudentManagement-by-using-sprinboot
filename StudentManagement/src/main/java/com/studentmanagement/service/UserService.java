package com.studentmanagement.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.studentmanagement.configure.CustomeUserDetails;
import com.studentmanagement.entity.UserEntity;
import com.studentmanagement.repository.UserRepository;

@Service
public class UserService implements UserDetailsService{

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<UserEntity> user=userRepository.findByUserName(username);
		if(user.isPresent()) {
			return new CustomeUserDetails(user.get());
			
		}else { 
		throw new UsernameNotFoundException("User details not available!!");
	}
		
	}
		
	}
	

