package com.cck.Spring_Ecommerce_API.services.auth;

import com.cck.Spring_Ecommerce_API.dto.SignupRequest;
import com.cck.Spring_Ecommerce_API.dto.UserDto;

public interface AuthService {

    UserDto createUser(SignupRequest signupRequest);
    Boolean hasUserWithEmail(String email);
}
