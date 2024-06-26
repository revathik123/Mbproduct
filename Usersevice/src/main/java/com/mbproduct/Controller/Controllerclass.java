package com.mbproduct.Controller;

import java.util.List;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.mbproduct.Entity.UserEntity;
import com.mbproduct.Userservice.UserService;
import com.mbproduct.dto.Login;
import com.mbproduct.dto.Registration;

@RestController
@RequestMapping("/")
public class Controllerclass {
	@Autowired
	private UserService service;
	@PostMapping("/register")
	public UserEntity saveusr(@RequestBody  Registration user) {
		return service.saveusr(user);
		
	}
	@GetMapping("/login")
	public String userlogin(@RequestBody Login login) {
		return service.userLogin(login);


	}
//	@PostMapping("/Sendmessage")
//	public String saveContactform(Contactform form) {
//		return service.saveContactform(form);
//		
//	}
	@GetMapping("/all")
    public List<UserEntity> getAllContactForms() {
        return service.getAllContactForms();
    }
	@PostMapping("/get-otp")
	public Boolean getOtp(@RequestParam String emailAdress, String otp ) {
	    String newotp = RandomStringUtils.randomNumeric(6);

	    return service.getOtp(emailAdress, newotp);
		
	}


	
}
