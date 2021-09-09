package com.lab.promotion.services;

import com.lab.promotion.model.Customer;
import com.lab.promotion.model.Promotion;
import com.lab.promotion.repository.PromotionRepository;
import com.lab.promotion.util.MessageEmail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class PromotionService {
    private final PromotionRepository promotionRepository;
    private final CustomerService customerService;
    private final EmailService emailService;

    @Value("${bid.promotion}")
    private String promotion;

    public PromotionService(PromotionRepository promotionRepository,
                            CustomerService customerService,
                            EmailService emailService) {
        this.promotionRepository = promotionRepository;
        this.customerService = customerService;
        this.emailService = emailService;
    }

    public Promotion create(Promotion customer){
        return promotionRepository.save(customer);
    }

    public void sendEmailOfPromotions(Date birthDate){
        //fixme: create template email

        List<Customer> customers = customerService.getAllCustomersBirthDay(birthDate);

        MessageEmail email = new MessageEmail("Promocion", this.promotion);
        for (Customer customer: customers) {
            email.setUser(customer.getFirstName());
            emailService.sendSimpleMessage(
                    customer.getEmail(),
                    email.getSubject(),
                    email.getMessage()
            );
        }
    }
}
