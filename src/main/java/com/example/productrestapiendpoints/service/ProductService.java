package com.example.productrestapiendpoints.service;

import com.example.productrestapiendpoints.entity.Product;
import com.example.productrestapiendpoints.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }

    public Product updateProduct(Long id, Product product) {
        if (!productRepository.existsById(id)) {
            return null; // If the product doesn't exist, return null
        }
        product.setId(id); // Ensure the ID remains the same
        return productRepository.save(product); // Save and return the updated product
    }


    public boolean deleteProduct(Long id) {
        if (productRepository.existsById(id)) {
            productRepository.deleteById(id);
            return true;
        }
        return false;  // Return false if product doesn't exist
    }
}
