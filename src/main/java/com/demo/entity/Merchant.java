package com.demo.entity;

public class Merchant {

	// 商户号
	private Long merNo;
	
	// 商户名称
	private String merName;
	
	public void printMerInfo() {
		System.out.println("商户号：" + this.merNo + "; 商户名称：" + this.merName);
	}

	public Long getMerNo() {
		return merNo;
	}

	public void setMerNo(Long merNo) {
		this.merNo = merNo;
	}

	public String getMerName() {
		return merName;
	}

	public void setMerName(String merName) {
		this.merName = merName;
	}
}
