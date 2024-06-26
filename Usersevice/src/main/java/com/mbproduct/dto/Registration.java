package com.mbproduct.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
@Data
public class Registration {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String email;
	private String password;
	private String mobilenumber;
	private String qualifications;
	private String intrests;
}
