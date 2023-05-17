package com.example.demoEmailSpring;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import com.example.demoEmailSpring.Dto.SendEmail;

@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    public SendEmail sendEmail(SendEmail sendemail) {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo(sendemail.getEmail());
        message.setSubject(sendemail.getTittle());
        message.setText(sendemail.getSubject());
        try {
            mailSender.send(message);
        } catch (Exception e) {
            e.printStackTrace();
        }
		return sendemail;

    }

//	public void sendEmail(SendEmail sendemail) {
//		// TODO Auto-generated method stub
//		
//	}
}

