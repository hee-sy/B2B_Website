package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

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

	@PostMapping("/contactUsResponse")
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

	@PostMapping("/orderreq1/{id}")
	public String orderReq1(@RequestParam String num, @PathVariable Long id, Model model) {
		Order order1 = new Order();
		order1.setOrderQuantity(Integer.parseInt(num));

		Product prod1 = new Product();
		prod1 = productService.getProductById(id);

		int remaining_stock = prod1.getProdQuantity() - Integer.parseInt(num);
		if (remaining_stock < 0) {
			return "redirect:/orderreq1/{id}";
		} else {
			// continue

			double cost = order1.getOrderQuantity() * Integer.parseInt(prod1.getProdUnit()) * prod1.getProdUnitPrice();
			order1.setOrderCost(cost);

			model.addAttribute("total", cost);

			model.addAttribute("prod", prod1);

			model.addAttribute("order1", order1);
			return "OrderRequest1";
		}

	}

	@GetMapping("/orderreq2")
	public String orderReq2(Model model) {
		return "OrderRequest2";
	}

	@GetMapping("/")
	public String login() {
		return "LoginPage";
	}
}
