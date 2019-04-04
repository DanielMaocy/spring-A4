package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.demo.aop.LogPay;
import com.demo.aop.LogRMBPay;
import com.demo.aop.LogUSDPay;
import com.demo.service.PayService;
import com.demo.service.RMBPayService;
import com.demo.service.USDPayService;

@Configuration
@EnableAspectJAutoProxy // 启用AspectJ自动代理
public class ApplicationConfig {

	/**
	 * 声明切面Bean
	 * @Title: logPay
	 * @Description: 
	 * @Author: maocy
	 * @Date: 2019年4月4日 上午10:21:34
	 * @return
	 */
	@Bean
	public LogRMBPay logRMBPay() {
		return new LogRMBPay();
	}
	
	/**
	 * 声明切面Bean
	 * @Title: logUSDPay
	 * @Description: 
	 * @Author: maocy
	 * @Date: 2019年4月4日 上午10:34:30
	 * @return
	 */
	@Bean
	public LogUSDPay logUSDPay() {
		return new LogUSDPay();
	}
	
	/**
	 * 声明切面Bean
	 * @Title: logPay
	 * @Description: 
	 * @Author: maocy
	 * @Date: 2019年4月4日 上午11:04:04
	 * @return
	 */
	@Bean
	public LogPay logPay() {
		return new LogPay();
	}
	
	/**
	 * 声明支付Bean
	 * @Title: rmbPayService
	 * @Description: 
	 * @Author: maocy
	 * @Date: 2019年4月4日 上午10:22:28
	 * @return
	 */
	@Bean
	public PayService rmbPayService() {
		return new RMBPayService();
	}
	
	/**
	 * 声明USD支付Bean
	 * @Title: usdPayService
	 * @Description: 
	 * @Author: maocy
	 * @Date: 2019年4月4日 上午10:33:31
	 * @return
	 */
	@Bean
	public PayService usdPayService() {
		return new USDPayService();
	}
}
