package com.ocr.P6.controller;

import com.ocr.P6.config.MyConstants;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class EmailController {


        @Autowired
        public JavaMailSender emailSender;

        @ResponseBody
        @RequestMapping("/sendSimpleEmail")
        public String sendSimpleEmail() {

            // Create a Simple MailMessage.
            SimpleMailMessage message = new SimpleMailMessage();

            message.setTo();
            message.setSubject("Reservation Topo");
            message.setText("Hello, Im testing Simple Email");

            // Send Message!
            this.emailSender.send(message);

            return "Email Sent!";
        }
}
