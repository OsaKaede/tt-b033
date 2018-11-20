package com.cacei.version1.service;

import org.springframework.mail.SimpleMailMessage;

public interface EmailServicio {
	public void sendEmail(SimpleMailMessage email);
}