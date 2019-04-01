package com.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.config.ApplicationConfig;
import com.demo.entity.Order;

/**
 * 测试类
 * @Title: ApplicationTest
 * @Author: maocy
 * @Description: 
 * @Date: 2019年3月6日 下午2:57:03
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes= {ApplicationConfig.class})
@ActiveProfiles("prod")
public class ApplicationTest {

	@Autowired(required=false)
	private Order order;
	
	@Test
	public void testOrder() {
		assertTrue("order为空。。。", null != order);
		order.printOrderInfo();
	}
}
