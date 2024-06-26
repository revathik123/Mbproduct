package com.mbproduct.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mbproduct.Entity.AdminEntity;
@Repository
public interface AdminRepository extends JpaRepository<AdminEntity, Long> {

}
