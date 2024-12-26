package com.sivaecom.app.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Table(name = "shopper")
@Entity
public class Shopper {				

	@Id
	@Column(name = "shopper_id")
	private String shopperId;
	
	@OneToMany(cascade = CascadeType.ALL)	
	@JoinColumn(name = "fk_shopper_id", referencedColumnName = "shopper_id")
	private List<Shelf> shelf;
	
	public Shopper() {		
	}
	
	public Shopper(String shopperId, List<Shelf> shelf) {		
		this.shopperId = shopperId;
		this.shelf = shelf;
	}

	public String getShopperId() {
		return shopperId;
	}

	public void setShopperId(String shopperId) {
		this.shopperId = shopperId;
	}

	public List<Shelf> getShelf() {
		return shelf;
	}

	public void setShelf(List<Shelf> shelf) {
		this.shelf = shelf;
	}

	
}
