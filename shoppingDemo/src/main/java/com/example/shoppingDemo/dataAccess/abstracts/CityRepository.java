package com.example.shoppingDemo.dataAccess.abstracts;

import com.example.shoppingDemo.entities.concretes.City;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CityRepository extends JpaRepository<City,Integer> {
}
