package com.example.productrestapiendpoints.repository;

import com.example.productrestapiendpoints.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
