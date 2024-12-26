package com.sivaecom.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.sivaecom.app.entity.Shelf;

@Repository
public interface ShelfRepository extends JpaRepository<Shelf, Long> {	
	
	@Query(nativeQuery = true, value = "select s.fk_shopper_id, s.product_id, p.category, p.brand "
			+ "from shelf s, product p "
			+ "where s.product_id = p.productid "
			+ "and s.fk_shopper_id = :shopperId "
			+ "and (p.category = :category OR :category is null) "
			+ "and (p.brand = :brand OR :brand is null) LIMIT :limit")
	List<Object[]> findByShopperId(@Param("shopperId") String shopperId,
									@Param("category") String category,
									@Param("brand") String brand,
									@Param("limit")	Integer limit);
	
	@Query(nativeQuery = true, value = "select fk_shopper_id from shelf "
			+ "where product_id = :productId LIMIT :limit")
	List<Object[]> findByProductId(@Param("productId") String productId,
									@Param("limit") Integer limit);
		
}
