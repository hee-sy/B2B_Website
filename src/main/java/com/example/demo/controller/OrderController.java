package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Order;
import com.example.demo.service.OrderService;

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

	// from order request 1
	@PostMapping("/order")
	public String tempOrder(@ModelAttribute("order1") Order order) {
		return "OrderRequest2";
	}

	// from order request 2
	@PostMapping("/order/saveOrder")
	public String saveOrder(@ModelAttribute("order1") Order order, Model model) {
		orderService.saveOrder(order);
		model.addAttribute("savedOrder", orderService.getOrderById(order.getOrderId()));
		return "OrderRequest3";
	}

}
