package com.ecommerce.Project.repositories;

import com.ecommerce.Project.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category,Long> {
}

