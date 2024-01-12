package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.Product;
import com.example.demo.service.ProductService;

@Controller
public class ProductController {
	@Autowired
	private ProductService productService;
	
	public ProductController(ProductService productService) {
		super();
		this.productService = productService;
	}

	@GetMapping("/product")
	public String listProduct(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "productTest";
	}

	@GetMapping("/product/new")
	public String createProductForm(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "create_product";
	}
	
	@PostMapping("/product")
	public String saveProduct(@ModelAttribute("product") Product product, @RequestParam("prodImage") MultipartFile prodImage) {
		productService.saveProduct(product, prodImage);
		return "redirect:/product";
	}
	
	@GetMapping("/product/edit/{id}")
	public String editProductForm(@PathVariable Long id, Model model) {
		model.addAttribute("product", productService.getProductById(id));
		return "edit_product";
	}
	
	@PostMapping("/product/{id}")
	public String updateBook(@PathVariable Long id,
			@ModelAttribute("product") Product product,
			Model model) {
		Product existingProduct = productService.getProductById(id);
		existingProduct.setId(id);
		existingProduct.setProdName(product.getProdName());
		existingProduct.setProdCategory(product.getProdCategory());
		existingProduct.setProdQuantity(product.getProdQuantity());
		existingProduct.setProdUnitPrice(product.getProdUnitPrice());
		existingProduct.setProdDesc(product.getProdDesc());
		
		productService.updateProduct(existingProduct);
		return "redirect:/product";
	}
	
	@GetMapping("/product/delete/{id}")
	public String deleteProduct(@PathVariable Long id) {
		productService.deleteProductById(id);
		return "redirect:/product";
	}
}