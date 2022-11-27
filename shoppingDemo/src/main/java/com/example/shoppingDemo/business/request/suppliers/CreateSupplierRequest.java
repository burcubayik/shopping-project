package com.example.shoppingDemo.business.request.suppliers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSupplierRequest {
    private String name;
    private double point;
}
