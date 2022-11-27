package com.example.shoppingDemo.business.request.categories;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpdateCategoryRequest {

    private int id;
    private int parentCategoryId;
    private String name;

}
