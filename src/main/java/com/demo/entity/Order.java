package com.demo.entity;

public class Order {

	private String orderNo;
	
	public void printOrderInfo() {
		System.out.println("订单号码：" + this.orderNo);
	}

	public String getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}
}
