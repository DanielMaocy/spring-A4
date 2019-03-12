package com.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.demo.entity.Order;

@Configuration
//@ComponentScan(value="com.demo.entity")
public class ApplicationConfig {

	@Bean
	public Order order() {
		return new Order();
	}
}
