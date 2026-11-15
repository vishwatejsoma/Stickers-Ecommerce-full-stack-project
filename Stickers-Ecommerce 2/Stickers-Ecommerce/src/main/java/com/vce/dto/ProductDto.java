package com.vce.dto;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import lombok.Data;

@Data
public class ProductDto {

	private Long productId;
	@Column(nullable = false)
	private String name;
	@Column(nullable = false)
	private String description;
	@Column(nullable = false)
	private BigDecimal price;
	@Column(nullable = false)
	private Integer popularity;
	private String imageUrl;
	
}
