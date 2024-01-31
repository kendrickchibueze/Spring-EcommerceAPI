package com.cck.Spring_Ecommerce_API.services.admin.category;


import com.cck.Spring_Ecommerce_API.dto.CategoryDto;
import com.cck.Spring_Ecommerce_API.entity.Category;
import com.cck.Spring_Ecommerce_API.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CategoryServiceImpl implements CategoryService{

    @Autowired
    private final CategoryRepository categoryRepository;

    public Category createcategory(CategoryDto categoryDto){
       Category category = new Category();
       category.setName(categoryDto.getName());
       category.setDescription(categoryDto.getDescription());

       return categoryRepository.save(category);
    }

    public List<Category> getAllCategories(){
        return categoryRepository.findAll();
    }
}
