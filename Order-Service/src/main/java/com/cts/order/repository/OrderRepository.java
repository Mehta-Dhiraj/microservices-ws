package com.cts.order.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cts.order.entity.Orders;

@Repository
public interface OrderRepository extends JpaRepository<Orders, Integer>{
	
}
