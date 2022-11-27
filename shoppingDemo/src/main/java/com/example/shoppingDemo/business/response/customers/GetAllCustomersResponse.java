package com.example.shoppingDemo.business.response.customers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllCustomersResponse {
    private int customerId;
    private String customerNumber;
}
