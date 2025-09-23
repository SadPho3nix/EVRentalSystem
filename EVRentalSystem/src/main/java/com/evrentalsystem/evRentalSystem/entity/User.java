package com.evrentalsystem.evRentalSystem.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "User")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long userId;

    private String username;
    private String password;
    private String fullName;
    private String phone;
    private String email;
    private String address;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;

    @OneToOne(mappedBy = "user", cascade = CascadeType.ALL)
    private RenterDetail renterDetail;

    @OneToMany(mappedBy = "renter")
    private List<Order> orders;

    @OneToMany(mappedBy = "staff")
    private List<VehicleInspection> inspections;

    @OneToMany(mappedBy = "staff")
    private List<Contract> contracts;

    @OneToMany(mappedBy = "renter")
    private List<Review> reviews;
}

