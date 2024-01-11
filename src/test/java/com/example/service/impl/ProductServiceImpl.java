package com.example.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Order;
import com.example.entity.Product;
import com.example.repo.OrderRepository;
import com.example.repo.ProductRepository;
import com.example.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{
	private ProductRepository productRepo;
	
	public ProductServiceImpl(ProductRepository productRepo) {
		super();
		this.productRepo = productRepo;
	}
	
	@Override 
	public List<Product> getAllProducts(){
		return productRepo.findAll();
	}
}