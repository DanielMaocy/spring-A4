package com.demo.config;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.demo.entity.Product;

/**
 * 产品配置类
 * @Title: ProductConfig
 * @Author: maocy
 * @Description: 
 * @Date: 2019年3月20日 下午5:13:54
 */
@Configuration
public class ProductConfig {

	@Bean
	public Product product() {
		Product product = new Product();
		product.setName("iphone XS");
		product.setPrice(new BigDecimal("15000"));
		List<String> originList = new ArrayList<String>();
		originList.add("中国大陆");
		originList.add("中国台湾");
		originList.add("越南河内");
		originList.add("泰国曼谷");
		product.setOriginList(originList);
		return product;
	}
}
