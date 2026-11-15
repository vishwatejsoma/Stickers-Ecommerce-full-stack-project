package com.vce.entity;

import java.math.BigDecimal;
import java.time.Instant;

import org.hibernate.annotations.ColumnDefault;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name="Products")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
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
	@ColumnDefault("CURRENT_TIMESTAMP")
	private Instant createdAt;
	@Column(nullable = false)
	private String createdBy;
	@ColumnDefault("NULL")
	private Instant updatedAt;
	@ColumnDefault("NULL")
	private String updatedBy;
}
