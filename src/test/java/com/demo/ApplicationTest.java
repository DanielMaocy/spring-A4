package com.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.service.PayService;
import com.demo.service.RiskService;

/**
 * 测试类
 * @Title: ApplicationTest
 * @Author: maocy
 * @Description: 
 * @Date: 2019年3月6日 下午2:57:03
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("/spring.xml")
public class ApplicationTest {

	@Autowired
	private PayService rmbPayService;
	
	@Autowired
	private PayService usdPayService;
	
	@Test
	public void testRMBPayService() {
		rmbPayService.payment("RMB00001");
	}
	
	@Test
	public void testUSDPayService() {
		usdPayService.payment("USD00002");
		RiskService riskService = (RiskService) usdPayService;
		riskService.limitPayNum();
	}
}
