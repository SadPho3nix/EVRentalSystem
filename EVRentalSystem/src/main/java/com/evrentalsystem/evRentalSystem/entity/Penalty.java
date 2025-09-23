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
@Table(name = "Penalty")
public class Penalty {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long penaltyId;

    private Double amount;
    private String notes;
    private LocalDateTime createdAt;

    @ManyToOne
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;

    @ManyToMany
    @JoinTable(
            name = "Penalty_Detail",
            joinColumns = @JoinColumn(name = "penalty_id"),
            inverseJoinColumns = @JoinColumn(name = "penalty_type_id")
    )
    private List<PenaltyType> penaltyTypes;
}

