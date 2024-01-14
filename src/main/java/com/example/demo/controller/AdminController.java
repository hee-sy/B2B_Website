package com.example.demo.controller;

import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.entity.Order;
import com.example.demo.entity.Product;
import com.example.demo.service.OrderService;
import com.example.demo.service.ProductService;

import jakarta.validation.Valid;

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
	public String adminAddProduct(@ModelAttribute("product") @Valid Product product, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "Admin-AddProduct";
		}
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
			@ModelAttribute("product") @Valid Product product, 
			BindingResult bindingResult,
			Model model) {
		if (bindingResult.hasErrors()) {
			return "Admin-EditProduct";
		}
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
		model.addAttribute("orders", orderService.getAllOrders());
		return "Admin-OrderManagement";
	}
	
	@GetMapping("/admin/updateorder/{id}")
	public String adminUpdateOrder(@PathVariable Long id,
			@ModelAttribute("orderList") @Valid Order order, 
			BindingResult bindingResult,
			Model model) {
		if (bindingResult.hasErrors()) {
			return "Admin-OrderManagement";
		}
		Order existingOrder = orderService.getOrderById(id);
		existingOrder.setOrderId(id);
		existingOrder.setCustName(order.getCustName());
		existingOrder.setCustContactNo(order.getCustContactNo());
		existingOrder.setCustEmail(order.getCustEmail());
		existingOrder.setCustState(order.getCustState());
		existingOrder.setCustCity(order.getCustCity());
		existingOrder.setCustPostalCode(order.getCustPostalCode());
		
		existingOrder.setCustStreet(order.getCustStreet());
		existingOrder.setCustBuilding(order.getCustBuilding());
		existingOrder.setCustNote(order.getCustNote());
		existingOrder.setOrderProduct(order.getOrderProduct());
		existingOrder.setOrderCreatedAt(order.getOrderCreatedAt());
		existingOrder.setOrderQuantity(order.getOrderQuantity());
		existingOrder.setOrderPaymentMethod(order.getOrderPaymentMethod());
		existingOrder.setOrderStatus(true);
		
		orderService.saveOrder(existingOrder);
		return "redirect:/admin/ordermanage";
	}
	
	@GetMapping("/admin/sidebar")
	public String adminSideBar() {
		return "Admin-SideBar";
	}
}
