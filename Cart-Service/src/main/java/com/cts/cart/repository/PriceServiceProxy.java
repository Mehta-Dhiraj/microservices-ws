package com.cts.cart.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "price-service",url = "localhost:8082")
public interface PriceServiceProxy {
	
	@GetMapping("/api/price/{id}")
	public double findPrice(@PathVariable int id);

}
