package com.sivaecom.app.dto;

public class ProductDTO {
	
	private String shopperId;
	private String productId;	
	private String category;
	private String brand;
	
	public ProductDTO() {
		
	}
	
	public ProductDTO(String shopperId, String productId, String category, String brand) {
		super();		
		this.shopperId = shopperId;
		this.productId = productId;
		this.category = category;
		this.brand = brand;
	}
	
	public String getShopperId() {
		return shopperId;
	}
	public void setShopperId(String shopperId) {
		this.shopperId = shopperId;
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
