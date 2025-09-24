package com.evrentalsystem.evRentalSystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "Vehicle_Detail")
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @Builder
public class VehicleDetail {
    @Id
    private String licensePlate;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false)
    private Vehicle vehicle;

    private String color;
    private Integer seats;
    private String batteryCapacity;
    private Integer odo;
}
