package com.cts.cart.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.cart.entity.Cart;
import com.cts.cart.repository.CartRepository;

@Service
public class CartService {

	@Autowired
	private CartRepository cartRepository;

	public Cart saveItem(Cart cart) {
		return cartRepository.save(new Cart(cart.getItem(),cart.getQty()));
		
	}

}
