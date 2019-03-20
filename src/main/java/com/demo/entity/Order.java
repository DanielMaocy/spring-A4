package com.demo.entity;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 订单
 * @Title: Order
 * @Author: maocy
 * @Description: 
 * @Date: 2019年3月20日 上午10:55:29
 */
@Component // 声明Bean
public class Order {

	// 订单编号
	private String orderNumber;
	
	// 产品
	@Autowired // 引入依赖
	private Product product;
	
	public void printOrderInfo() {
		this.setOrderNumber("0000001");
		System.out.println("订单编号：" + this.orderNumber);
		
		product.setName("iphone10 plus");
		product.setPrice(new BigDecimal("7200"));
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
