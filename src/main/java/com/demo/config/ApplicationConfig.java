package com.demo.config;

import java.math.BigDecimal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.entity.Order;
import com.demo.entity.Product;

/**
 * 配置类
 * @Title: ApplicationConfig
 * @Author: maocy
 * @Description: 
 * @Date: 2019年3月20日 上午11:05:06
 */
@Configuration // 声明Java类为Java Config
public class ApplicationConfig {

	/**
	 * 声明Product Bean并初始化属性
	 * @Title: product
	 * @Description: 
	 * @Author: maocy
	 * @Date: 2019年3月20日 上午11:16:17
	 * @return
	 */
	@Bean
	public Product product() {
		Product product = new Product();
		product.setName("iphone XL");
		product.setPrice(new BigDecimal("12000"));
		return product;
	}
	
	/**
	 * 声明Order Bean并初始化属性引入Product依赖
	 * @Title: order
	 * @Description: 
	 * @Author: maocy
	 * @Date: 2019年3月20日 上午11:15:16
	 * @return
	 */
	@Bean
	public Order order(Product product) {
		Order order = new Order();
		order.setOrderNumber("0000000001");
		order.setProduct(product);
		return order;
	}
}
