package com.mbproduct.Userrepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mbproduct.Entity.UserEntity;
@Repository
public interface UserRpository extends JpaRepository<UserEntity,Long> {

	UserEntity findByEmail(String email);
}
