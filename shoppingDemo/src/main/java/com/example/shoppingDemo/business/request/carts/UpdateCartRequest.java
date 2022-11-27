package com.example.shoppingDemo.business.request.carts;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCartRequest {

    private int id;
    private int customerId;
    private int productId;

}
