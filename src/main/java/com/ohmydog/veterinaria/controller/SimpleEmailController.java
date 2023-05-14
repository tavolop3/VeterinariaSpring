package com.ohmydog.veterinaria.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import jakarta.mail.internet.MimeMessage;

@Controller
public class SimpleEmailController {
     
    @Autowired
    private JavaMailSender sender;
 
    @RequestMapping("/simpleemail")
    @ResponseBody
    String home() {
        try {
            sendEmail("Test","This is a test","test@gmail.com");
            return "Email Sent!";
        }catch(Exception ex) {
            return "Error in sending email: "+ex;
        }
    }
 
    public void sendEmail(String subject, String body, String to) throws Exception{
        MimeMessage message = sender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);
        
        helper.setSubject(subject);
        helper.setText(body);
        helper.setTo(to);

        sender.send(message);
    }
}
