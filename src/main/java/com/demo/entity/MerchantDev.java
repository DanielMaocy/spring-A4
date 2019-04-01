package com.demo.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("merDev")
public class MerchantDev implements Merchant {
	
	private String merName;

	@Override
	public void printMerchantInfo() {
		this.setMerName("DEV");
		System.out.println("商户名：" + this.merName);
	}

	public String getMerName() {
		return merName;
	}

	public void setMerName(String merName) {
		this.merName = merName;
	}
}
