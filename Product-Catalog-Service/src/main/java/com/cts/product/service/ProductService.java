package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.entity.Product;
import com.cts.product.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	public Product saveProducts(Product product) {
		productRepository.save(new Product(product.getName(), product.getPrice(), product.getDescription()));
		return product;
	}

	public List<Product> saveAllProducts(List<Product> products) {
		for (Product product : products) {
			productRepository.save(new Product(product.getName(), product.getPrice(), product.getDescription()));
		}
		return products;
	}

}
