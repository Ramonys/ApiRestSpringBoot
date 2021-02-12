package com.ramon.cadastroproduto.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ramon.cadastroproduto.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {

	
}