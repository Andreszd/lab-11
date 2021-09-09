package com.lab.promotion.controllers;

import com.lab.promotion.model.Customer;
import com.lab.promotion.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("/birthdate/{date}")
    public List<Customer> getCustomersByBirthDate(@PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") Date birthDate){
        return customerService.getAllCustomersBirthDay(birthDate);
    }

    @GetMapping("/birthdate")
    public List<Customer> getCustomersThatBirthToday(){
        return customerService.getAllCustomersBirthDay(new Date());
    }
}
