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
@Table(name = "orderList")
public class Order {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long orderId;

	@Column(name = "cust_name", nullable = false, columnDefinition = "VARCHAR(50)")
	private String custName;

	@Column(name = "cust_contactNo", nullable = false, columnDefinition = "VARCHAR(20)")
	private String custContactNo;

	@Column(name = "cust_email", nullable = false, columnDefinition = "VARCHAR(50)")
	private String custEmail;

	@Column(name = "cust_state", nullable = false, columnDefinition = "VARCHAR(50)")
	private String custState;

	@Column(name = "cust_city", nullable = false, columnDefinition = "VARCHAR(50)")
	private String custCity;

	@Column(name = "cust_postalCode", nullable = false, columnDefinition = "VARCHAR(50)")
	private String custPostalCode;

	@Column(name = "cust_street", nullable = false, columnDefinition = "VARCHAR(50)")
	private String custStreet;

	@Column(name = "cust_building", nullable = false, columnDefinition = "VARCHAR(50)")
	private String custBuilding;

	@Column(name = "cust_note", nullable = false, columnDefinition = "TEXT")
	private String custNote;
	
	@Column(name = "order_product", nullable = false, columnDefinition = "VARCHAR(50)")
	private String orderProduct;

	@CreationTimestamp
	@Column(name = "order_time", nullable = false)
	private Date orderCreatedAt;

	@Column(name = "order_quantity", nullable = false)
	private int orderQuantity;

	@Column(name = "order_totalCost", nullable = false)
	private double orderCost;

	@Column(name = "order_paymentMethod", nullable = false)
	private String orderPaymentMethod;
	
	@Column(name = "order_status", nullable = false)
	private boolean orderStatus;

	public Order() {
	}

	public Order(Long orderId, String custName, String custContactNo, String custEmail, String custState,
			String custCity, String custPostalCode, String custStreet, String custBuilding, String custNote,
			String orderProduct, Date orderCreatedAt, int orderQuantity, double orderCost, String orderPaymentMethod,
			boolean orderStatus) {
		super();
		this.orderId = orderId;
		this.custName = custName;
		this.custContactNo = custContactNo;
		this.custEmail = custEmail;
		this.custState = custState;
		this.custCity = custCity;
		this.custPostalCode = custPostalCode;
		this.custStreet = custStreet;
		this.custBuilding = custBuilding;
		this.custNote = custNote;
		this.orderProduct = orderProduct;
		this.orderCreatedAt = orderCreatedAt;
		this.orderQuantity = orderQuantity;
		this.orderCost = orderCost;
		this.orderPaymentMethod = orderPaymentMethod;
		this.orderStatus = orderStatus;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getCustContactNo() {
		return custContactNo;
	}

	public void setCustContactNo(String custContactNo) {
		this.custContactNo = custContactNo;
	}

	public String getCustEmail() {
		return custEmail;
	}

	public void setCustEmail(String custEmail) {
		this.custEmail = custEmail;
	}

	public String getCustState() {
		return custState;
	}

	public void setCustState(String custState) {
		this.custState = custState;
	}

	public String getCustCity() {
		return custCity;
	}

	public void setCustCity(String custCity) {
		this.custCity = custCity;
	}

	public String getCustPostalCode() {
		return custPostalCode;
	}

	public void setCustPostalCode(String custPostalCode) {
		this.custPostalCode = custPostalCode;
	}

	public String getCustStreet() {
		return custStreet;
	}

	public void setCustStreet(String custStreet) {
		this.custStreet = custStreet;
	}

	public String getCustBuilding() {
		return custBuilding;
	}

	public void setCustBuilding(String custBuilding) {
		this.custBuilding = custBuilding;
	}

	public String getCustNote() {
		return custNote;
	}

	public void setCustNote(String custNote) {
		this.custNote = custNote;
	}

	public String getOrderProduct() {
		return orderProduct;
	}

	public void setOrderProduct(String orderProduct) {
		this.orderProduct = orderProduct;
	}

	public Date getOrderCreatedAt() {
		return orderCreatedAt;
	}

	public void setOrderCreatedAt(Date orderCreatedAt) {
		this.orderCreatedAt = orderCreatedAt;
	}

	public int getOrderQuantity() {
		return orderQuantity;
	}

	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}

	public double getOrderCost() {
		return orderCost;
	}

	public void setOrderCost(double orderCost) {
		this.orderCost = orderCost;
	}

	public String getOrderPaymentMethod() {
		return orderPaymentMethod;
	}

	public void setOrderPaymentMethod(String orderPaymentMethod) {
		this.orderPaymentMethod = orderPaymentMethod;
	}

	public boolean isOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(boolean orderStatus) {
		this.orderStatus = orderStatus;
	}

	

}
