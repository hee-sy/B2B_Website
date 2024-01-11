package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

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
	public String createProductForm(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "create_product";
	}
	
	@PostMapping("/product")
	public String saveProduct(@ModelAttribute("product") Product product) {
		productService.saveProduct(product);
		return "redirect:/product";
	}
}