package com.evrentalsystem.evRentalSystem.entity;

import jakarta.persistence.*;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Payment_Method")
public class PaymentMethod {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "method_id")
    private Long methodId;

    @Column(name = "method_name", nullable = false, length = 100)
    private String methodName;

    @Column(columnDefinition = "VARCHAR(MAX)")
    private String description;

    @Column(name = "qr_image", columnDefinition = "VARCHAR(MAX)")
    private String qrImage;

    @Column(nullable = false, length = 20)
    private String status = "ACTIVE";
}
