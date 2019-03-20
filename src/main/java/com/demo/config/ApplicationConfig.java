package com.demo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 配置类
 * @Title: ApplicationConfig
 * @Author: maocy
 * @Description: 
 * @Date: 2019年3月20日 上午11:05:06
 */
@Configuration // 声明Java类为Java Config
@ComponentScan(value="com.demo.entity") // 开启自动扫描
public class ApplicationConfig {

}
