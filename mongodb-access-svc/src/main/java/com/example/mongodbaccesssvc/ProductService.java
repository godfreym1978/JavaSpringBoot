package com.example.mongodbaccesssvc;

import java.util.List;

import com.example.mongodbaccesssvc.Product;

public interface ProductService {
    Product createProduct(Product product);

    Product updateProduct(Product product);

    List < Product > getAllProduct();

    Product getProductById(long productId);

    void deleteProduct(long id);
}