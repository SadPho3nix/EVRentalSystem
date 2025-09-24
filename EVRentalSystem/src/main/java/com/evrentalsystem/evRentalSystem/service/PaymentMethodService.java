package com.evrentalsystem.evRentalSystem.service;

import com.evrentalsystem.evRentalSystem.entity.PaymentMethod;
import com.evrentalsystem.evRentalSystem.repository.PaymentMethodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PaymentMethodService {
    private final PaymentMethodRepository paymentMethodRepository;

    public List<PaymentMethod> getAll() {
        return paymentMethodRepository.findAll();
    }

    public PaymentMethod save(PaymentMethod method) {
        return paymentMethodRepository.save(method);
    }
}
