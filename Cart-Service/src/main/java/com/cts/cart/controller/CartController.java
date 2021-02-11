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
import com.cts.cart.repository.PriceServiceProxy;
import com.cts.cart.repository.ProductCatalogProxy;

@RestController
@RequestMapping("/api/cart")
public class CartController {

	@Autowired
	private CartRepository cartRepository;

	@Autowired
	private ProductCatalogProxy proxy;

	@Autowired
	private PriceServiceProxy priceProxy;

	@PostMapping("/{user}")
	public Cart saveItemToCart(@RequestBody Cart cart, @PathVariable String user) {

		//Product p = proxy.findByProductId(cart.getItem().getId());
		double price = priceProxy.findPrice(cart.getItem().getId());
		Product p = new Product(cart.getItem().getId(), cart.getItem().getName(), price);
		cart.setItem(p);
		cart.setUser(user);
		cart.setItemTotal(cart.getQty() * price);

		return cartRepository.save(cart);

	}

	@GetMapping("/{user}")
	public List<Cart> findItemByName(@PathVariable String user) {

		List<Cart> lst = cartRepository.findCartByUser(user);
		return lst;
	}

	@GetMapping("/delete/{id}")
	public void delteById(@PathVariable int id) {

		cartRepository.deleteById(id);
	}

}
