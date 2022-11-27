package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.ProductPropertyService;
import com.example.shoppingDemo.business.request.productProperties.CreateProductPropertyRequest;
import com.example.shoppingDemo.business.request.productProperties.DeleteProductPropertyRequest;
import com.example.shoppingDemo.business.request.productProperties.UpdateProductPropertyRequest;
import com.example.shoppingDemo.business.response.productProperties.GetAllProductPropertiesResponse;
import com.example.shoppingDemo.business.response.productProperties.GetByProductPropertyResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ProductPropertyManager implements ProductPropertyService {
    @Override
    public Result add(CreateProductPropertyRequest createProductPropertyRequest) {
        return null;
    }

    @Override
    public Result update(UpdateProductPropertyRequest updateProductPropertyRequest) {
        return null;
    }

    @Override
    public Result delete(DeleteProductPropertyRequest deleteProductPropertyRequest) {
        return null;
    }

    @Override
    public DataResult<List<GetAllProductPropertiesResponse>> getAll() {
        return null;
    }

    @Override
    public DataResult<GetByProductPropertyResponse> getById(int id) {
        return null;
    }
}
