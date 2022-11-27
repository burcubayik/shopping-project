package com.example.shoppingDemo.business.response.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllPropertyResponse {
    private int id;
    private String name;
    private String detail;
}
