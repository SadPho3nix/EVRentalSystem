package com.evrentalsystem.evRentalSystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@Builder
@AllArgsConstructor
@Entity
@Table(name = "Renter_Detail")
public class RenterDetail {

    @Id
    @Column(name = "renter_id")
    private Integer renterId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "renter_id")
    private User renter;

    @Column(nullable = false, length = 50)
    private String idNumber;

    @Column(nullable = false, length = 50)
    private String driverLicense;

    @Column(nullable = false)
    private String verificationStatus; // PENDING / VERIFIED

    private Boolean isRisky = false;
}
