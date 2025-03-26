package com.java8.streams.sorting;

import java.time.LocalDate;

public class Order {

	private String orderId;
	private String customerId;
	private double orderValue;
	private LocalDate orderDate;

	public Order(String orderId, String customerId, double orderValue, LocalDate orderDate) {
		super();
		this.orderId = orderId;
		this.customerId = customerId;
		this.orderValue = orderValue;
		this.orderDate = orderDate;
	}

	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}

	public double getOrderValue() {
		return orderValue;
	}

	public void setOrderValue(double orderValue) {
		this.orderValue = orderValue;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", customerId=" + customerId + ", orderValue=" + orderValue
				+ ", orderDate=" + orderDate + "]";
	}

}
