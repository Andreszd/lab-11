package com.lab.promotion.services;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class EmailServiceTest {

    @Autowired
    private EmailService emailService;
    @Test
    void sendSimpleMessage() {
        String to = "contretaa@gmail.com";
        String subject = "Promocion";
        String text = "Hola mundo";
        emailService.sendSimpleMessage(to, subject, text);
    }
}