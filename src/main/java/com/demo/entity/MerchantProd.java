package com.demo.entity;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("merProd")
public class MerchantProd implements Merchant {

	private String merName;
	
	@Override
	public void printMerchantInfo() {
		this.setMerName("PROD");
		System.out.println("商户名：" + this.merName);
	}

	public String getMerName() {
		return merName;
	}

	public void setMerName(String merName) {
		this.merName = merName;
	}
}
