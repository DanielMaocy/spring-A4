package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import com.demo.entity.Order;

@Configuration
public class ApplicationConfig {

	@Bean
	@Conditional(InitProfile.class)
	public Order orderProd() {
		Order order = new Order();
		order.setOrderNo("PROD00001");
		return order;
	}
}
