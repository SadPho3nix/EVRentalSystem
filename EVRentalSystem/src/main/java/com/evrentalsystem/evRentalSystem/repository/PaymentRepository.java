package com.evrentalsystem.evRentalSystem.repository;

import com.evrentalsystem.evRentalSystem.entity.Payment;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PaymentRepository extends JpaRepository<Payment, Long> {
}
