package com.example.shoppingDemo.business.request.suppliers;

import com.example.shoppingDemo.business.request.users.CreateUserRequest;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CreateSupplierRequest {
    CreateUserRequest createUserRequest;
    private String name;
    private double point;
}
