package com.example.shoppingDemo.business.response.address;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllAddressesResponse {
    private String userName;///?
    private String detail;
    private String cityName;
    private String countryName;
}
