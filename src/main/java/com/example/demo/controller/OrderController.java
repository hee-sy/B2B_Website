package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Order;
import com.example.demo.entity.Product;
import com.example.demo.service.OrderService;
import com.example.demo.service.ProductService;

@Controller
public class OrderController {
	private OrderService orderService;
	private ProductService productService;

	public OrderController(ProductService productService, OrderService orderService) {
		super();
		this.productService = productService;
		this.orderService = orderService;
	}

	@GetMapping("/order")
	public String listOrder(Model model) {
		model.addAttribute("orders", orderService.getAllOrders());
		return "order";
	}

	// from order request 1
	@PostMapping("/order/{id}")
	public String saveOrder(@PathVariable Long id, @ModelAttribute("order1") Order order, Model model) {
		Product prod2 = new Product();
		prod2 = productService.getProductById(id);

		order.setOrderProduct(prod2.getProdName());
		long mil = System.currentTimeMillis();
		java.sql.Date date = new java.sql.Date(mil);
		order.setOrderCreatedAt(date);

		double cost = order.getOrderCost();

		order.setOrderStatus(false);

		orderService.saveOrder(order);

		model.addAttribute("totalvalue", cost);
		model.addAttribute("refprod1", prod2);
		model.addAttribute("savedOrder", orderService.getOrderById(order.getOrderId()));
		return "OrderRequest2";
	}

}
