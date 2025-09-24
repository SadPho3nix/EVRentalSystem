package com.evrentalsystem.evRentalSystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "Employee_Detail")
public class EmployeeDetail {

    @Id
    @Column(name = "staff_id")
    private Integer staffId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "staff_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "station_id", nullable = false)
    private Station station;
}
