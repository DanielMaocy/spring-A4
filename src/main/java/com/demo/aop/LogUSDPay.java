package com.demo.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.DeclareParents;
import org.aspectj.lang.annotation.Pointcut;

import com.demo.service.RiskService;
import com.demo.service.USDRiskService;

/**
 * 美元支付日志
 * @Title: LogUSDPay
 * @Author: maocy
 * @Description: 
 * @Date: 2019年4月4日 上午10:27:49
 */
@Aspect // 将LogPay类标注为一个切面
public class LogUSDPay {
	
	/**
	 * 引入新功能
	 */
	@DeclareParents(value="com.demo.service.PayService+", defaultImpl=USDRiskService.class)
	private RiskService usdRiskService;
	
	/**
	 * 定义切点
	 * @Title: pointcut
	 * @Description: 
	 * @Author: maocy
	 * @Date: 2019年4月4日 上午10:29:09
	 */
	@Pointcut("execution(** com.demo.service.USDPayService.payment(..))")
	public void pointcut() {
		
	}
	
	@Around("pointcut()")
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
