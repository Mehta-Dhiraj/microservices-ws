package com.cts.price.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.price.repository.ProductCatalogProxy;

@RestController
@RequestMapping("/api/price")
public class PriceController {

	@Autowired
	private ProductCatalogProxy proxy;

	@GetMapping("/{id}")
	public double findPrice(@PathVariable int id) {
		return proxy.getPriceDetail(id);
	}

}
