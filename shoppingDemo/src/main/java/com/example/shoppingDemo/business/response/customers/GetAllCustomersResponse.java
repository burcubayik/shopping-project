package com.example.shoppingDemo.business.response.customers;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCustomersResponse {
    private int customerId;
    private String customerNumber;
}
