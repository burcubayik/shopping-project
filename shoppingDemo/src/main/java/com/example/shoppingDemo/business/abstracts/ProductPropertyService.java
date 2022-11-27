package com.example.shoppingDemo.business.abstracts;


import com.example.shoppingDemo.business.request.productProperties.CreateProductPropertyRequest;
import com.example.shoppingDemo.business.request.productProperties.DeleteProductPropertyRequest;
import com.example.shoppingDemo.business.request.productProperties.UpdateProductPropertyRequest;
import com.example.shoppingDemo.business.response.productProperties.GetAllProductPropertiesResponse;
import com.example.shoppingDemo.business.response.productProperties.GetByProductPropertyResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;

import java.util.List;

public interface ProductPropertyService {
    Result add(CreateProductPropertyRequest createProductPropertyRequest);
    Result update(UpdateProductPropertyRequest updateProductPropertyRequest);
    Result delete(DeleteProductPropertyRequest deleteProductPropertyRequest);
    DataResult<List<GetAllProductPropertiesResponse>> getAll();
    DataResult<GetByProductPropertyResponse> getById(int id);
}
