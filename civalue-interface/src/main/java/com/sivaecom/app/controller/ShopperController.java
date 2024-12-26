package com.sivaecom.app.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sivaecom.app.entity.Shopper;
import com.sivaecom.app.service.ShopperService;

@RestController
@RequestMapping("/shopperapi")
public class ShopperController {
	
	ShopperService shopperService;
	
	public ShopperController(ShopperService shopperService) {
		this.shopperService = shopperService;
	}

	@PostMapping("/add/shopper")
	public ResponseEntity<String> addShopper(@RequestBody Shopper shopper) {
		
		shopperService.createShopper(shopper);
		
		return new ResponseEntity<>("Shopper created successfully", HttpStatus.CREATED);
	}
	
	@PostMapping("/add/shoppers")
	public ResponseEntity<String> addShopper(@RequestBody List<Shopper> shoppers) {
		
		shopperService.createShopper(shoppers);
		
		return new ResponseEntity<>("Shoppers were created successfully", HttpStatus.CREATED);
	}
}
