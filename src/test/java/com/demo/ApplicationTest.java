package com.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
public class ApplicationTest {

	@Autowired(required=false)
	private Order order;
	
	@Autowired(required=false)
	private Order order2;
	
	@Autowired(required=false)
	private Product product;
	
	@Autowired(required=false)
	private Product product2;
	
	@Autowired(required=false)
	private Merchant merchant;
	
	@Autowired(required=false)
	private Merchant merchant2;
	
	@Test
	public void testOrder() {
		System.out.println(order.hashCode());
		System.out.println(order2.hashCode());
	}
	
	@Test
	public void testProduct() {
		System.out.println(product.hashCode());
		System.out.println(product2.hashCode());
	}
	
	@Test
	public void testMerchant() {
		System.out.println(merchant.hashCode());
		System.out.println(merchant2.hashCode());
	}
}
