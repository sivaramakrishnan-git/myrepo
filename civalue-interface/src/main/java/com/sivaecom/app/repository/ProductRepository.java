package com.sivaecom.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sivaecom.app.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, String> {

}
