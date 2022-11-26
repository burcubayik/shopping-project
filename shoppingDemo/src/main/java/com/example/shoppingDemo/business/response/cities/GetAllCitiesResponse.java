package com.example.shoppingDemo.business.response.cities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllCitiesResponse {
    private int id;
    private String name;
    private int countryId;
    private String countryName;
}
