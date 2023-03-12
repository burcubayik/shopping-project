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
import com.example.shoppingDemo.core.utilities.results.SuccessResult;
import com.example.shoppingDemo.dataAccess.abstracts.CartRepository;
import com.example.shoppingDemo.entities.concretes.Cart;
import com.example.shoppingDemo.entities.concretes.Customer;
import com.example.shoppingDemo.entities.concretes.Product;
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

      //  Customer customer =this.cartRepository.getByCustomerId(createCartRequest.getCustomerId());
        Product product=this.cartRepository.getByProduct_Id(createCartRequest.getProductId());
        Cart cart=Cart.builder()
                .product(product)
                .build();

        this.cartRepository.save(cart);

        return new SuccessResult("CART.ADDED");
    }

    @Override
    public Result update(UpdateCartRequest updateCartRequest) {
        Product product=this.cartRepository.getByProduct_Id(updateCartRequest.getProductId());
        Cart cart=this.cartRepository.findById(updateCartRequest.getId()).get();
        cart.setProduct(product);
        this.cartRepository.save(cart);
        return new SuccessResult("UPDATED.CART");
    }

    @Override
    public Result delete(DeleteCartRequest deleteCartRequest) {
        Cart cart=this.cartRepository.findById(deleteCartRequest.getId()).get();
        this.cartRepository.delete(cart);
        return new SuccessResult("DELETED.CART");
    }

    @Override
    public DataResult<List<GetAllCartsResponse>> getAll() {
        List<Cart> result=this.cartRepository.findAll();
        List<GetAllCartsResponse> response=result.stream().map(cart -> GetAllCartsResponse.builder()
                .id(cart.getId())
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
