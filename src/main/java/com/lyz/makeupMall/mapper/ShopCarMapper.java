package com.lyz.makeupMall.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.lyz.makeupMall.domain.ShopCar;
import com.lyz.makeupMall.service.impl.ProductServiceImpl;
import com.lyz.makeupMall.service.impl.ShopCarServiceImpl;

import tk.mybatis.mapper.common.Mapper;

public interface ShopCarMapper extends Mapper<ShopCar> {
	public int insertShopCar(@Param("productId") Integer productId,@Param("userId") Integer userId,@Param("productNum") Integer productNum);
	int selectCountFromShopCar(@Param("productId") Integer productId,@Param("userId") Integer userId);
	int updateShopCar(@Param("productId") Integer productId,@Param("userId") Integer userId,@Param("productNum") Integer productNum);
	int reduceShopCar(@Param("productId") Integer productId,@Param("userId") Integer userId,@Param("productNum") Integer productNum);
	int addShopCar(@Param("productId") Integer productId,@Param("userId") Integer userId,@Param("productNum") Integer productNum);
}