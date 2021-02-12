package com.ramon.cadastroproduto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramon.cadastroproduto.entities.Product ;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long>{

	
}