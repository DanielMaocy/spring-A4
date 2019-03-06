package com.demo;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
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
public class ApplicationTest {

	@Autowired
	ApplicationConfig config;
	
	@Autowired(required=false)
	Order order;
	
	@Test
	public void test() {
		assertTrue("ApplicationConfig为空！", null != config);
		assertTrue("Order为空！", null != order);
	}
}
