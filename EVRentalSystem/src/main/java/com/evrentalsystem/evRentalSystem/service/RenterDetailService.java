package com.evrentalsystem.evRentalSystem.service;

import com.evrentalsystem.evRentalSystem.entity.RenterDetail;
import com.evrentalsystem.evRentalSystem.repository.RenterDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class RenterDetailService {
    private final RenterDetailRepository renterDetailRepository;

    public RenterDetail getById(Long id) {
        return renterDetailRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Renter detail not found"));
    }

    public RenterDetail save(RenterDetail renterDetail) {
        return renterDetailRepository.save(renterDetail);
    }
}
