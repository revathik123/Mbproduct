package com.mbproduct.Userserviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.mbproduct.Entity.UserEntity;
import com.mbproduct.Userrepository.UserRpository;
import com.mbproduct.Userservice.UserService;
import com.mbproduct.Util.EmailUtil;
import com.mbproduct.dto.Login;
import com.mbproduct.dto.Registration;

import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class Userserviceimpl implements UserService{
	@Autowired
	
private  UserRpository repository;
	@Autowired
	private JavaMailSender javaMailSender;
	@Autowired
	private EmailUtil utils;

	
	
@Override
public UserEntity saveusr(Registration user) {
	UserEntity usr=new UserEntity();
	usr.setName(user.getName());
	usr.setEmail(user.getEmail());
	usr.setMobilenumber(user.getMobilenumber());
	usr.setPassword(user.getPassword());
	usr.setQualifications(user.getQualifications());
	usr.setIntrests(user.getIntrests());
	return repository.save(usr);
}

@Override
public String userLogin(Login login) {
	
	UserEntity user = repository.findByEmail(login.getEmail());

	log.info("Employee Loging... method running. ");

	if (user != null && login.getPassword().equals(user.getPassword())) {
		
			return "Login succesfull";
		} 		
	else {
		return "Incorrect username or password";
	}
}

//@Override
//public String saveContactform(Contactform form) {
//	UserEntity usr1=new UserEntity();
//	usr1.setFirstName(form.getFirstName());
//	usr1.setLastName(form.getLastName());
//	usr1.setEmailAdress(form.getEmailAdress());
//	usr1.setPhno(form.getPhno());
//	usr1.setEnquiryDescription(form.getEnquiryDescription());
//	 repository.save(usr1);
//	 return "submit successfully";
//}
//
@Override
public List<UserEntity> getAllContactForms() {
	// TODO Auto-generated method stub
	return  repository.findAll();
}

@Override
public Boolean getOtp(String emailAdress, String otp) {
    SimpleMailMessage message = new SimpleMailMessage();
    message.setFrom("officialkanhaiya121@gmail.com");
    message.setTo(emailAdress);
    message.setSubject("Your OTP for Verification");
    message.setText("Your OTP is: " + otp);

   javaMailSender.send(message);
return true;

}




}
