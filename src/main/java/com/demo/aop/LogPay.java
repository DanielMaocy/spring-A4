package com.demo.aop;

/**
 * 记录日志
 * @Title: LogPay
 * @Author: maocy
 * @Description: 
 * @Date: 2019年4月4日 上午10:58:46
 */
public class LogPay {

	/**
	 * 支付之前
	 * @Title: payBefore
	 * @Description: 
	 * @Author: maocy
	 * @Date: 2019年4月4日 上午10:59:47
	 */
	public void payBefore(String orderNo) {
		System.out.println("订单号：" + orderNo);
	}
}
