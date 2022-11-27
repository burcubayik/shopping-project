package com.example.shoppingDemo.business.concretes;

import com.example.shoppingDemo.business.abstracts.CartService;
import com.example.shoppingDemo.business.request.carts.CreateCartRequest;
import com.example.shoppingDemo.business.request.carts.DeleteCartRequest;
import com.example.shoppingDemo.business.request.carts.UpdateCartRequest;
import com.example.shoppingDemo.business.response.carts.GetAllCartsResponse;
import com.example.shoppingDemo.business.response.carts.GetByCartResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import com.example.shoppingDemo.core.utilities.results.SuccessDataResult;
import com.example.shoppingDemo.dataAccess.abstracts.CartRepository;
import com.example.shoppingDemo.entities.concretes.Cart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CartManager implements CartService {

    @Autowired
    CartRepository cartRepository;

    public CartManager(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

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
        List<Cart> result=this.cartRepository.findAll();
        List<GetAllCartsResponse> response=result.stream().map(cart -> GetAllCartsResponse.builder()
                .id(cart.getId())
                .customerId(cart.getCustomer().getCustomerId())
                .productId(cart.getProduct().getId())
                .build()).collect(Collectors.toList());

        return new SuccessDataResult<>(response);
    }

    @Override
    public DataResult<GetByCartResponse> getById(int id) {
        Cart result=this.cartRepository.findById(id).get();
        GetByCartResponse response=GetByCartResponse.builder()
                .id(result.getId()).build();
        return new SuccessDataResult<>(response);
    }
}
