package com.evrentalsystem.evRentalSystem.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Contract")
public class Contract {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contract_id")
    private Long contractId;

    // 1 Order có 1 Contract
    @OneToOne
    @JoinColumn(name = "order_id", nullable = false, unique = true)
    private Order order;

    // 1 Renter có 1 Contract
    @OneToOne
    @JoinColumn(name = "renter_id", nullable = false, unique = true)
    private User renter;

    // 1 Staff quản lý nhiều Contract
    @ManyToOne
    @JoinColumn(name = "staff_id", nullable = false)
    private User staff;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "contract_file", columnDefinition = "VARCHAR(MAX)")
    private String contractFile;

    @Column(columnDefinition = "VARCHAR(MAX)")
    private String notes;
}
