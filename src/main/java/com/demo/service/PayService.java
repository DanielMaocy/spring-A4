package com.demo.service;

/**
 * 支付接口
 * @Title: PayService
 * @Author: maocy
 * @Description: 
 * @Date: 2019年4月4日 上午10:03:27
 */
public interface PayService {

	/**
	 * 支付
	 * @Title: payment
	 * @Description: 
	 * @Author: maocy
	 * @Date: 2019年4月4日 上午11:02:45
	 * @param orderNo
	 */
	public void payment(String orderNo);
}
