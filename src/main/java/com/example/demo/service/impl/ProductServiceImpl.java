package com.example.demo.service.impl;

import java.io.IOException;
import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.util.StringUtils;

import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
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
	public Product saveProduct(Product product, MultipartFile prodImage) {
		String fileName = StringUtils.cleanPath(prodImage.getOriginalFilename());
//		if(fileName.contains(".."))
//		{
//			System.out.println("Not a valid file");
//		}
//		try {
//			product.setImage(Base64.getEncoder().encodeToString(prodImage.getBytes()));
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		return productRepo.save(product);
	}
	
	@Override 
	public Product getProductById(Long id) {
		return productRepo.findById(id).get();
	}
	
	@Override 
	public Product updateProduct(Product product) {
		return productRepo.save(product);
	}

	@Override 
	public void deleteProductById(Long id) {
		productRepo.deleteById(id);
	}
}