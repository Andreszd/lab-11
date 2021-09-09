package com.lab.promotion.services;

import com.lab.promotion.model.Customer;
import com.lab.promotion.repository.CustomerRepository;
import com.lab.promotion.util.CompareBirthDays;
import org.springframework.stereotype.Service;

import java.util.Calendar;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer create(Customer customer){
        return customerRepository.save(customer);
    }

    public List<Customer> getAllCustomers(){
        return customerRepository.findAll();
    }

    public List<Customer> getAllCustomersBirthDay(Date dateBirthDay){
        List<Customer> customers = customerRepository.findAll();
        List<Customer> result = new LinkedList<>();
        CompareBirthDays date = new CompareBirthDays();

        for (Customer customer: customers) {
            if (date.isEquals(customer.getBirthDay(), dateBirthDay)){
                result.add(customer);
            }
        }

        return result;
    }
}
