package com.cck.Spring_Ecommerce_API.dto;

import com.cck.Spring_Ecommerce_API.entity.CartItems;
import com.cck.Spring_Ecommerce_API.entity.User;
import com.cck.Spring_Ecommerce_API.enums.OrderStatus;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;
import java.util.UUID;

@Data
public class OrderDto {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String orderDescription;

    private Date date;

    private Long amount;

    private String address;

    private OrderStatus orderStatus;

    private Long totalAmount;

    private Long discount;

    private UUID trackingId;

    private String userName;


    private List<CartItemsDto> cartItems;

}
