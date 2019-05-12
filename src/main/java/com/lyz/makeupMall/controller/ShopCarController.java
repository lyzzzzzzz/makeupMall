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
	
	/**
	 * 减少购物车商品数量
	 * 自己写的
	 * @return
	 */
	@RequestMapping(value = "/shopCar/reduceShopCar", method = RequestMethod.POST)
	@ApiOperation(value = " 减少购物车商品数量", notes = " 减少购物车商品数量")
	public int reduceShopCar(Integer productId, Integer userId, Integer productNum) {
		return this.shopCarService.reduceShopCar(productId, userId, productNum);
		
	}
	
	
	/**
	 * 添加购物车商品数量
	 * 自己写的
	 * @return
	 */
	@RequestMapping(value = "/shopCar/addShopCar", method = RequestMethod.POST)
	@ApiOperation(value = " 添加购物车商品数量", notes = " 添加购物车商品数量")
	public int addShopCar(Integer productId, Integer userId, Integer productNum) {
		return this.shopCarService.addShopCar(productId, userId, productNum);
		
	}
	
	/**
	 * 根据购物车Id批量删除购物车商品
	 * 自己写的
	 * @return
	 */
	@RequestMapping(value = "/shopCar/batchDeleteByIds", method = RequestMethod.DELETE)
	@ApiOperation(value = " 根据购物车Id批量删除购物车商品", notes = " 根据购物车Id批量删除购物车商品")
	public int batchDeleteByIds(int[] array) {
		return this.shopCarService.batchDeleteByIds(array);
	}
}
