package com.example.demo.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.Product;
import com.example.demo.service.OrderService;
import com.example.demo.service.ProductService;

@Controller
public class AdminController {
	private ProductService productService;
	private OrderService orderService;
	
	public AdminController (ProductService productService, OrderService orderService) {
		super();
		this.productService = productService;
		this.orderService = orderService;
	}
	
	@GetMapping("/admin/manageproduct")
	public String adminProductManagement(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "Admin-ManageProducts";
	}
	
	@GetMapping("/admin/addproduct")
	public String adminAddProduct(Model model) {
		Product product = new Product();
		model.addAttribute("product", product);
		return "Admin-AddProduct";
	}
	
	@PostMapping("/admin/addproduct")
	public String adminAddProduct(@ModelAttribute("product") Product product){
		productService.saveProduct(product);
		return "redirect:/admin/manageproduct";
	}
	
	@GetMapping("/admin/editproduct/{id}")
	public String adminEditProduct(@PathVariable Long id, Model model) {
		model.addAttribute("product", productService.getProductById(id));
		return "Admin-EditProduct";
	}
	
	@PostMapping("/admin/editproduct/{id}")
	public String adminEditProduct(@PathVariable Long id,
			@ModelAttribute("product") Product product,
			Model model) {
		Product existingProduct = productService.getProductById(id);
		existingProduct.setId(id);
		existingProduct.setProdName(product.getProdName());
		existingProduct.setProdCategory(product.getProdCategory());
		existingProduct.setProdQuantity(product.getProdQuantity());
		existingProduct.setProdUnit(product.getProdUnit());
		existingProduct.setProdUnitPrice(product.getProdUnitPrice());
		existingProduct.setProdDesc(product.getProdDesc());
		
		productService.updateProduct(existingProduct);
		return "redirect:/admin/manageproduct";
	}
	
	@GetMapping("/admin/manageproduct/{id}")
	public String deleteProduct(@PathVariable Long id) {
		productService.deleteProductById(id);
		return "redirect:/admin/manageproduct";
	}
	
	@GetMapping("/admin/ordermanage")
	public String adminOrderManagement(Model model) {
		//model.addAttribute("orders", orderService.getAllOrders());
		return "Admin-OrderManagement";
	}
	
	@GetMapping("/admin/sidebar")
	public String adminSideBar() {
		return "Admin-SideBar";
	}
}
