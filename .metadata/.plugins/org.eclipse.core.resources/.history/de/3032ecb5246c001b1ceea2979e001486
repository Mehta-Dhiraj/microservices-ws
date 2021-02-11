package com.cts.cart.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.cart.entity.Cart;
import com.cts.cart.entity.Product;
import com.cts.cart.repository.CartRepository;
import com.cts.cart.repository.ProductCatalogProxy;

@RestController
@RequestMapping("/api/cart")
public class CartController {

	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private ProductCatalogProxy proxy;

	@PostMapping("/{user}")
	public Cart saveItemToCart(@RequestBody Cart cart, @PathVariable String user) {

		Product p = proxy.findByProductId(cart.getItem().getId());

		cart.setItem(p);
		cart.setUser(user);
		cart.setItemTotal(cart.getQty() * p.getPrice());

		return cartRepository.save(cart);

	}

	@GetMapping("/{user}")
	public List<Cart> findItemByName(@PathVariable String user) {

		return cartRepository.findCartByUser(user);
	}

}
