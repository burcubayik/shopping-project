package com.example.shoppingDemo.business.response.corporateCustomers;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByCorporateCustomerResponse {
    private int corporateCustomerId;
}
