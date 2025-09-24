package com.evrentalsystem.evRentalSystem.service;

import com.evrentalsystem.evRentalSystem.entity.EmployeeDetail;
import com.evrentalsystem.evRentalSystem.repository.EmployeeDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeDetailService {
    private final EmployeeDetailRepository employeeDetailRepository;

    public EmployeeDetail getById(Long id) {
        return employeeDetailRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Employee detail not found"));
    }

    public EmployeeDetail save(EmployeeDetail employeeDetail) {
        return employeeDetailRepository.save(employeeDetail);
    }
}
