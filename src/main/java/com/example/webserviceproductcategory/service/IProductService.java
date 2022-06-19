package com.example.webserviceproductcategory.service;

import com.example.webserviceproductcategory.model.Product;

public interface IProductService extends IService<Product>{
    Iterable<Product> findAllByOrderByPrice();
    Iterable<Product> findAllByPriceBetween(int from , int to);
}
