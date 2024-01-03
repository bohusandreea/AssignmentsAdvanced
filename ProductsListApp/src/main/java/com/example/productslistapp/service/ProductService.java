package com.example.productslistapp.service;

import com.example.productslistapp.domain.Product;
import com.example.productslistapp.repository.ProductRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Iterable<Product> list(){
        return productRepository.findAll();
    }
    public Product save(Product product){
        return productRepository.save(product);
       }
    public void save(List<Product> products)
    {
       productRepository.saveAll(products);
    }
}
