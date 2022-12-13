package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.CategoryService;
import com.example.shoppingDemo.business.request.categories.CreateCategoryRequest;
import com.example.shoppingDemo.business.request.categories.DeleteCategoryRequest;
import com.example.shoppingDemo.business.request.categories.UpdateCategoryRequest;
import com.example.shoppingDemo.business.response.categories.GetAllCategoriesResponse;
import com.example.shoppingDemo.business.response.categories.GetByCategoryResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import com.example.shoppingDemo.core.utilities.results.SuccessDataResult;
import com.example.shoppingDemo.core.utilities.results.SuccessResult;
import com.example.shoppingDemo.dataAccess.abstracts.CategoryRepository;
import com.example.shoppingDemo.entities.concretes.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryManager implements CategoryService {
    CategoryRepository categoryRepository;
    @Autowired
    public CategoryManager(CategoryRepository categoryRepository) {
        this.categoryRepository = categoryRepository;
    }

    @Override
    public Result add(CreateCategoryRequest createCategoryRequest) {
        Category parentCategory=this.categoryRepository.getByParentCategoryId(createCategoryRequest.getParentCategoryId());
        Category category=Category.builder()
                .parentCategory(parentCategory)
                .name(createCategoryRequest.getName())
                .build();
        this.categoryRepository.save(category);

        return new SuccessResult("CATEGORY.ADDED");
    }

    @Override
    public Result update(UpdateCategoryRequest updateCategoryRequest) {
        Category parentCategory=this.categoryRepository.getByParentCategoryId(updateCategoryRequest.getParentCategoryId());
        Category category=this.categoryRepository.findById(updateCategoryRequest.getId()).get();
        category.setName(updateCategoryRequest.getName());
        category.setParentCategory(parentCategory);
       this.categoryRepository.save(category);
        return new SuccessResult("UPDATED.CATEGORY");
    }

    @Override
    public Result delete(DeleteCategoryRequest deleteCategoryRequest) {
        Category category=this.categoryRepository.findById(deleteCategoryRequest.getId()).get();
        this.categoryRepository.delete(category);
        return new SuccessResult("DELETED.CATEGORY");
    }

    @Override
    public DataResult<List<GetAllCategoriesResponse>> getAll() {
        List<Category> result = this.categoryRepository.findAll();
        List<GetAllCategoriesResponse> response = result.stream().map(category -> GetAllCategoriesResponse.builder()
                .parentCategoryId(category.getParentCategory().getId())
                .name(category.getName())
                .build()).collect(Collectors.toList());
        return new SuccessDataResult<>(response);
    }

    @Override
    public DataResult<GetByCategoryResponse> getById(int id) {
        Category result = this.categoryRepository.findById(id).get();
        GetByCategoryResponse response = GetByCategoryResponse.builder()
                .name(result.getName())
                .build();

        return new SuccessDataResult<>(response);
    }
}
