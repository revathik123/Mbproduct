package com.mbproduct.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mbproduct.Entity.AdminEntity;
import com.mbproduct.dto.Notification;
import com.mbproduct.repository.AdminRepository;
import com.mbproduct.service.AdminService;
@Service
public class AdminServiceimpl implements AdminService {
	@Autowired
	private AdminRepository repository;
	@Override
	public AdminEntity saveusr(Notification user) {
		AdminEntity usr=new AdminEntity();
		usr.setJobTitle(user.getJobTitle());
		usr.setTotalVacancy(user.getTotalVacancy());
		usr.setPostDate(user.getPostDate());
		usr.setLastDate(user.getLastDate());
		usr.setQualifications(user.getQualifications());
		usr.setDescription(user.getDescription());
		usr.setFee(user.getFee());
		usr.setAgeLimit(user.getAgeLimit());
		usr.setVacancyDetails(user.getVacancyDetails());
		usr.setImportantDates(user.getImportantDates());
		usr.setInterviewDates(user.getInterviewDates());
		return repository.save(usr);
	}
}
