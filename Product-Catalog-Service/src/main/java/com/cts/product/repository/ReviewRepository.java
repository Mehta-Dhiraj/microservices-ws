package com.cts.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.product.entity.Review;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer>{
	
}
