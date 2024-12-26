package com.sivaecom.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sivaecom.app.entity.Product;
import com.sivaecom.app.repository.ProductRepository;

@Service
public class ProductService {
	
	private ProductRepository productRepo;		
	
	public ProductService(ProductRepository productRepo) {
		this.productRepo = productRepo;
	}
	
	public void createProduct(Product product) {
		
		productRepo.save(product);
		
	}
	
	public void createProductList(List<Product> products) {
		
		productRepo.saveAll(products);
		
	}

}
