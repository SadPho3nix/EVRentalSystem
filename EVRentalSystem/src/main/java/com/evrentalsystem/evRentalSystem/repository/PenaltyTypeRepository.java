package com.evrentalsystem.evRentalSystem.repository;

import com.evrentalsystem.evRentalSystem.entity.PenaltyType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PenaltyTypeRepository extends JpaRepository<PenaltyType, Long> {
}
