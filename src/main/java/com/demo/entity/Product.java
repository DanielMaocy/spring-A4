package com.demo.entity;

import java.math.BigDecimal;
import java.util.List;

/**
 * 产品
 * @Title: Product
 * @Author: maocy
 * @Description: 
 * @Date: 2019年3月20日 上午10:55:38
 */
public class Product {

	// 产品名称
	private String name;
	
	// 单价
	private BigDecimal price;
	
	// 产地
	private List<String> originList;

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
	
	public List<String> getOriginList() {
		return originList;
	}

	public void setOriginList(List<String> originList) {
		this.originList = originList;
	}

	public void printProductInfo() {
		System.out.println("产品名称：" + this.name + "; 单价：" + this.price);
		for (String origin : originList) {
			System.out.println("产地：" + origin);
		}
	}
}
