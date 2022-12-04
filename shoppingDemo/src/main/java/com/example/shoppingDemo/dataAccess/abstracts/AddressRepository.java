package com.example.shoppingDemo.dataAccess.abstracts;

import com.example.shoppingDemo.entities.concretes.Address;
import com.example.shoppingDemo.entities.concretes.City;
import com.example.shoppingDemo.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
    User getByUserId(int userId);
    City getByCity_Id(int cityId);
}
