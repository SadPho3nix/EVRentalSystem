package com.evrentalsystem.evRentalSystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Renter_Detail")
public class RenterDetail {

    @Id
    @Column(name = "renter_id")
    private Long renterId;

    @OneToOne
    @MapsId
    @JoinColumn(name = "renter_id")
    private User renter;

    @Column(name = "id_number", nullable = false, length = 50)
    private String idNumber;

    @Column(name = "driver_license", nullable = false, length = 50)
    private String driverLicense;

    @Column(name = "verification_status", nullable = false, length = 20)
    private String verificationStatus = "PENDING";

    @Column(name = "is_risky")
    private Boolean isRisky = false;
}

