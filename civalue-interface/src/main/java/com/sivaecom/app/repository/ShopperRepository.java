package com.sivaecom.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sivaecom.app.entity.Shopper;

@Repository
public interface ShopperRepository extends JpaRepository<Shopper, String>{

}
