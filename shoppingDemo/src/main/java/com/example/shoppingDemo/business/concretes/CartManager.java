package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.CartService;
import com.example.shoppingDemo.business.request.carts.CreateCartRequest;
import com.example.shoppingDemo.business.request.carts.DeleteCartRequest;
import com.example.shoppingDemo.business.request.carts.UpdateCartRequest;
import com.example.shoppingDemo.business.response.carts.GetAllCartsResponse;
import com.example.shoppingDemo.business.response.carts.GetByCartResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CartManager implements CartService {

    @Override
    public Result add(CreateCartRequest createCartRequest) {
        return null;
    }

    @Override
    public Result update(UpdateCartRequest updateCartRequest) {
        return null;
    }

    @Override
    public Result delete(DeleteCartRequest deleteCartRequest) {
        return null;
    }

    @Override
    public DataResult<List<GetAllCartsResponse>> getAll() {
        return null;
    }

    @Override
    public DataResult<GetByCartResponse> getByCustomerId(int id) {
        return null;
    }
}
