package com.sivaecom.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "product")
@Entity
public class Product {
	
	@Id
	@Column(name = "productid")
	private String productId;
	
	@Column(name = "category")
	private String category;
	
	@Column(name = "brand")
	private String brand;
	
	public Product() {		
	}
	
	public Product(String productId, String category, String brand) {
		super();
		this.productId = productId;
		this.category = category;
		this.brand = brand;
	}
	
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
}
