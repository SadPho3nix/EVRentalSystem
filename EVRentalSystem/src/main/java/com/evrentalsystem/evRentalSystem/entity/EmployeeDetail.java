package com.evrentalsystem.evRentalSystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Employee_Detail")
public class EmployeeDetail {

    @Id
    @Column(name = "staff_id")
    private Long staffId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "staff_id")
    private User staff;

    @ManyToOne
    @JoinColumn(name = "station_id", nullable = false)
    private Station station;
}
