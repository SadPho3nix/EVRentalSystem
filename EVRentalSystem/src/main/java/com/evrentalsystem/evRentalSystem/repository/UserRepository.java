package com.evrentalsystem.evRentalSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.evrentalsystem.evRentalSystem.entity.User;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    //Kiem tra email da ton tai hay chua
    boolean existsByEmail(String email);
    //Kiem tra xem username co ton tai khong
    boolean existsByUsername(String username);
    Optional<User> findByUsername(String username);
}
