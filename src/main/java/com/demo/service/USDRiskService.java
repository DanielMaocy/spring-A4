package com.demo.service;

/**
 * USD风控业务
 * @Title: USDRiskService
 * @Author: maocy
 * @Description: 
 * @Date: 2019年4月4日 上午11:20:10
 */
public class USDRiskService implements RiskService {

	@Override
	public void limitPayNum() {
		System.out.println("限制支付数量");
	}

}
