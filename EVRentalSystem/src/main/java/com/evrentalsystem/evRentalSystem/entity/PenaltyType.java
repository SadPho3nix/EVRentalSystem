package com.evrentalsystem.evRentalSystem.entity;

import jakarta.persistence.*;
import lombok.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Penalty_Type")
public class PenaltyType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long penaltyTypeId;

    private String typeName;
    private String description;
    private Double baseFee;

    @ManyToMany(mappedBy = "penaltyTypes")
    private List<Penalty> penalties;
}
