package com.example.shoppingDemo.business.request.property;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreatePropertyRequest {
    private String name;
    private String detail;
}
