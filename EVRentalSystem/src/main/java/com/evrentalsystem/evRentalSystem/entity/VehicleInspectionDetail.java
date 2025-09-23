package com.evrentalsystem.evRentalSystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Vehicle_Inspection_Detail")
public class VehicleInspectionDetail {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "detail_id")
    private Long detailId;

    @ManyToOne
    @JoinColumn(name = "inspection_id", nullable = false)
    private VehicleInspection inspection;

    @Column(name = "part_name", nullable = false, length = 100)
    private String partName;

    @Column(name = "is_checked", nullable = false)
    private Boolean isChecked = false;

    @Column(columnDefinition = "VARCHAR(MAX)")
    private String notes;
}
