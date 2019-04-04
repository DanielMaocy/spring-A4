package com.demo.service;

/**
 * 美元支付
 * @Title: USDPayService
 * @Author: maocy
 * @Description: 
 * @Date: 2019年4月4日 上午10:26:54
 */
public class USDPayService implements PayService {

	@Override
	public void payment(String orderNo) {
		System.out.println("========= USD支付 =========");
	}

}
