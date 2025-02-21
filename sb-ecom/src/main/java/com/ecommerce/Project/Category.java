//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.ecommerce.Project;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity(
    name = "categoriies"
)
public class Category {
    @Id
    private long CategoryId;
    private String CategoryName;

    public Category(long Categoryid, String categoryname) {
        this.CategoryId = Categoryid;
        this.CategoryName = categoryname;
    }

    public Category() {
    }

    public long getCategoryId() {
        return this.CategoryId;
    }

    public void setCategoryId(long categoryId) {
        this.CategoryId = categoryId;
    }

    public String getCategoryName() {
        return this.CategoryName;
    }

    public void setCategoryName(String categoryName) {
        this.CategoryName = categoryName;
    }
}
