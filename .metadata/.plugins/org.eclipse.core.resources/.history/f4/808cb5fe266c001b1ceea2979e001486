package com.cts.order.controller;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.order.entity.Cart;
import com.cts.order.entity.Orders;
import com.cts.order.repository.CartServiceProxy;
import com.cts.order.repository.OrderRepository;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

	@Autowired
	private CartServiceProxy proxy;

	@Autowired
	private OrderRepository orderRepository;

	@PostMapping("/{user}")
	public Orders orderItem(@PathVariable String user) {

		List<Cart> cart = proxy.findItemByName(user);
		double amount = 0;
		for (Cart crt : cart) {
			amount += crt.getItemTotal();
		}
		Orders order = new Orders();
		order.setAmount(amount);
		order.setUser(user);
		order.setDate(LocalDateTime.now());
		return orderRepository.save(order);
	}

}
