package com.vce.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.vce.dto.ProductDto;
import com.vce.service.ProductService;

import lombok.RequiredArgsConstructor;

@RestController //-> expects always json/xml data
//@Controller -> response is always webpage
//@ResponseBody
@RequestMapping("/api/products")
@RequiredArgsConstructor
public class ProductController {
	
	//@Autowired
	private final ProductService service;
	
//	public ProductController(ProductService service) {
//		super();
//		this.service = service;
//	}

	@RequestMapping(method=RequestMethod.GET, value="/home")
	//@ResponseBody  //json or xml instead of webpage
	public String getProducts() {
		return "Products are displayed....!";
	}
	
	@GetMapping("/home1")
	public List<ProductDto> displayProducts() {
		return service.getProducts();
	}
	

}
