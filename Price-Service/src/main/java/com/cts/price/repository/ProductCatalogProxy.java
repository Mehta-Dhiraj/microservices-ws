package com.cts.price.repository;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "product-catalog-service", url = "localhost:8081/api")
public interface ProductCatalogProxy {

	@GetMapping("/price/{id}")
	public double getPriceDetail(@PathVariable int id);

}
