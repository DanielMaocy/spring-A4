package com.demo.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * 记录日志
 * @Title: LogPay
 * @Author: maocy
 * @Description: 
 * @Date: 2019年4月4日 上午10:58:46
 */
@Aspect // 将LogPay类标注为一个切面
public class LogPay {

	/**
	 * 定义切点
	 * @Title: pointcut
	 * @Description: 
	 * @Author: maocy
	 * @Date: 2019年4月4日 上午10:59:19
	 */
	@Pointcut("execution(** com.demo.service.PayService.payment(..)) && args(orderNo)")
	public void pointcut(String orderNo) {
		
	}
	
	/**
	 * 支付之前
	 * @Title: payBefore
	 * @Description: 
	 * @Author: maocy
	 * @Date: 2019年4月4日 上午10:59:47
	 */
	@Before("pointcut(orderNo)")
	public void payBefore(String orderNo) {
		System.out.println("订单号：" + orderNo);
	}
}
