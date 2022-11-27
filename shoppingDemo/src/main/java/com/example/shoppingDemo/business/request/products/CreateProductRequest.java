package com.example.shoppingDemo.business.request.products;

import com.example.shoppingDemo.entities.concretes.Category;
import com.example.shoppingDemo.entities.concretes.Supplier;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateProductRequest {

    private String name;
    private String detail;
    private double unitPrice;
    private int categoryId;
    private int supplierId;
}
