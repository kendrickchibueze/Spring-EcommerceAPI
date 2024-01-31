package com.cck.Spring_Ecommerce_API.repository;

import com.cck.Spring_Ecommerce_API.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

}
