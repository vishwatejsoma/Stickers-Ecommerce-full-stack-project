package com.vce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.vce.entity.Product;

//@Repository
public interface ProductRepository 
             extends JpaRepository<Product, Long> {
    //Named Query Methods
	String findByName(String name);
  	Boolean existsByName(String name);
  	List<Product> 
  	findAllByPopularityGreaterThan(Integer popularity);
}
