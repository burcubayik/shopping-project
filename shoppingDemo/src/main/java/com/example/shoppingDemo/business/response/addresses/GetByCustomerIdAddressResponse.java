package com.example.shoppingDemo.business.response.addresses;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetByCustomerIdAddressResponse {
    private String userName;///?
    private String detail;
    private String cityName;
    private String countryName;
}
