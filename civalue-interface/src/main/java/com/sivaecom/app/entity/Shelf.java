package com.sivaecom.app.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "shelf")
@Entity
public class Shelf {
	
	@Id	
	@Column(name = "id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long shelfId;		
	
	@Column(name = "product_id")
	private String productId;
	
	@Column(name = "relevancy_score")
	private Double relevancyScore;		
	
	public Shelf() {
		
	}		

	public Shelf(Long shelfId, String productId, Double relevancyScore) {	
		this.shelfId = shelfId;		
		this.productId = productId;
		this.relevancyScore = relevancyScore;
	}

	public Long getShelfId() {
		return shelfId;
	}

	public void setShelfId(Long shelfId) {
		this.shelfId = shelfId;
	}	

	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public Double getRelevancyScore() {
		return relevancyScore;
	}

	public void setRelevancyScore(Double relevancyScore) {
		this.relevancyScore = relevancyScore;
	}	

}
