package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.entity.Product;
import com.example.service.ProductService;

@Controller
public class ProductController {
	
	private ProductService productService;
	
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}
	
	@GetMapping("/product")
	public String listProduct(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "product";
	}
	
	@GetMapping("/product/new")
	public String createProductForm(Model model)
	{
		Product product = new Product();
		model.addAttribute("product", product);
		return "create_product";
	}
}