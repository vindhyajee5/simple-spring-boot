package com.vindhya.model;

public class Order {

	private String orderName;

	public Order(String orderName) {
		super();
		this.orderName = orderName;
	}

	public String getOrderName() {
		return orderName;
	}

	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	@Override
	public String toString() {
		return "Order [orderName=" + orderName + "]";
	}
	
}
