package com.example.shoppingDemo.dataAccess.abstracts;

import com.example.shoppingDemo.entities.concretes.Category;
import com.example.shoppingDemo.entities.concretes.Product;
import com.example.shoppingDemo.entities.concretes.Supplier;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Integer> {
    Category getByCategory_Id(int categoryId);
    Supplier getBySupplierId(int supplierId);

}
