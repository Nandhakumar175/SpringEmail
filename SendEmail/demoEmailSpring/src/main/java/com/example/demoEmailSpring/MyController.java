 package com.example.demoEmailSpring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demoEmailSpring.Dto.SendEmail;

@Controller
@RequestMapping("/sendEmail")
public class MyController {

    @Autowired
    private MailService mailService;

    @PostMapping(value = "/send")
    public SendEmail sendEmail(@RequestBody SendEmail sendemail) {
        
        return mailService.sendEmail(sendemail);
    }
}
