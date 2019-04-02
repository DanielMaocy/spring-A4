package com.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.config.ApplicationConfig;
import com.demo.entity.Merchant;
import com.demo.entity.Order;
import com.demo.entity.Product;

/**
 * 测试类
 * @Title: ApplicationTest
 * @Author: maocy
 * @Description: 
 * @Date: 2019年3月6日 下午2:57:03
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {ApplicationConfig.class})
//@ContextConfiguration("/spring.xml")
@ActiveProfiles("dev")
public class ApplicationTest {

	@Autowired(required=false)
	private Order order;
	
	@Autowired(required=false)
	private Product product;
	
	@Autowired(required=false)
	private Merchant merchant;
	
	@Test
	public void test() {
		order.printOrderInfo();
	}
	
	@Test
	public void testProduct() {
		product.printProductInfo();
	}
	
	@Test
	public void testMerchant() {
		merchant.printMerchantInfo();
	}
}
