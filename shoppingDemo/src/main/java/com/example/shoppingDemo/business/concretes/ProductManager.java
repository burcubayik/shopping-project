package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.ProductService;
import com.example.shoppingDemo.business.request.products.CreateProductRequest;
import com.example.shoppingDemo.business.request.products.DeleteProductRequest;
import com.example.shoppingDemo.business.request.products.UpdateProductRequest;
import com.example.shoppingDemo.business.response.products.GetAllProductsResponse;
import com.example.shoppingDemo.business.response.products.GetByProductResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductManager implements ProductService {
    @Override
    public Result add(CreateProductRequest createProductRequest) {
        return null;
    }

    @Override
    public Result update(UpdateProductRequest updateProductRequest) {
        return null;
    }

    @Override
    public Result delete(DeleteProductRequest deleteProductRequest) {
        return null;
    }

    @Override
    public DataResult<List<GetAllProductsResponse>> getAll() {
        return null;
    }

    @Override
    public DataResult<GetByProductResponse> getById(int id) {
        return null;
    }
}
