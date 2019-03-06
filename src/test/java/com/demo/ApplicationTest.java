package com.demo;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.demo.config.ApplicationConfig;

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

}
