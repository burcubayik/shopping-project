package com.example.shoppingDemo.business.request.customers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCustomerRequest {

    private int customerId;
    private String customerNumber;
}
