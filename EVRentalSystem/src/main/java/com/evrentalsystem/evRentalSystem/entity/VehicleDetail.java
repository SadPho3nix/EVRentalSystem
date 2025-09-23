package com.evrentalsystem.evRentalSystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Vehicle_Detail")
public class VehicleDetail {

    @Id
    @Column(name = "license_plate", length = 50)
    private String licensePlate;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    @Column(length = 50)
    private String color;

    private Integer seats;

    @Column(name = "battery_capacity", length = 50)
    private String batteryCapacity;

    private Integer odo;
}
