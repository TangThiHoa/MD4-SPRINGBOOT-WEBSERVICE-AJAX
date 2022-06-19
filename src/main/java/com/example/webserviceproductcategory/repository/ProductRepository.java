package com.example.webserviceproductcategory.repository;

import com.example.webserviceproductcategory.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
    Iterable<Product> findAllByOrderByPrice();
    Iterable<Product> findAllByPriceBetween(int from , int to);

}
