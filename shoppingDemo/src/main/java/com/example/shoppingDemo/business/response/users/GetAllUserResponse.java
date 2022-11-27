package com.example.shoppingDemo.business.response.users;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllUserResponse {
    private int id;
    private String email;
    private String password;
    private String phoneNumber;
}
