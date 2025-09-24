package com.evrentalsystem.evRentalSystem.service;

import com.evrentalsystem.evRentalSystem.entity.VehicleDetail;
import com.evrentalsystem.evRentalSystem.repository.VehicleDetailRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class VehicleDetailService {
    private final VehicleDetailRepository vehicleDetailRepository;

    public VehicleDetail getByLicensePlate(String licensePlate) {
        return vehicleDetailRepository.findById(licensePlate)
                .orElseThrow(() -> new RuntimeException("Vehicle detail not found"));
    }

    public VehicleDetail save(VehicleDetail vehicleDetail) {
        return vehicleDetailRepository.save(vehicleDetail);
    }
}
