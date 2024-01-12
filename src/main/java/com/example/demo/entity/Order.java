package com.example.demo.entity;

import java.sql.Date;

import org.hibernate.annotations.CreationTimestamp;

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

	@Column(name = "cust_name", nullable = false, columnDefinition = "VARCHAR(50)")
	private String name;

	@Column(name = "cust_contactNo", nullable = false, columnDefinition = "VARCHAR(20)")
	private String contactNo;

	@Column(name = "cust_email", nullable = false, columnDefinition = "VARCHAR(50)")
	private String email;

	@Column(name = "cust_state", nullable = false, columnDefinition = "VARCHAR(50)")
	private String state;

	@Column(name = "cust_city", nullable = false, columnDefinition = "VARCHAR(50)")
	private String city;

	@Column(name = "cust_postalCode", nullable = false, columnDefinition = "VARCHAR(50)")
	private int postalCode;

	@Column(name = "cust_street", nullable = false, columnDefinition = "VARCHAR(50)")
	private String street;

	@Column(name = "cust_building", nullable = false, columnDefinition = "VARCHAR(50)")
	private String building;

	@Column(name = "cust_note", nullable = false, columnDefinition = "TEXT")
	private String note;

	@CreationTimestamp
	@Column(name = "order_time", nullable = false)
	private Date createdAt;

	@Column(name = "order_quantity", nullable = false)
	private int quantity;

	@Column(name = "order_totalCost", nullable = false)
	private double cost;

	@Column(name = "order_paymentMethod", nullable = false)
	private String paymentMethod;

	public Order() {
	}

	public Order(Long id, String name, String contactNo, String email, String state, String city, int postalCode,
			String street, String building, String note, Date createdAt, int quantity, double cost,
			String paymentMethod) {
		super();
		this.id = id;
		this.name = name;
		this.contactNo = contactNo;
		this.email = email;
		this.state = state;
		this.city = city;
		this.postalCode = postalCode;
		this.street = street;
		this.building = building;
		this.note = note;
		this.createdAt = createdAt;
		this.quantity = quantity;
		this.cost = cost;
		this.paymentMethod = paymentMethod;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(int postalCode) {
		this.postalCode = postalCode;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getBuilding() {
		return building;
	}

	public void setBuilding(String building) {
		this.building = building;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		this.paymentMethod = paymentMethod;
	}
	
	
}
