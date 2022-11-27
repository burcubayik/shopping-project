package com.example.shoppingDemo.business.response.properties;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetByPropertyResponse {
    private String name;
    private String detail;
}
