package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Order;

public interface OrderService {
	List<Order> getAllOrders();

	Order getOrderById(Long id);

	Order saveOrder(Order order);
}
