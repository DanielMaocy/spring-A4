package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.demo.entity.Order;

@Configuration
@ComponentScan("com.demo.entity")
public class ApplicationConfig {

	@Bean
	@Primary
	public Order orderDev() {
		Order order = new Order();
		order.setOrderNo("DEV00001");
		return order;
	}
	
	@Bean
	public Order orderProd() {
		Order order = new Order();
		order.setOrderNo("PROD00001");
		return order;
	}
}
