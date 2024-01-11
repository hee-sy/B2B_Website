package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.entity.Order;
import com.example.service.OrderService;

@Controller
public class OrderController {
	private OrderService orderService;
	
	public OrderController(OrderService orderService) {
		super();
		this.orderService = orderService;
	}
	
	@GetMapping("/order")
	public String listOrder(Model model) {
		model.addAttribute("orders", orderService.getAllOrders());
		return "order";
	}
}
