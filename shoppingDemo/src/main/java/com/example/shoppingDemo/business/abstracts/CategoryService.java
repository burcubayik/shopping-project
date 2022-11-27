package com.example.shoppingDemo.business.abstracts;
import com.example.shoppingDemo.business.request.categories.CreateCategoryRequest;
import com.example.shoppingDemo.business.request.categories.DeleteCategoryRequest;
import com.example.shoppingDemo.business.request.categories.UpdateCategoryRequest;
import com.example.shoppingDemo.business.response.categories.GetAllCategoriesResponse;
import com.example.shoppingDemo.business.response.categories.GetByCategoryResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;


import java.util.List;

public interface CategoryService {

    Result add(CreateCategoryRequest createCategoryRequest);
    Result update(UpdateCategoryRequest updateCategoryRequest);
    Result delete(DeleteCategoryRequest deleteCategoryRequest);
    DataResult<List<GetAllCategoriesResponse>> getAll();
    DataResult<GetByCategoryResponse> getById(int id);
}
