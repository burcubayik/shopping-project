package com.example.shoppingDemo.business.request.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreatePropertyRequest {
    private String name;
    private String detail;
}
