package com.evrentalsystem.evRentalSystem.repository;

import com.evrentalsystem.evRentalSystem.entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
}
