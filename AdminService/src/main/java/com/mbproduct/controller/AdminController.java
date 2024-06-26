package com.mbproduct.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mbproduct.Entity.AdminEntity;
import com.mbproduct.dto.Notification;
import com.mbproduct.service.AdminService;

@RestController
@RequestMapping
public class AdminController {
	@Autowired
	private AdminService service;
	@PostMapping("/register")
	public AdminEntity saveusr(@RequestBody  Notification user) {
		return service.saveusr(user);
		
	}
	@PostMapping("/home")
	public String home() {
		return "hello";
		
	}
}
