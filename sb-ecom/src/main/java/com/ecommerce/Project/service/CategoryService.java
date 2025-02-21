package com.ecommerce.Project.service;

import com.ecommerce.Project.Category;


import java.util.List;

public interface CategoryService {

//    private List<Category> categories = new ArrayList<>();
//
//    public List<Category> getAllCategories(){
//        return categories;
//    }
//
//
//    public boolean addCategories(@RequestBody Category category){
//        if(category!=null) {
//            categories.add(category);
//            return true;
//        }
//        else {
//            return false;
//        } 
//    }
    List<Category> getAllCategories();
    boolean createCategory(Category category);

    String deleteCetagory(Long categoryId);

    boolean updateCategory(Category category, Long categoryId);
}
