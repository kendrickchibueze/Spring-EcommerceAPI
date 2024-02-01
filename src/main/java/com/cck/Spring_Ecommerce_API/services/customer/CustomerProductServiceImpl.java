package com.cck.Spring_Ecommerce_API.services.customer;

import com.cck.Spring_Ecommerce_API.dto.ProductDto;
import com.cck.Spring_Ecommerce_API.entity.Product;
import com.cck.Spring_Ecommerce_API.repository.CategoryRepository;
import com.cck.Spring_Ecommerce_API.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class CustomerProductServiceImpl implements CustomerProductService {

    @Autowired
    private final ProductRepository productRepository;

    public List<ProductDto> getAllProducts(){
        List<Product> products = productRepository.findAll();
        return products.stream().map(Product::getDto).collect(Collectors.toList());

    }

    public List<ProductDto> searchProductByTitle(String name ){
        List<Product> products = productRepository.findAllByNameContaining(name);
        return products.stream().map(Product::getDto).collect(Collectors.toList());

    }
}
