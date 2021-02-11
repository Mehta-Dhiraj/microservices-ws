package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entity.Product;
import com.cts.product.entity.Review;
import com.cts.product.repository.ProductRepository;
import com.cts.product.service.ProductService;
import com.cts.product.service.ReviewService;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class ProductRestController {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	ProductService service;

	@Autowired
	ReviewService reviewService;

	// Finding All Product
	@GetMapping("/products")
	public List<Product> findAllProduct() {
		return productRepository.findAll();
	}

	// Finding Product By Specific Id
	@GetMapping("/products/{id}")
	public Product findByProductId(@PathVariable int id) {
		return productRepository.findById(id).orElse(null);
	}

	// Finding Product Whose name Contains Specific Character or String
	@GetMapping("/products/byName/{name}")
	public List<Product> findProductContaining(@PathVariable String name) {
		return productRepository.findProductByNameContaining(name);
	}

	// Saving single Product
	@PostMapping("/products")
	public Product saveSingleProduct(@RequestBody Product product) {
		service.saveProducts(product);
		return product;
	}

	// Saving Multiple Product in one Transaction
	@PostMapping("/products/all")
	public List<Product> saveAllProduct(@RequestBody List<Product> products) {
		service.saveAllProducts(products);
		return products;
	}

	// Saving Review
	@PostMapping("/products/{id}/reviews")
	public Review saveReview(@RequestBody Review review, @PathVariable int id) {
		return reviewService.saveReview(review, id);

	}

	// Searching All Review
	@GetMapping("/products/{id}/reviews")
	public List<Review> FindAllReview(@PathVariable int id) {

		return reviewService.FindAllReview(id);

	}

}
