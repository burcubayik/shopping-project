package com.example.shoppingDemo.business.request.corporateCustomers;

import com.example.shoppingDemo.business.request.customers.CreateCustomerRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCorporateCustomerRequest {

    private String taxNumber;
    private String companyName;
    private CreateCustomerRequest createCustomerRequest;
}
