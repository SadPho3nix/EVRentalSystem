package com.evrentalsystem.evRentalSystem.service;

import com.evrentalsystem.evRentalSystem.entity.VehicleInspectionDetail;
import com.evrentalsystem.evRentalSystem.repository.VehicleInspectionDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehicleInspectionDetailService {
    private final VehicleInspectionDetailRepository inspectionDetailRepository;

    public VehicleInspectionDetail getById(Long id) {
        return inspectionDetailRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Inspection detail not found"));
    }

    public VehicleInspectionDetail save(VehicleInspectionDetail detail) {
        return inspectionDetailRepository.save(detail);
    }
}
