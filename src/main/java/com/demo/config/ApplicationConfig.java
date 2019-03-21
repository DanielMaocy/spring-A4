package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.ImportResource;

import com.demo.entity.Merchant;
import com.demo.entity.Order;
import com.demo.entity.PayInfo;
import com.demo.entity.Product;

/**
 * 主配置类
 * @Title: ApplicationConfig
 * @Author: maocy
 * @Description: 
 * @Date: 2019年3月20日 下午5:13:37
 */
@Configuration
@Import({PayConfig.class, ProductConfig.class}) // 引入Java Config配置
@ImportResource("classpath:spring.xml") // 引入XML配置
public class ApplicationConfig {

	@Bean
	public Order order(Product product, PayInfo payInfo, Merchant merchant) {
		Order order = new Order();
		order.setOrderNumber("OR123456789");
		order.setProduct(product);
		order.setPayInfo(payInfo);
		order.setMerchant(merchant);
		return order;
	}
	
}
