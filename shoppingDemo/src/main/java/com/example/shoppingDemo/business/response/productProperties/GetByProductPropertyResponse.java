package com.example.shoppingDemo.business.response.productProperties;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class GetByProductPropertyResponse {
    private int id;
    private int productId;
    private int propertyId;
}
