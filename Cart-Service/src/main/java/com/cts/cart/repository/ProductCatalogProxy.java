package com.cts.cart.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.cart.entity.Product;

@FeignClient(name = "product-catalog-service",url = "localhost:8081")
public interface ProductCatalogProxy {
	
	@GetMapping("/api/products/{id}")
	public Product findByProductId(@PathVariable int id);


}
