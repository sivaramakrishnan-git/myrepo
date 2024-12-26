package com.sivaecom.app.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.sivaecom.app.dto.ProductDTO;
import com.sivaecom.app.dto.ShopperDTO;
import com.sivaecom.app.exception.ResourceNotFoundException;
import com.sivaecom.app.repository.ShelfRepository;

@Service
public class EcomService {
	
	ShelfRepository shelfRepo;

	public EcomService(ShelfRepository shelfRepo) {
		this.shelfRepo = shelfRepo;
	}
	
	public List<ProductDTO> findByShopperId(String shopperId, String category, String brand, Integer limit) {				
		
		List<Object[]> object = shelfRepo.findByShopperId(shopperId, category, brand, limitCheck(limit, 100));
		
		if (object == null || object.isEmpty()) {
			throw new ResourceNotFoundException("Data not found");
		}
		
		return object.stream()
				.map(result -> new ProductDTO(
						(String) result[0],
						(String) result[1],
						(String) result[2],
						(String) result[3]))
				.collect(Collectors.toList());
	}
	
	public List<ShopperDTO> findByProductId(String productId, Integer limit) {
		
		List<Object[]> object = shelfRepo.findByProductId(productId, limitCheck(limit, 1000));
		
		if (object == null || object.isEmpty()) {
			throw new ResourceNotFoundException("Data not found");
		}
		
		return object.stream()
				.map(result -> new ShopperDTO(
						(String) result[0]))
				.collect(Collectors.toList());
	}
	
	private Integer limitCheck(Integer minLimit, Integer maxLimit) {
		
		return (minLimit > 0 && minLimit <= maxLimit) ? minLimit : maxLimit;
		
	}
}
