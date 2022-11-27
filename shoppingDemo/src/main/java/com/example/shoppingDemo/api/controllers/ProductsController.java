package com.example.shoppingDemo.api.controllers;

import com.example.shoppingDemo.business.abstracts.ProductService;
import com.example.shoppingDemo.business.request.products.CreateProductRequest;
import com.example.shoppingDemo.business.request.products.DeleteProductRequest;
import com.example.shoppingDemo.business.request.products.UpdateProductRequest;
import com.example.shoppingDemo.business.response.products.GetAllProductsResponse;
import com.example.shoppingDemo.business.response.products.GetByProductResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    @Autowired
    ProductService productService;

    public ProductsController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CreateProductRequest createProductRequest) {
        return this.productService.add(createProductRequest);
    }

    @PutMapping("/update")
    public Result update(@RequestBody UpdateProductRequest updateProductRequest) {
        return this.productService.update(updateProductRequest);
    }

    @DeleteMapping("/delete")
    public Result delete(@RequestBody DeleteProductRequest deleteProductRequest) {
        return this.productService.delete(deleteProductRequest);
    }

    @GetMapping("/getall")
    public DataResult<List<GetAllProductsResponse>> getAll() {
        return this.productService.getAll();
    }

    @GetMapping("/getbyid")
    public DataResult<GetByProductResponse> getById(@RequestParam int id) {
        return this.productService.getById(id);
    }
}
