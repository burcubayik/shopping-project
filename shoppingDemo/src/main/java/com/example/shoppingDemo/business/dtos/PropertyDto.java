package com.example.shoppingDemo.business.dtos;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class PropertyDto {
    private int id;
    private String name;
    private String detail;
}
