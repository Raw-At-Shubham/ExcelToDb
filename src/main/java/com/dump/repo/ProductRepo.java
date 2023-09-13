package com.dump.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dump.model.Product;

public interface ProductRepo extends JpaRepository<Product, Integer> {

}
