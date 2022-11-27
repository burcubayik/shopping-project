package com.example.shoppingDemo.business.response.carts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCartsResponse {
    private int id;
    private int customerId;
    private int productId;

}
