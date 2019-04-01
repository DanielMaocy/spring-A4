package com.demo.entity;

public class Product {

	// 产品名称
	private String productName;
	
	public void printProductInfo() {
		System.out.println("产品信息：" + this.productName);
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}
}
