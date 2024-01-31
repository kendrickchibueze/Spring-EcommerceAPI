package com.cck.Spring_Ecommerce_API.repository;

import com.cck.Spring_Ecommerce_API.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    List<Product> findAllByNameContaining(String title);
}
