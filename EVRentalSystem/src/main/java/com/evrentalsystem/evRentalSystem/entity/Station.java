package com.evrentalsystem.evRentalSystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Station")
public class Station {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "station_id")
    private Long stationId;

    @Column(name = "station_name", nullable = false)
    private String stationName;

    @Column(nullable = false, length = 500)
    private String address;

    @Column(name = "map_iframe", columnDefinition = "VARCHAR(MAX)")
    private String mapIframe;
}
