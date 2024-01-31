package com.cck.Spring_Ecommerce_API.services.admin.category;

import com.cck.Spring_Ecommerce_API.dto.CategoryDto;
import com.cck.Spring_Ecommerce_API.entity.Category;

import java.util.List;

public interface CategoryService {

     Category createcategory(CategoryDto categoryDto);
     List<Category> getAllCategories();
}
