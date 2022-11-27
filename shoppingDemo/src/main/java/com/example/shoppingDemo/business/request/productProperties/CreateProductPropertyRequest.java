package com.example.shoppingDemo.business.request.productProperties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreateProductPropertyRequest {
    private int productId;
    private int propertyId;

}
