package com.ecommerce.Project;

import com.ecommerce.Project.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CategoryController {
    @Autowired
    private CategoryService categoryService;

//    public CategoryController(CategoryService categoryService) {
//        this.categoryService = categoryService;  use @autowierd instead

    @GetMapping("/public/categories")
    public ResponseEntity<List<Category>> getAllCategories(){
        return new ResponseEntity<>(categoryService.getAllCategories(), HttpStatus.OK);
    }

    @PostMapping("/public/categories")
    public ResponseEntity<String> addCategories(@RequestBody Category category){
        categoryService.createCategory(category);
        return new ResponseEntity<>("Category add Succesfully" , HttpStatus.OK);
    }

    @DeleteMapping("/public/categories/{CategoryId}")
    public ResponseEntity<String> deleteCetagories(@PathVariable Long CategoryId){
        String status = categoryService.deleteCetagory(CategoryId);
        return new ResponseEntity<>(status , HttpStatus.OK);
    }

    @PutMapping("/public/categories/{CategoryId}")
    public  ResponseEntity<String> updateCategory( @RequestBody Category category , @PathVariable Long CategoryId){
        boolean isCategoryAdded = categoryService.updateCategory(category,CategoryId);
        if(isCategoryAdded){
            return new ResponseEntity<>("Updated",HttpStatus.OK);
        }
        else{
            return new ResponseEntity<>("not Updated",HttpStatus.NOT_FOUND);
        }
    }
}
