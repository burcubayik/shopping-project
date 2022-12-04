package com.example.shoppingDemo.dataAccess.abstracts;

import com.example.shoppingDemo.entities.concretes.Product;
import com.example.shoppingDemo.entities.concretes.ProductProperty;
import com.example.shoppingDemo.entities.concretes.Property;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductPropertyRepository extends JpaRepository<ProductProperty,Integer> {
    Product getByProduct_Id(int productId);
    Property getByPropertyId(int propertyId);

}
