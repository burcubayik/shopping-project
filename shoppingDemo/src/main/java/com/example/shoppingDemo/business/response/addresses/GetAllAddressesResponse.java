package com.example.shoppingDemo.business.response.addresses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllAddressesResponse {
    private int id;
    private String userName;///?
    private String detail;
    private String cityName;
    private String countryName;
}
