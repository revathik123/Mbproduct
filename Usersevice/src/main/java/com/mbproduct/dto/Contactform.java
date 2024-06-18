package com.mbproduct.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;
@Data
public class Contactform {
	
	
	@GeneratedValue(strategy = GenerationType.AUTO)
	private String firstName;
	private String lastName;
	private String emailAdress;
	private String phno;
	private String enquiryDescription;

	
}
