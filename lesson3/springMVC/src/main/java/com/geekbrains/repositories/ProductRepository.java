package com.geekbrains.repositories;

import com.geekbrains.entites.Product;
import org.springframework.stereotype.Component;

@Component
public class ProductRepository {

    public Product findOneById(int id) {

        Product product = new Product();
        product.setId(id);
        product.setCost(10.0);
        product.setTitle("Book");

        return product;
    }
}
