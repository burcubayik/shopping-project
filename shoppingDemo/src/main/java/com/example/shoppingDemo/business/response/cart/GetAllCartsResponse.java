package com.example.shoppingDemo.business.response.cart;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCartsResponse {
    private int customerId;
    private int productId;

}
