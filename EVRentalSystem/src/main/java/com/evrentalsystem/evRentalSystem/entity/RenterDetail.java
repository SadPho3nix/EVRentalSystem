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
    private Long renterId;

    private String idNumber;
    private String driverLicense;
    private String verificationStatus;
    private Boolean isRisky;

    @OneToOne
    @MapsId
    @JoinColumn(name = "renter_id")
    private User user;
}
