package com.example.demo.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	private ProductRepository productRepo;

	public ProductServiceImpl(ProductRepository productRepo) {
		super();
		this.productRepo = productRepo;
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepo.findAll();
	}
	
	@Override 
	public Product saveProduct(Product product) {
		return productRepo.save(product);
	}
}