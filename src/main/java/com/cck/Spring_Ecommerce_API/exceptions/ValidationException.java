package com.cck.Spring_Ecommerce_API.exceptions;

public class ValidationException extends RuntimeException {

    public ValidationException(String message){
        super(message);
    }
}
