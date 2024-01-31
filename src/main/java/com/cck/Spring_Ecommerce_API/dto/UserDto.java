package com.cck.Spring_Ecommerce_API.dto;

import com.cck.Spring_Ecommerce_API.enums.UserRole;
import lombok.Data;

@Data
public class UserDto {
    private Long id;
    private String email;

    private String name;
    private UserRole userRole;
}
