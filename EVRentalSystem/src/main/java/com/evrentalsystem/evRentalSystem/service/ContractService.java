package com.evrentalsystem.evRentalSystem.service;

import com.evrentalsystem.evRentalSystem.entity.Contract;
import com.evrentalsystem.evRentalSystem.repository.ContractRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ContractService {
    private final ContractRepository contractRepository;

    public Contract getById(Long id) {
        return contractRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Contract not found"));
    }

    public Contract save(Contract contract) {
        return contractRepository.save(contract);
    }
}
