package com.example.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.entity.Order;
import com.example.repo.OrderRepository;
import com.example.service.OrderService;

@Service
public class OrderServiceImpl implements OrderService{
	private OrderRepository orderRepo;
	
	public OrderServiceImpl(OrderRepository orderRepo) {
		super();
		this.orderRepo = orderRepo;
	}
	
	@Override 
	public List<Order> getAllOrders(){
		return orderRepo.findAll();
	}
}
