package com.example.demo.entity;


import org.apache.tomcat.util.codec.binary.Base64;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.Table;

@Entity
@Table(name = "product")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

//	// image
//	@Lob
//	@Column(name = "prod_image", nullable = true, updatable = true, columnDefinition = "MEDIUMBLOB")
//	private byte[] prodImage;

	@Column(name = "prod_name", nullable = false, updatable = true, columnDefinition = "VARCHAR(255)")
	private String prodName;

	@Column(name = "prod_category", nullable = false, updatable = true, columnDefinition = "VARCHAR(255)")
	private String prodCategory;

	@Column(name = "prod_quantity", nullable = false, updatable = true, columnDefinition = "int(10)")
	private int prodQuantity;
	
	@Column(name = "prod_unit", nullable = true, updatable = true, columnDefinition = "VARCHAR(255)")
	private String prodUnit;

	@Column(name = "prod_unitPrice", nullable = false, updatable = true, columnDefinition = "DECIMAL(20,2)")
	private double prodUnitPrice;

	@Column(name = "prod_desc", nullable = false, updatable = true, columnDefinition = "TEXT")
	private String prodDesc;

	public Product() {
	}
	
	public Product(Long id, String prodName, String prodCategory, int prodQuantity, double prodUnitPrice,
			String prodDesc, String prodUnit) {
		super();
		this.id = id;
//		this.prodImage = prodImage;
		this.prodName = prodName;
		this.prodCategory = prodCategory;
		this.prodQuantity = prodQuantity;
		this.prodUnitPrice = prodUnitPrice;
		this.prodDesc = prodDesc;
		this.prodUnit = prodUnit;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProdName() {
		return prodName;
	}

	public void setProdName(String prodName) {
		this.prodName = prodName;
	}

	public String getProdCategory() {
		return prodCategory;
	}

	public void setProdCategory(String prodCategory) {
		this.prodCategory = prodCategory;
	}

	public int getProdQuantity() {
		return prodQuantity;
	}

	public void setProdQuantity(int prodQuantity) {
		this.prodQuantity = prodQuantity;
	}

	public double getProdUnitPrice() {
		return prodUnitPrice;
	}

	public void setProdUnitPrice(double prodUnitPrice) {
		this.prodUnitPrice = prodUnitPrice;
	}

	public String getProdDesc() {
		return prodDesc;
	}

	public void setProdDesc(String prodDesc) {
		this.prodDesc = prodDesc;
	}

//	public String getProdImage() {
//		String base64EncodedImage = Base64.encodeBase64String(prodImage);
//		return base64EncodedImage;
//	}
//
//	public void setProdImage(byte[] prodImage) {
//		this.prodImage = prodImage;
//	}

	public String getProdUnit() {
		return prodUnit;
	}

	public void setProdUnit(String prodUnit) {
		this.prodUnit = prodUnit;
	}
	
}
