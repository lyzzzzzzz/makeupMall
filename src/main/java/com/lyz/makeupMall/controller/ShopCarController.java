package com.lyz.makeupMall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lyz.makeupMall.domain.ShopCar;
import com.lyz.makeupMall.service.impl.ShopCarServiceImpl;

import io.swagger.annotations.ApiOperation;

@RestController
public class ShopCarController {
	@Autowired
	private ShopCarServiceImpl shopCarService;
	
	/**
	 * 加入购物车
	 * 自己写的
	 * @return
	 */
	@RequestMapping(value = "/shopCar/insertShopCar", method = RequestMethod.POST)
	@ApiOperation(value = " 加入购物车", notes = " 加入购物车")
	public int insertShopCar(Integer productId, Integer userId, Integer productNum) {
			int count=this.shopCarService.selectCountFromShopCar(productId, userId);
			
			if(count>0) {
				return this.shopCarService.updateShopCar(productId, userId, productNum);
				
			}else {
				return this.shopCarService.insertShopCar(productId, userId, productNum);
				
			}
			
	}
}
