package com.example.shoppingDemo.business.response.category;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GetAllCategoriesResponse {

    private int id;
    private int parentCategoryId;
    private String name;

}
