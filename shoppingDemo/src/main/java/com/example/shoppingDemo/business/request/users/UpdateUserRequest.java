package com.example.shoppingDemo.business.request.users;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UpdateUserRequest {

    private int id;
    private String password;
    private String phoneNumber;

}
