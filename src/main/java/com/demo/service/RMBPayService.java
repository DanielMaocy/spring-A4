package com.demo.service;

/**
 * 人民币支付
 * @Title: RMBPayService
 * @Author: maocy
 * @Description: 
 * @Date: 2019年4月4日 上午10:03:36
 */
public class RMBPayService implements PayService {

	@Override
	public void payment(String orderNo) {
		System.out.println("========= RMB支付 =========");
	}

}
