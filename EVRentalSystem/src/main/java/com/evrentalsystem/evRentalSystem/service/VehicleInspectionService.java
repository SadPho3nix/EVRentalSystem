package com.evrentalsystem.evRentalSystem.service;

import com.evrentalsystem.evRentalSystem.entity.VehicleInspection;
import com.evrentalsystem.evRentalSystem.repository.VehicleInspectionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class VehicleInspectionService {
    private final VehicleInspectionRepository inspectionRepository;

    public List<VehicleInspection> getAll() {
        return inspectionRepository.findAll();
    }

    public VehicleInspection save(VehicleInspection inspection) {
        return inspectionRepository.save(inspection);
    }
}
