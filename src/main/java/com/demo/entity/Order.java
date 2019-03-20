package com.demo.entity;

import java.math.BigDecimal;

/**
 * 订单
 * @Title: Order
 * @Author: maocy
 * @Description: 
 * @Date: 2019年3月20日 上午10:55:29
 */
public class Order {

	// 订单编号
	private String orderNumber;
	
	// 产品
	private Product product;
	
	public void printOrderInfo() {
		System.out.println("订单编号：" + this.orderNumber);
		product.printProductInfo();
	}

	public String getOrderNumber() {
		return orderNumber;
	}

	public void setOrderNumber(String orderNumber) {
		this.orderNumber = orderNumber;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}
}
