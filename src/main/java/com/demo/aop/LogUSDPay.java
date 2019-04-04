package com.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;

/**
 * 美元支付日志
 * @Title: LogUSDPay
 * @Author: maocy
 * @Description: 
 * @Date: 2019年4月4日 上午10:27:49
 */
public class LogUSDPay {
	
	/**
	 * 环绕通知
	 * @Title: around
	 * @Description: 
	 * @Author: maocy
	 * @Date: 2019年4月4日 下午2:19:56
	 * @param jp
	 */
	public void around(ProceedingJoinPoint jp) {
		try {
			System.out.println("=========USD支付开始=========");
			jp.proceed(); // 执行目标方法
			System.out.println("=========USD支付结束=========");
		} catch (Throwable e) {
			System.out.println("=========USD支付异常=========");
		}
	}
}
