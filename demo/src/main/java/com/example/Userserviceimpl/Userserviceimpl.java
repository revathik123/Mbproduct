package com.example.Userserviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Entity.UserEntity;
import com.example.Userrepository.UserRpository;
import com.example.Userservice.UserService;
import com.example.dto.UserDto;
@Service
public class Userserviceimpl implements UserService{
	@Autowired
	
private  UserRpository repository;
	
@Override
public UserEntity saveusr(UserDto user) {
	UserEntity usr=new UserEntity();
	usr.setName(user.getName());
	return repository.save(usr);
}

}
