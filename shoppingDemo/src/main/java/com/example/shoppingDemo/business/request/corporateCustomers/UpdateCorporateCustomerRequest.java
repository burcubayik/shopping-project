package com.example.shoppingDemo.business.request.corporateCustomers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateCorporateCustomerRequest {
    private int corporateCustomerId;
    private String taxNumber;
    private String companyName;

}
