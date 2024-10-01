package com.engine.price.application.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engine.price.application.entities.Product;
import com.engine.price.application.repositories.ProductRepository;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private PricingService pricingService;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Optional<Product> getProductById(Long id) {
        return productRepository.findById(id);
    }

    // Criação do produto com precificação
    public Product createProduct(Product product) {
        // Calcula o preço final com base no preço base
        double finalPrice = pricingService.calculateFinalPrice(product.getBasePrice());

        // Define o preço final no produto
        product.setFinalPrice(finalPrice);

        // Salva o produto com o preço final
        return productRepository.save(product);
    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
