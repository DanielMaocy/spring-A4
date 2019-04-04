package com.demo.aop;

/**
 * 支付日志
 * @Title: Log
 * @Author: maocy
 * @Description: 
 * @Date: 2019年4月4日 上午10:04:54
 */
public class LogRMBPay {

	/**
	 * 前置通知：支付之前
	 * @Title: payBefore
	 * @Description: 
	 * @Author: maocy
	 * @Date: 2019年4月4日 上午10:06:01
	 */
	public void payBefore() {
		System.out.println("=========RMB支付开始=========");
	}
	
	/**
	 * 后置通知
	 * @Title: payAfter
	 * @Description: 
	 * @Author: maocy
	 * @Date: 2019年4月4日 上午10:17:11
	 */
	public void payAfter() {
		System.out.println("=========RMB支付结束=========");
	}
	
	/**
	 * 返回通知
	 * @Title: payReturn
	 * @Description: 
	 * @Author: maocy
	 * @Date: 2019年4月4日 上午10:17:44
	 */
	public void payReturn() {
		System.out.println("=========RMB支付返回=========");
	}
	
	/**
	 * 异常通知
	 * @Title: payException
	 * @Description: 
	 * @Author: maocy
	 * @Date: 2019年4月4日 上午10:17:54
	 */
	public void payException() {
		System.out.println("=========RMB支付异常=========");
	}
}
