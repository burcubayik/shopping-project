package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.CategoryService;
import com.example.shoppingDemo.business.request.categories.CreateCategoryRequest;
import com.example.shoppingDemo.business.request.categories.DeleteCategoryRequest;
import com.example.shoppingDemo.business.request.categories.UpdateCategoryRequest;
import com.example.shoppingDemo.business.response.categories.GetAllCategoriesResponse;
import com.example.shoppingDemo.business.response.categories.GetByCategoryResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryManager implements CategoryService {
    @Override
    public Result add(CreateCategoryRequest createCategoryRequest) {
        return null;
    }

    @Override
    public Result update(UpdateCategoryRequest updateCategoryRequest) {
        return null;
    }

    @Override
    public Result delete(DeleteCategoryRequest deleteCategoryRequest) {
        return null;
    }

    @Override
    public DataResult<List<GetAllCategoriesResponse>> getAll() {
        return null;
    }

    @Override
    public DataResult<GetByCategoryResponse> getById(int id) {
        return null;
    }
}
