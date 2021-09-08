package com.lab.promotion.services;

import com.lab.promotion.model.Customer;
import com.lab.promotion.repository.CustomerRepository;
import org.springframework.stereotype.Service;

@Service
public class CustomerService {
    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public Customer create(Customer customer){
        return customerRepository.save(customer);
    }

    public Customer getUserByBirthDay(Customer customer){
        return new Customer();
    }
}
