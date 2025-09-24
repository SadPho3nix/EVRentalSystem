package com.evrentalsystem.evRentalSystem.mapper;

import com.evrentalsystem.evRentalSystem.dto.request.UserSignupRequest;
import com.evrentalsystem.evRentalSystem.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface UserMapper {
    //Convert request thanh` user
    @Mapping(target = "userId", ignore = true)
    @Mapping(target = "createdAt", expression = "java(java.time.LocalDateTime.now())")
    @Mapping(target = "status", constant = "ACTIVE")
    @Mapping(target = "role", ignore = true)
    User toUser(UserSignupRequest request);
}
