package com.example.shoppingDemo.business.request.countries;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCountryRequest {
    private int id;
    private String name;
}
