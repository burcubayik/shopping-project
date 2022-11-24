package com.example.shoppingDemo.business.response.cities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCitiesResponse {
    private int id;
    private String name;
}
