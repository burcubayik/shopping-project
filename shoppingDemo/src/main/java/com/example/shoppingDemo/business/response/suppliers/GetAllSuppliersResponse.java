package com.example.shoppingDemo.business.response.suppliers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllSuppliersResponse {
    private int id;
    private String name;
    private double point;
}
