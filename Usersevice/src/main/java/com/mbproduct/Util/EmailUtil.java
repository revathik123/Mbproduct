package com.mbproduct.Util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;

import jakarta.mail.internet.MimeMessage;

@Component
public class EmailUtil {

	@Autowired
	private JavaMailSender javaMailSender;
    
    public boolean sendmail(String to,String subject,String text) {
    	
    	Boolean isSent=false;
    
  try {
    	MimeMessage mimemessage = javaMailSender.createMimeMessage();
    	MimeMessageHelper helper = new MimeMessageHelper(mimemessage,true);
    	
    	
    	helper.setTo(to);
    	helper.setSubject(subject);
    	helper.setText(text);
    	
    	
    	javaMailSender.send(mimemessage);
    		
    	isSent=true;
    		
	}catch(Exception er) {
		er.printStackTrace();
	}
		return isSent;
		}

   }
