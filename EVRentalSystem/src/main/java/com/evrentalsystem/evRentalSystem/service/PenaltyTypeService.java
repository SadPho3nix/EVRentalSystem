package com.evrentalsystem.evRentalSystem.service;

import com.evrentalsystem.evRentalSystem.entity.PenaltyType;
import com.evrentalsystem.evRentalSystem.repository.PenaltyTypeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PenaltyTypeService {
    private final PenaltyTypeRepository penaltyTypeRepository;

    public List<PenaltyType> getAll() {
        return penaltyTypeRepository.findAll();
    }

    public PenaltyType save(PenaltyType type) {
        return penaltyTypeRepository.save(type);
    }
}

