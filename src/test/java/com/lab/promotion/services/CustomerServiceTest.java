package com.lab.promotion.services;

import com.lab.promotion.model.Customer;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CustomerServiceTest {

    @Autowired
    private CustomerService customerService;

    @Test
    void getAllCustomers(){
        List<Customer> customerList = customerService.getAllCustomers();
        assertEquals(1, customerList.size());
    }

    @Test
    void getAllCustomersBirthDay() {
        Date date = new Date(99, Calendar.NOVEMBER, 13);
        System.out.println(">>>>>>> "+date);
        List<Customer> customerList = customerService.getAllCustomersBirthDay(date);
        assertEquals(1, customerList.size());
    }
}