package com.example.Userservice;

import com.example.Entity.UserEntity;
import com.example.dto.UserDto;

public interface UserService {
	UserEntity saveusr(UserDto user);

}
