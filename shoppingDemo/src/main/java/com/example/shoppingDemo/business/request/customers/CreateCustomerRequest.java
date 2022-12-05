package com.example.shoppingDemo.business.request.customers;

import com.example.shoppingDemo.business.request.users.CreateUserRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateCustomerRequest {
    private CreateUserRequest createUserRequest;
    private String customerNumber;

}
