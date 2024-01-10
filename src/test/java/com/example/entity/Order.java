package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "order")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="cust_id", nullable = false)
	private Long cust_id;
	
	@Column(name="order_time", nullable = false)
	private String time;
	
	@Column(name="order_quantity", nullable = false)
	private int quantity;
	
	@Column(name="order_totalCost", nullable = false)
	private double cost;
	
	@Column(name="order_paymentMethod", nullable = false)
	private String paymentMethod;
	
	public Order() {}
}
