package com.cck.Spring_Ecommerce_API.dto;

import lombok.Data;

@Data
public class AddProductInCartDto {

    private Long userId;
    private Long productId;
}
