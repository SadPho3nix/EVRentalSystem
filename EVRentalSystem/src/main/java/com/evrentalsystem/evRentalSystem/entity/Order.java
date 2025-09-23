package com.evrentalsystem.evRentalSystem.entity;

import jakarta.persistence.*;
import lombok.*;
import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "[Order]") // Order là keyword SQL, nên cần [] trong table name
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long orderId;

    @ManyToOne
    @JoinColumn(name = "renter_id", nullable = false)
    private User renter;

    @ManyToOne
    @JoinColumn(name = "staff_id")
    private User staff;

    @ManyToOne
    @JoinColumn(name = "license_plate", nullable = false)
    private VehicleDetail vehicleDetail;

    @ManyToOne
    @JoinColumn(name = "promotion_id")
    private Promotion promotion;

    @Column(name = "created_at", nullable = false)
    private LocalDateTime createdAt;

    @Column(name = "start_time", nullable = false)
    private LocalDateTime startTime;

    @Column(name = "expected_return_time", nullable = false)
    private LocalDateTime expectedReturnTime;

    @Column(name = "actual_return_time")
    private LocalDateTime actualReturnTime;

    @Column(nullable = false, precision = 10, scale = 2)
    private Double deposit;

    @Column(nullable = false, length = 20)
    private String status = "PENDING";
}
