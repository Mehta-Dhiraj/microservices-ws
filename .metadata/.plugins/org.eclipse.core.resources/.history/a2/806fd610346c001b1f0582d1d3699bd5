package com.cts.price.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.price.entity.Product;
import com.cts.price.repository.ProductRepository;

@RestController
@RequestMapping("/api/price")
public class PriceController {

	@Autowired
	ProductRepository productRepository;

	@GetMapping("/{id}")
	public double getPrice(@PathVariable int id) {
		Product product = productRepository.findProductById(id);
		return product.getPrice();
	}

}
