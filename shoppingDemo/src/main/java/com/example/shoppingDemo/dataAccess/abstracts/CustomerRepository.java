package com.example.shoppingDemo.dataAccess.abstracts;

import com.example.shoppingDemo.entities.concretes.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer,Integer> {
}
