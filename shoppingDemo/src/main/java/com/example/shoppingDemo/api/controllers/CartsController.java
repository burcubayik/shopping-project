package com.example.shoppingDemo.api.controllers;

import com.example.shoppingDemo.business.abstracts.CartService;
import com.example.shoppingDemo.business.request.carts.CreateCartRequest;
import com.example.shoppingDemo.business.request.carts.DeleteCartRequest;
import com.example.shoppingDemo.business.request.carts.UpdateCartRequest;
import com.example.shoppingDemo.business.response.carts.GetAllCartsResponse;
import com.example.shoppingDemo.business.response.carts.GetByCartResponse;
import com.example.shoppingDemo.core.utilities.results.DataResult;
import com.example.shoppingDemo.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/carts")
public class CartsController {

    @Autowired
    CartService cartService;

    public CartsController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/add")
    public Result add(@RequestBody CreateCartRequest createCartRequest) {
        return this.cartService.add(createCartRequest);
    }

    @PutMapping("/update")
    public Result update(UpdateCartRequest updateCartRequest) {
        return this.cartService.update(updateCartRequest);
    }

    @DeleteMapping("/delete")
    public Result delete(DeleteCartRequest deleteCartRequest) {
        return this.cartService.delete(deleteCartRequest);
    }

    @GetMapping("/getall")
    public DataResult<List<GetAllCartsResponse>> getAll() {
        return this.cartService.getAll();
    }

    @GetMapping("/getbyid")
    public DataResult<GetByCartResponse> getById(@RequestParam int id) {
        return this.cartService.getById(id);
    }
}
