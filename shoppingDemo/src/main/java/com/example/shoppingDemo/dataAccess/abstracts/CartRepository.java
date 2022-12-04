package com.example.shoppingDemo.dataAccess.abstracts;

import com.example.shoppingDemo.entities.concretes.Cart;
import com.example.shoppingDemo.entities.concretes.Customer;
import com.example.shoppingDemo.entities.concretes.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CartRepository extends JpaRepository<Cart,Integer> {

    Customer getByCustomerId(int customerId);
    Product getByProduct_Id(int productId);
}
