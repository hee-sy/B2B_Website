package com.example.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	// image

	@Column(name = "prod_name", nullable = false, updatable = true, columnDefinition = "VARCHAR(255)")
	private String name;

	@Column(name = "prod_category", nullable = false, updatable = true, columnDefinition = "VARCHAR(255)")
	private String category;

	@Column(name = "prod_quantity", nullable = false, updatable = true, columnDefinition = "int(10)")
	private int quantity;

	@Column(name = "prod_unitPrice", nullable = false, updatable = true, columnDefinition = "DECIMAL(20,2)")
	private double unitPrice;

	@Column(name = "prod_desc", nullable = false, updatable = true, columnDefinition = "TEXT")
	private String description;

	public Product() {
	}
}
