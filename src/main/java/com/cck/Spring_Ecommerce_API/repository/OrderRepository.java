package com.cck.Spring_Ecommerce_API.repository;

import com.cck.Spring_Ecommerce_API.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
