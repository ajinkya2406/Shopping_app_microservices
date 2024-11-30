package com.ajinkya.microservices.product.repository;

import com.ajinkya.microservices.product.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {

}
