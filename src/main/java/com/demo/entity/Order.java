package com.demo.entity;

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
	
	// 支付信息
	private PayInfo payInfo;
	
	// 商户信息
	private Merchant merchant;
	
	public Order() {
		super();
	}

	public Order(Product product, PayInfo payInfo, Merchant merchant) {
		super();
		this.product = product;
		this.payInfo = payInfo;
		this.merchant = merchant;
	}

	public void printOrderInfo() {
		System.out.println("订单编号：" + this.orderNumber);
		product.printProductInfo();
		merchant.printMerInfo();
		payInfo.printPayInfo();
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

	public PayInfo getPayInfo() {
		return payInfo;
	}

	public void setPayInfo(PayInfo payInfo) {
		this.payInfo = payInfo;
	}

	public Merchant getMerchant() {
		return merchant;
	}

	public void setMerchant(Merchant merchant) {
		this.merchant = merchant;
	}
}
