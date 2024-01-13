package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.demo.entity.Order;
import com.example.demo.entity.Product;
import com.example.demo.service.OrderService;
import com.example.demo.service.ProductService;

@Controller
public class PageNavController {

	private ProductService productService;
	private OrderService orderService;

	public PageNavController(ProductService productService, OrderService orderService) {
		super();
		this.productService = productService;
		this.orderService = orderService;
	}

	@GetMapping("/home")
	public String homePage(Model model) {
		return "Home";
	}

	@GetMapping("/home/product")
	public String productPage(Model model) {
		model.addAttribute("products", productService.getAllProducts());
		return "Product";
	}
	
	@GetMapping("/home/product/{id}")
	public String productPage(@PathVariable Long id, Model model) {
		model.addAttribute("product", productService.getProductById(id));
		return "ProductDetails";
	}

	@GetMapping("/about")
	public String aboutPage(Model model) {
		return "About";
	}

	@GetMapping("/forCustomer")
	public String forCustomerPage(Model model) {
		return "ForCustomer";
	}

	@GetMapping("/contactUs")
	public String contactUsPage(Model model) {
		return "ContactUs";
	}

	@GetMapping("/contactUsResponse")
	public String contactUsResponsePage(Model model) {
		return "ContactUsResponse";
	}

	// Check for header & footer component cause idk how to open jsp
	@GetMapping("/custHeader")
	public String headerBar(Model model) {
		return "CustHeader";
	}

	@GetMapping("/custFooter")
	public String footerBar(Model model) {
		return "CustFooter";
	}

	@GetMapping("/prodDetails")
	public String productDetails(Model model) {
		return "ProductDetails";
	}

	@GetMapping("/orderreq1")
	public String orderReq1(Model model) {
		Order order1 = new Order();
		model.addAttribute("order1", order1);
		return "OrderRequest1";
	}

	@GetMapping("/orderreq2")
	public String orderReq2(Model model) {
		return "OrderRequest2";
	}

	@GetMapping("/login")
	public String login() {
		return "LoginPage";
	}
}
