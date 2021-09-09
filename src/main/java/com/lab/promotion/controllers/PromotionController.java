package com.lab.promotion.controllers;

import com.lab.promotion.model.Customer;
import com.lab.promotion.services.PromotionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/promotion")
public class PromotionController {

    private final PromotionService promotionService;

    public PromotionController(PromotionService promotionService) {
        this.promotionService = promotionService;
    }

    @GetMapping("/birthdate/{date}/")
    public ResponseEntity<String> getPromotionsToCustomersByBirthDate(
            @PathVariable("date")
            @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthDate) {
        promotionService.sendEmailOfPromotions(birthDate);
        return new ResponseEntity<>("Emails sended", HttpStatus.OK);
    }

    @GetMapping("/birthdate/")
    public ResponseEntity<String> getPromotionsToCustomersWithBirthDateToday() {

        promotionService.sendEmailOfPromotions(new Date());
        return new ResponseEntity<>("Emails sended", HttpStatus.OK);
    }
}