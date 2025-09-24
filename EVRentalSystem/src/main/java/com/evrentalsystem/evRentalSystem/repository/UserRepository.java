package com.evrentalsystem.evRentalSystem.repository;

import com.evrentalsystem.evRentalSystem.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository {
    User getUserByUsername(String username);
    User getUserById(Integer id);
    boolean existsUserByUsername(String username);
    boolean existsUserById(Integer id);
}
