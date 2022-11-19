package com.example.shoppingDemo.dataAccess.abstracts;

import com.example.shoppingDemo.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {

}
