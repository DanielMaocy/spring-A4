package com.demo.entity;

import java.math.BigDecimal;

/**
 * 支付信息
 * @Title: PayInfo
 * @Author: maocy
 * @Description: 
 * @Date: 2019年3月20日 下午5:23:01
 */
public class PayInfo {

	// 支付订单号
	private String payOrderNo;
	
	// 支付金额
	private BigDecimal amount;
	
	public void printPayInfo() {
		System.out.println("支付订单号：" + this.payOrderNo + "; 支付金额：" + this.amount);
	}

	public String getPayOrderNo() {
		return payOrderNo;
	}

	public void setPayOrderNo(String payOrderNo) {
		this.payOrderNo = payOrderNo;
	}

	public BigDecimal getAmount() {
		return amount;
	}

	public void setAmount(BigDecimal amount) {
		this.amount = amount;
	}
}
