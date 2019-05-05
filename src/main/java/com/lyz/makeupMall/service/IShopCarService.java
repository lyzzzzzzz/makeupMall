package com.lyz.makeupMall.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lyz.makeupMall.domain.ShopCar;

public interface IShopCarService {
	public int insertShopCar(@Param("productId") Integer productId,@Param("userId") Integer userId,@Param("productNum") Integer productNum);
	int selectCountFromShopCar(@Param("productId") Integer productId,@Param("userId") Integer userId);
	int updateShopCar(@Param("productId") Integer productId,@Param("userId") Integer userId,@Param("productNum") Integer productNum);
}
