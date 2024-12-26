package com.sivaecom.app.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.sivaecom.app.entity.Shopper;
import com.sivaecom.app.repository.ShopperRepository;

@Service
public class ShopperService {
	
	ShopperRepository shopperRepo;
	
	public ShopperService(ShopperRepository shopperRepo) {
		this.shopperRepo = shopperRepo;		
	}
	
	public void createShopper(Shopper shopper) {
		shopperRepo.save(shopper);
	}
	
	public void createShopper(List<Shopper> shoppers) {
		shopperRepo.saveAll(shoppers);
	}

}
