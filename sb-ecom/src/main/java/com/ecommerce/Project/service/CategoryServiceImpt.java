package com.ecommerce.Project.service;

import com.ecommerce.Project.Category;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Optional;

@Service
public class CategoryServiceImpt implements CategoryService{

    private List<Category> categories = new ArrayList<>();
    private long nextId = 1L;

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }

    @Override
    public boolean createCategory(Category category) {
        if(category != null){
            category.setCategoryId(nextId++);
            categories.add(category);
            return true;
        }
        else {
            return false;
        }

    }

    @Override
    public String deleteCetagory(Long categoryId) {
        Category category = categories.stream()
                .filter(c -> c.getCategoryId() == (categoryId))
                        .findFirst().orElse(null);

        if(category == null){
            return "Category not found";
        }
        categories.remove(category);
        return "category"+categoryId+"deleted succesfully" ;
    }

    @Override
    public boolean updateCategory(Category category, Long categoryId) {
        for(Category ca : categories){
            if(ca.getCategoryId() == categoryId){
                ca.setCategoryName(category.getCategoryName());  //(updatedChallenge.getMonth());
                return true;
            }
        }
        return false;
    }

}
