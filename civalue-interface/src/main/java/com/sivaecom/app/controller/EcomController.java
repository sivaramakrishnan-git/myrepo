package com.sivaecom.app.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.sivaecom.app.dto.ProductDTO;
import com.sivaecom.app.dto.ShopperDTO;
import com.sivaecom.app.service.EcomService;

@RestController
@RequestMapping("/api/ecom")
public class EcomController {
	
	EcomService ecomService;
	
	public EcomController(EcomService ecomService) {
		this.ecomService = ecomService;
	}
	
	@GetMapping("/find/shopperid")
	public List<ProductDTO> findByShopperId(@RequestParam(value = "shopperId", required = true) String shopperId,
											@RequestParam(value = "category", required = false) String category,
											@RequestParam(value = "brand", required = false) String brand,
											@RequestParam(value = "limit", required = false, defaultValue = "10") Integer limit) {
		
		return ecomService.findByShopperId(shopperId, category, brand, limit);
		
	}
	
	@GetMapping("/find/productid")
	public List<ShopperDTO> findByProductId(@RequestParam(value = "productId", required = true) String productId,
											@RequestParam(value = "limit", required = false, defaultValue = "10") Integer limit) {
		
		return ecomService.findByProductId(productId, limit);
		
	}

}
