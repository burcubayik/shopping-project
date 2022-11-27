package com.example.shoppingDemo.business.abstracts;


import com.example.shoppingDemo.business.request.carts.CreateCartRequest;
import com.example.shoppingDemo.business.request.carts.DeleteCartRequest;
import com.example.shoppingDemo.business.request.carts.UpdateCartRequest;
import com.example.shoppingDemo.business.response.carts.GetAllCartsResponse;
import com.example.shoppingDemo.business.response.carts.GetByCartResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;

import java.util.List;

public interface CartService {
    Result add(CreateCartRequest createCartRequest);
    Result update(UpdateCartRequest updateCartRequest);
    Result delete(DeleteCartRequest deleteCartRequest);
    DataResult<List<GetAllCartsResponse>> getAll();
    DataResult<GetByCartResponse> getById(int id);


}
