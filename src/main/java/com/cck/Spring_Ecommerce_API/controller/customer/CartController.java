package com.cck.Spring_Ecommerce_API.controller.customer;


import com.cck.Spring_Ecommerce_API.dto.AddProductInCartDto;
import com.cck.Spring_Ecommerce_API.services.customer.cart.CartService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/customer")
@RequiredArgsConstructor
public class CartController {

    private final CartService cartService;

    @PostMapping("/cart")
    public ResponseEntity<?> addProductToCart(@RequestBody AddProductInCartDto addProductInCartDto){
     return cartService.addProductToCart(addProductInCartDto);
    }
}
