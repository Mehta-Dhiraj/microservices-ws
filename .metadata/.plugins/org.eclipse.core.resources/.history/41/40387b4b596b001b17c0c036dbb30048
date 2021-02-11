package com.cts.cart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

	@Id
	private int id;
	private String name;
	private double price;
	private double itemTotal;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(int id, String name, double price, double itemTotal) {
		super();
		this.name = name;
		this.price = price;
		this.itemTotal = itemTotal;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public double getItemTotal() {
		return itemTotal;
	}

	public void setItemTotal(double itemTotal) {
		this.itemTotal = itemTotal;
	}

}
