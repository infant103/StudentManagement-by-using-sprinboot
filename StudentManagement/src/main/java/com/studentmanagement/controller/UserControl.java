package com.studentmanagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.studentmanagement.service.UserService;

@Controller
public class UserControl {
@Autowired
private UserService userService;

	@GetMapping("/")
	private String getHome()
	{
		return"home";
	}
	
}
