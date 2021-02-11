package com.cts.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.product.entity.Product;
import com.cts.product.entity.Review;
import com.cts.product.repository.ProductRepository;
import com.cts.product.repository.ReviewRepository;

@Service
public class ReviewService {

	@Autowired
	ReviewRepository reviewRepository;

	@Autowired
	ProductRepository productRepository;

	public Review saveReview(Review review, int id) {

		Product p = productRepository.findById(id).orElse(null);
		review.setProduct(p);
		return reviewRepository
				.save(new Review(review.getStars(), review.getAuthor(), review.getBody(), review.getProduct()));

	}

	public List<Review> FindAllReview(int id) {

		List<Review> list = new ArrayList<>();

		for (Review rv : reviewRepository.findAll()) {
			if (rv.getProduct().getId() == id) {
				list.add(rv);
			}
		}
		return list;
	}

}
