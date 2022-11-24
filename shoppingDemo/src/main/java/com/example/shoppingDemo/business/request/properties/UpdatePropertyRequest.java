package com.example.shoppingDemo.business.request.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdatePropertyRequest {
    private int id;
    private String name;
    private String detail;


}
