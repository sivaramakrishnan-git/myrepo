package com.sivaecom.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sivaecom.app.entity.Product;
import com.sivaecom.app.service.ProductService;

@RestController
@RequestMapping("/productapi")
public class ProductController {
	
	ProductService productService;		
	
	public ProductController(ProductService productService) {
		this.productService = productService;
	}
	
	@PostMapping("/add/product")
	public ResponseEntity<String> addProduct(@RequestBody Product product) {
		
		productService.createProduct(product);
		
		return new ResponseEntity<>("Product created successfully", HttpStatus.CREATED);
	}
	
	@PostMapping("/add/products")
	public ResponseEntity<String> addProduct(@RequestBody List<Product> products) {
		
		productService.createProductList(products);
		
		return new ResponseEntity<>("Products were created successfully", HttpStatus.CREATED);
	}
}
