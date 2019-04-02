package com.demo.entity;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("prod")
public class MerchantProd implements Merchant {
	
	private String merName;

	@Override
	public void printMerchantInfo() {
		this.merName = "PROD商户";
		System.out.println("商户名：" + this.merName);
	}

	public String getMerName() {
		return merName;
	}

	public void setMerName(String merName) {
		this.merName = merName;
	}
}
