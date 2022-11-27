package com.example.shoppingDemo.business.response.corporateCustomers;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCorporateCustomersResponse {
    private int corporateCustomerId;
    private String taxNumber;
    private String companyName;
}
