package com.example.shoppingDemo.business.response.categories;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class GetAllCategoriesResponse {

    private int id;
    private int parentCategoryId;
    private String name;

}
