package com.example.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="cust_name", nullable = false)
	private String name;
	
	@Column(name="cust_contactNo", nullable = false)
	private String contactNo;
	
	@Column(name="cust_email", nullable = false)
	private String email;
	
	@Column(name="cust_state", nullable = false)
	private String state;
	
	@Column(name="cust_city", nullable = false)
	private String city;
	
	@Column(name="cust_postalCode", nullable = false)
	private int postalCode;
	
	@Column(name="cust_street", nullable = false)
	private String street;
	
	@Column(name="cust_building", nullable = false)
	private String building;
	
	@Column(name="cust_note", nullable = false)
	private String note;
	
	public Customer() {}
}
