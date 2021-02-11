package com.cts.order.entity;

public class Cart {

	private int cartId;
	private String user;
	private Product item;
	private int qty;
	private double itemTotal;

	public Cart() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Cart(String user, Product item, int qty, double itemTotal) {
		super();
		this.user = user;
		this.item = item;
		this.qty = qty;
		this.itemTotal = itemTotal;
	}

	public Cart(Product item, double itemTotal, int qty) {
		super();
		this.item = item;
		this.itemTotal = itemTotal;
		this.qty = qty;
	}

	public int getCartId() {
		return cartId;
	}

	public void setCartId(int cartId) {
		this.cartId = cartId;
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public Product getItem() {
		return item;
	}

	public void setItem(Product item) {
		this.item = item;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(double itemTotal) {
		this.itemTotal = itemTotal;
	}

}
