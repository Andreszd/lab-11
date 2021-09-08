package com.lab.promotion.services;

import com.lab.promotion.model.Promotion;
import com.lab.promotion.repository.PromotionRepository;
import org.springframework.stereotype.Service;

@Service
public class PromotionService {
    private final PromotionRepository promotionRepository;

    public PromotionService(PromotionRepository promotionRepository) {
        this.promotionRepository = promotionRepository;
    }

    public Promotion create(Promotion customer){
        return promotionRepository.save(customer);
    }
}
