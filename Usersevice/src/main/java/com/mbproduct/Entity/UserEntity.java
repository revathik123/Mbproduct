package com.mbproduct.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


@Table
@Data
@Entity
public class UserEntity {
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private long id;
private String name;
private String email;
private String password;
private String mobilenumber;
private String qualifications;
private String intrests;
//contact form
private String firstName;
private String lastName;
private String emailAdress;
private String phno;
private String enquiryDescription;



}
