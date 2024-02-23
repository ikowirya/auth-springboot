package com.jwt.springlearn.repository;


import com.jwt.springlearn.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
    // You can define custom queries here if needed
}
