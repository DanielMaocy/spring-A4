package com.demo.config;

import java.math.BigDecimal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.entity.PayInfo;

/**
 * 支付配置类
 * @Title: PayConfig
 * @Author: maocy
 * @Description: 
 * @Date: 2019年3月20日 下午5:14:15
 */
@Configuration
public class PayConfig {

	@Bean
	public PayInfo payInfo() {
		PayInfo payInfo = new PayInfo();
		payInfo.setPayOrderNo("O123456789");
		payInfo.setAmount(new BigDecimal("15000"));
		return payInfo;
	}
}
