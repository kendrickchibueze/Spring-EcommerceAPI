package com.cck.Spring_Ecommerce_API.services.customer.cart;

import com.cck.Spring_Ecommerce_API.dto.AddProductInCartDto;
import com.cck.Spring_Ecommerce_API.dto.OrderDto;
import org.springframework.http.ResponseEntity;

public interface CartService {

    ResponseEntity<?> addProductToCart(AddProductInCartDto addProductInCartDto);
    OrderDto getCartByUserId(Long userId);
}
