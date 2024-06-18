package com.example.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Entity.UserEntity;
import com.example.Userservice.UserService;
import com.example.dto.UserDto;

@RestController
@RequestMapping("/")
public class Controllerclass {
	@Autowired
	private UserService service;
	@PostMapping("/register")
	public UserEntity saveusr(@RequestBody  UserDto user) {
		return service.saveusr(user);
		
	}
@GetMapping("/hello")
public String home() {
	return "hello";
}
}