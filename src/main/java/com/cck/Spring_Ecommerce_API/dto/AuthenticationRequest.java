package com.cck.Spring_Ecommerce_API.dto;

import lombok.Data;

@Data
public class AuthenticationRequest {

    private String username;
    private String password;
}
