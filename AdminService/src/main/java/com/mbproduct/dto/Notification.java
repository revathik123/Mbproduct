package com.mbproduct.dto;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.Data;

@Data
public class Notification {
	@GeneratedValue(strategy = GenerationType.AUTO)
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
