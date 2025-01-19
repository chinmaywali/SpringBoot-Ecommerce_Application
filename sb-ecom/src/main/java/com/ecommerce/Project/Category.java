package com.ecommerce.Project;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(name = "categories")// to make table ,, default db name - Category., if not mention name
public class Category {
    @Id//primary key
    private long CategoryId;
    private String CategoryName;


    public Category(long Categoryid , String categoryname) {
        this.CategoryId = Categoryid;
        this.CategoryName = categoryname;
    }

    public Category() {
    }

    public long getCategoryId() {
        return CategoryId;
    }

    public void setCategoryId(long categoryId) {
        CategoryId = categoryId;
    }

    public String getCategoryName() {
        return CategoryName;
    }

    public void setCategoryName(String categoryName) {
        CategoryName = categoryName;
    }
}
