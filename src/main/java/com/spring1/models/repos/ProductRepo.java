package com.spring1.models.repos;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.spring1.models.entities.Product;

public interface ProductRepo extends CrudRepository<Product, Long>{
    
    List<Product> findByNameContains(String name);
}
