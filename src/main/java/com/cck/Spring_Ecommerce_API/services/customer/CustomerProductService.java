package com.cck.Spring_Ecommerce_API.services.customer;

import com.cck.Spring_Ecommerce_API.dto.ProductDto;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface CustomerProductService {

    List<ProductDto> searchProductByTitle(String title);

    List<ProductDto> getAllProducts();
}
