package com.demo.entity;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

/**
 * 产品
 * @Title: Product
 * @Author: maocy
 * @Description: 
 * @Date: 2019年3月20日 上午10:55:38
 */
@Component // 声明Bean
public class Product {

	// 产品名称
	private String name;
	
	// 单价
	private BigDecimal price;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}
	
	public void printProductInfo() {
		System.out.println("产品名称：" + this.name + "; 单价：" + this.price);
	}
}
