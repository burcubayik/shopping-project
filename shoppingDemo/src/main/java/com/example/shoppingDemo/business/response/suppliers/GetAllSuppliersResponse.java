package com.example.shoppingDemo.business.response.suppliers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllSuppliersResponse {
    private int id;
    private String name;
    private double point;
}
