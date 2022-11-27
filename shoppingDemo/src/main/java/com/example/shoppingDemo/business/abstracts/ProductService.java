package com.example.shoppingDemo.business.abstracts;


import com.example.shoppingDemo.business.request.products.CreateProductRequest;
import com.example.shoppingDemo.business.request.products.DeleteProductRequest;
import com.example.shoppingDemo.business.request.products.UpdateProductRequest;
import com.example.shoppingDemo.business.response.products.GetAllProductsResponse;
import com.example.shoppingDemo.business.response.products.GetByProductResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;

import java.util.List;

public interface ProductService {

    Result add(CreateProductRequest createProductRequest);
    Result update(UpdateProductRequest updateProductRequest);
    Result delete(DeleteProductRequest deleteProductRequest);
    DataResult<List<GetAllProductsResponse>> getAll();
    DataResult<GetByProductResponse> getById(int id);
}
