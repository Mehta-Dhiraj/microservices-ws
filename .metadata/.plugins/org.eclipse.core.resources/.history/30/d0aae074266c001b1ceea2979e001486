package com.cts.order.repository;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.cts.order.entity.Cart;

@FeignClient(name = "cart-service",url = "localhost:8083/api/cart")
public interface CartServiceProxy {
	
	@GetMapping("/{user}")
	public List<Cart> findItemByName(@PathVariable String user);

}
