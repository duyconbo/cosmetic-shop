package com.poly.service;

import javax.mail.MessagingException;

import com.poly.model.MailInfo;


public interface MailerService {
	public void send (MailInfo mail) throws MessagingException;
	public void send (String to, String subject, String body) throws MessagingException;
	void queue(MailInfo mail)throws MessagingException ;
	void queue(String to, String subject, String body)throws MessagingException ;	
}
