package com.evrentalsystem.evRentalSystem.dto.request;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)
public class UserSignupRequest {
    private String username;
    private String password;
    private String fullName;
    private String phone;
    private String email;
    private String address;

    //Lay tu bang renter detail
    private String idNumber;
    private String driverLicense;
}
