package com.example.mongodbaccesssvc;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.mongodbaccesssvc.Product;

public interface ProductRepository extends MongoRepository < Product, Long > {

}