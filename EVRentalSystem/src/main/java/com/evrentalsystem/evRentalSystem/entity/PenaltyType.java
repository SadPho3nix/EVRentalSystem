package com.evrentalsystem.evRentalSystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Penalty_Type")
public class PenaltyType {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "penalty_type_id")
    private Long penaltyTypeId;

    @Column(name = "type_name", nullable = false, length = 100)
    private String typeName;

    @Column(columnDefinition = "VARCHAR(MAX)")
    private String description;

    @Column(name = "base_fee", nullable = false, precision = 10, scale = 2)
    private Double baseFee;
}
