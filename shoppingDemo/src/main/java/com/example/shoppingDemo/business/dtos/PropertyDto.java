package com.example.shoppingDemo.business.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;

@Data
@NoArgsConstructor
@Builder
public class PropertyDto {
    private int id;
    private String name;
    private String detail;
}
