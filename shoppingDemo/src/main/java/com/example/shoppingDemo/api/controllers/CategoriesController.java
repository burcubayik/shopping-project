package com.example.shoppingDemo.api.controllers;

import com.example.shoppingDemo.business.abstracts.CategoryService;
import com.example.shoppingDemo.business.request.categories.CreateCategoryRequest;
import com.example.shoppingDemo.business.request.categories.DeleteCategoryRequest;
import com.example.shoppingDemo.business.request.categories.UpdateCategoryRequest;
import com.example.shoppingDemo.business.response.categories.GetAllCategoriesResponse;
import com.example.shoppingDemo.business.response.categories.GetByCategoryResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoriesController {
    @Autowired
    CategoryService categoryService;

    public CategoriesController(CategoryService categoryService) {
        this.categoryService = categoryService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CreateCategoryRequest createCategoryRequest) {
        return this.categoryService.add(createCategoryRequest);
    }

    @PutMapping("/update")
    public Result update(@RequestBody UpdateCategoryRequest updateCategoryRequest) {
        return this.categoryService.update(updateCategoryRequest);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody DeleteCategoryRequest deleteCategoryRequest) {
        return this.categoryService.delete(deleteCategoryRequest);
    }

    @GetMapping("/getall")
    public DataResult<List<GetAllCategoriesResponse>> getAll() {
        return this.categoryService.getAll();
    }

    @GetMapping("/getbyid")
    public DataResult<GetByCategoryResponse> getById(@RequestParam int id) {
        return this.categoryService.getById(id);
    }
}
