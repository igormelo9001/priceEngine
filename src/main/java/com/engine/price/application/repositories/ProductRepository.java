package com.engine.price.application.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.engine.price.application.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
