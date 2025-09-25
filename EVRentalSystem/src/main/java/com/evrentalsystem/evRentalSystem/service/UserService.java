package com.evrentalsystem.evRentalSystem.service;

import com.evrentalsystem.evRentalSystem.dto.request.UserSignupRequest;
import com.evrentalsystem.evRentalSystem.entity.RenterDetail;
import com.evrentalsystem.evRentalSystem.entity.Role;
import com.evrentalsystem.evRentalSystem.entity.User;
import com.evrentalsystem.evRentalSystem.mapper.UserMapper;
import com.evrentalsystem.evRentalSystem.repository.EmployeeDetailRepository;
import com.evrentalsystem.evRentalSystem.repository.RenterDetailRepository;
import com.evrentalsystem.evRentalSystem.repository.RoleRepository;
import com.evrentalsystem.evRentalSystem.repository.UserRepository;
import lombok.AccessLevel;
import lombok.RequiredArgsConstructor;
import lombok.experimental.FieldDefaults;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE, makeFinal = true)
public class    UserService {
    UserRepository userRepository;
    RenterDetailRepository renterDetailRepository;
    EmployeeDetailRepository employeeDetailRepository;
    RoleRepository roleRepository;

    UserMapper userMapper;

    public User signupRenter(UserSignupRequest request) {
        //Tim xem username co trung` hay khoong
        if(userRepository.existsByUsername(request.getUsername())) {
            throw new RuntimeException("Username already exists");
        }
        //Dung mapstruct de chuyen request thanh user
        User user = userMapper.toUser(request);
        //Dung thuat toan BCrypt de ma hoa mat khau
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        //Tao role cho renter
        Role renterRole = roleRepository.findByRoleName("RENTER");
        user.setRole(renterRole);

        User savedUser = userRepository.save(user);

        RenterDetail detail = RenterDetail.builder()
                .renter(savedUser)
                .idNumber(request.getIdNumber())
                .driverLicense(request.getDriverLicense())
                .verificationStatus("PENDING")
                .isRisky(false)
                .build();
        renterDetailRepository.save(detail);

        return savedUser;
    }
}
