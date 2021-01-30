package com.learningsts.Hello.controller;

import javax.mail.MessagingException;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learningsts.Hello.emailer.iEmailerService;



@RestController
public class EmailServiceController {
//iEmailService emailService = new  DummyEmailSender();
	// Dont create any object with specific type
	// two primary bean cant be allowed
	// 2 Component cant be allowed

	// @Autowired
	iEmailerService emailservice;

	// http://localhost:8080/sendemail
	@RequestMapping("/sendemail")
	public String email() throws MessagingException {
		// call sendEMail method
		emailservice.sendEmail("stevejobs@apple.com", "Launching of new Apple Model", "Body of the email");

		return "Email Sent";
	}

	
	 @Autowired 
	 public EmailServiceController(iEmailerService  abc) 
	 { 
		 this.emailservice=abc; 
	 }
	  
	 
		/*
		 * public iEmailerService getEmailservice() { return emailservice; }
		 */

	//@Autowired
	//public void setEmailservice(iEmailerService dummyEmailSender) {
		//this.emailservice = dummyEmailSender;
	//}
}