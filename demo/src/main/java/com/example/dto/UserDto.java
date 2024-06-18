package com.example.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
@Data
public class UserDto {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
}
