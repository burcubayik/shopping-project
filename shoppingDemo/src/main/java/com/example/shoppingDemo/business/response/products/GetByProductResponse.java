package com.example.shoppingDemo.business.response.products;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByProductResponse {
    private String name;
    private String detail;
    private double unitPrice;
    private int categoryId;
    private int supplierId;
}
