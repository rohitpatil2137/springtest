package com.learningsts.Hello.emailer;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import org.springframework.mail.javamail.JavaMailSender;

/*This class will be use to configure the beans of
DummyEmailSender.java and SMTPEmailSender.java as we
may dont have source of these classes but we want to use them as a 
Spring bean.

*/


@Configuration
public class MailConfig {
	//iEmailService emailService = new  DummyEmailSender();
	
	/*
	 * @Bean
	 * 
	 * @Profile("dev") public iEmailerService dummyEmailSender() { return new
	 * DummyEmailSender(); }
	 */
		
		@Bean
		@Profile("prod")
		public iEmailerService sMTPEmailSender(JavaMailSender javaMailSender) {
			return new SMTPEmailSender(javaMailSender);	
			}
		
			
}
