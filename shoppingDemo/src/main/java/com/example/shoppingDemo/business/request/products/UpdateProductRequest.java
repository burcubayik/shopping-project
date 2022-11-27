package com.example.shoppingDemo.business.request.products;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateProductRequest {
    private int id;
    private String name;
    private String detail;
    private double unitPrice;
    private int categoryId;
    private int supplierId;
}
