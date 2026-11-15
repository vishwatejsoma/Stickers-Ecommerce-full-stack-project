package com.vce.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.vce.entity.Product;
import com.vce.dto.ProductDto;
import com.vce.repository.ProductRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class ProductService {
	
	private final ProductRepository repo;

	public List<ProductDto> getProducts() {
		
		List<Product> products = repo.findAll();
		List<ProductDto> dtos =products.stream()
		.map(this::convertToDto)
		.collect(Collectors.toList());
		return dtos;	
	}
	
	public ProductDto convertToDto(Product product) {
		ProductDto dto = new ProductDto();
		
		BeanUtils.copyProperties(product, dto);
		
//		dto.setProduct_id(product.getProduct_id());
//		dto.setName(product.getName());
//		dto.setDescription(product.getDescription());
//		dto.setPrice(product.getPrice());
//		dto.setImageUrl(product.getImageUrl());
//		dto.setPopularity(product.getPopularity());
		
		return dto;
	}

}
