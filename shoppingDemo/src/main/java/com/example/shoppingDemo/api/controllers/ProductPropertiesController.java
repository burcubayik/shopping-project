package com.example.shoppingDemo.api.controllers;

import com.example.shoppingDemo.business.abstracts.ProductPropertyService;
import com.example.shoppingDemo.business.request.productProperties.CreateProductPropertyRequest;
import com.example.shoppingDemo.business.request.productProperties.DeleteProductPropertyRequest;
import com.example.shoppingDemo.business.request.productProperties.UpdateProductPropertyRequest;
import com.example.shoppingDemo.business.response.productProperties.GetAllProductPropertiesResponse;
import com.example.shoppingDemo.business.response.productProperties.GetByProductPropertyResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productProperties")
public class ProductPropertiesController {

    @Autowired
    ProductPropertyService productPropertyService;

    public ProductPropertiesController(ProductPropertyService productPropertyService) {
        this.productPropertyService = productPropertyService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CreateProductPropertyRequest createProductPropertyRequest) {
        return this.productPropertyService.add(createProductPropertyRequest);
    }

    @PutMapping("/update")
    public Result update(@RequestBody UpdateProductPropertyRequest updateProductPropertyRequest) {
        return this.productPropertyService.update(updateProductPropertyRequest);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody DeleteProductPropertyRequest deleteProductPropertyRequest) {
        return this.productPropertyService.delete(deleteProductPropertyRequest);
    }

    @GetMapping("/getall")
    public DataResult<List<GetAllProductPropertiesResponse>> getAll() {
        return this.productPropertyService.getAll();
    }

    @GetMapping("/getbyid")
    public DataResult<GetByProductPropertyResponse> getById(@RequestParam int id) {
        return this.productPropertyService.getById(id);
    }
}
