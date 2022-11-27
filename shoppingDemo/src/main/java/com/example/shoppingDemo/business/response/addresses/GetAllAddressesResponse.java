package com.example.shoppingDemo.business.response.addresses;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllAddressesResponse {
    private int id;
    private String userName;///?
    private String detail;
    private String cityName;
    private String countryName;
}
