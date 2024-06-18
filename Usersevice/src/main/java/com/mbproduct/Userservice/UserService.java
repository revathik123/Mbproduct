package com.mbproduct.Userservice;

import java.util.List;

import com.mbproduct.Entity.UserEntity;
import com.mbproduct.dto.Login;
import com.mbproduct.dto.Registration;

public interface UserService {
	UserEntity saveusr(Registration user);
	
	String userLogin(Login login);
	
//	String saveContactform(Contactform form);

	 List<UserEntity> getAllContactForms();
	 
	 Boolean getOtp(String emailAdress, String otp);

}
