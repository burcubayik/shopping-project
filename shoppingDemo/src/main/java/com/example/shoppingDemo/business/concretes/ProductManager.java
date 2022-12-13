package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.ProductService;
import com.example.shoppingDemo.business.request.products.CreateProductRequest;
import com.example.shoppingDemo.business.request.products.DeleteProductRequest;
import com.example.shoppingDemo.business.request.products.UpdateProductRequest;
import com.example.shoppingDemo.business.response.products.GetAllProductsResponse;
import com.example.shoppingDemo.business.response.products.GetByProductResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import com.example.shoppingDemo.core.utilities.results.SuccessDataResult;
import com.example.shoppingDemo.core.utilities.results.SuccessResult;
import com.example.shoppingDemo.dataAccess.abstracts.ProductRepository;
import com.example.shoppingDemo.entities.concretes.Category;
import com.example.shoppingDemo.entities.concretes.Product;
import com.example.shoppingDemo.entities.concretes.Supplier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductManager implements ProductService {
    ProductRepository productRepository;
    @Autowired
    public ProductManager(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public Result add(CreateProductRequest createProductRequest) {
        Category category=this.productRepository.getByCategory_Id(createProductRequest.getCategoryId());
        Supplier supplier=this.productRepository.getBySupplierId(createProductRequest.getSupplierId());
        Product product=Product.builder()
                .name(createProductRequest.getName())
                .detail(createProductRequest.getDetail())
                .unitPrice(createProductRequest.getUnitPrice())
                .category(category)
                .supplier(supplier)
                .build();
        this.productRepository.save(product);
        return new SuccessResult("PRODUCT.ADDED");
    }

    @Override
    public Result update(UpdateProductRequest updateProductRequest) {
        Category category=this.productRepository.getByCategory_Id(updateProductRequest.getCategoryId());
        Supplier supplier=this.productRepository.getBySupplierId(updateProductRequest.getSupplierId());
        Product product=this.productRepository.findById(updateProductRequest.getId()).get();
        product.setName(updateProductRequest.getName());
        product.setDetail(updateProductRequest.getDetail());
        product.setUnitPrice(updateProductRequest.getUnitPrice());
        product.setCategory(category);
        product.setSupplier(supplier);
        this.productRepository.save(product);
        return new SuccessResult("UPDATED.PRODUCT");
    }

    @Override
    public Result delete(DeleteProductRequest deleteProductRequest) {
        return null;
    }

    @Override
    public DataResult<List<GetAllProductsResponse>> getAll() {
        List<Product> result = this.productRepository.findAll();
        List<GetAllProductsResponse> response = result.stream().map(product -> GetAllProductsResponse.builder()
                .id(product.getId())
                .name(product.getName())
                .detail(product.getDetail())
                .unitPrice(product.getUnitPrice())
                .supplierId(product.getSupplier().getId())
                .categoryId(product.getCategory().getId())
                .build()).collect(Collectors.toList());

        return new SuccessDataResult<>(response);
    }

    @Override
    public DataResult<GetByProductResponse> getById(int id) {
        Product result = this.productRepository.findById(id).get();
        GetByProductResponse response = GetByProductResponse.builder()
                .name(result.getName())
                .detail(result.getDetail())
                .unitPrice(result.getUnitPrice())
                .supplierId(result.getSupplier().getId())
                .categoryId(result.getCategory().getId())
                .build();
        return new SuccessDataResult<>(response);
    }
}
