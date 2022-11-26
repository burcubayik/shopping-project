package com.example.shoppingDemo.business.response.cities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByCityResponse {
    private String name;
    private String  countryName;
}
