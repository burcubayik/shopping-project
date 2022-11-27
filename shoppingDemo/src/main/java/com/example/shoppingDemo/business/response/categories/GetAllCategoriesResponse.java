package com.example.shoppingDemo.business.response.categories;

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
