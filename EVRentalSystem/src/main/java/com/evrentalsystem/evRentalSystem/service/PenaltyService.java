package com.evrentalsystem.evRentalSystem.service;

import com.evrentalsystem.evRentalSystem.entity.Penalty;
import com.evrentalsystem.evRentalSystem.repository.PenaltyRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PenaltyService {
    private final PenaltyRepository penaltyRepository;

    public Penalty getById(Long id) {
        return penaltyRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Penalty not found"));
    }

    public Penalty save(Penalty penalty) {
        return penaltyRepository.save(penalty);
    }
}
