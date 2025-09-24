package com.evrentalsystem.evRentalSystem.repository;

import com.evrentalsystem.evRentalSystem.entity.Contract;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContractRepository extends JpaRepository<Contract, Long> {
}
