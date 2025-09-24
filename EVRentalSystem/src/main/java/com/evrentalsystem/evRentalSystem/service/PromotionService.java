package com.evrentalsystem.evRentalSystem.service;

import com.evrentalsystem.evRentalSystem.entity.Promotion;
import com.evrentalsystem.evRentalSystem.repository.PromotionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PromotionService {
    private final PromotionRepository promotionRepository;

    public List<Promotion> getAll() {
        return promotionRepository.findAll();
    }

    public Promotion save(Promotion promotion) {
        return promotionRepository.save(promotion);
    }
}
