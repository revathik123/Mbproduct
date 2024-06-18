package com.mbproduct.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
@Data
public class Login {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String email;
	private String password;
	
}
