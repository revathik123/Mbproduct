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
public class AdminEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String jobTitle;
	private String totalVacancy;
	private String description;
	private String postDate;
	private String lastDate;
	private String qualifications;
	private String fee;
	private String importantDates;
	private String interviewDates;
	private String ageLimit;
	private String vacancyDetails;
	
}
