package com.lyz.makeupMall.service.impl;

import static org.assertj.core.api.Assertions.assertThatIllegalStateException;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyz.makeupMall.domain.ShopCar;
import com.lyz.makeupMall.mapper.ShopCarMapper;
import com.lyz.makeupMall.service.IShopCarService;
@Service
public class ShopCarServiceImpl implements IShopCarService {
	@Autowired
	private ShopCarMapper shopCarMapper;

	@Override
	public int insertShopCar(Integer productId, Integer userId, Integer productNum) {
			 return this.shopCarMapper.insertShopCar(productId, userId, productNum);
			
	}



	@Override
	public int updateShopCar(Integer productId, Integer userId, Integer productNum) {
		return this.shopCarMapper.updateShopCar(productId, userId, productNum);
		
	}



	@Override
	public int selectCountFromShopCar(Integer productId, Integer userId) {
		// TODO Auto-generated method stub
		return this.shopCarMapper.selectCountFromShopCar(productId, userId);
		
	}



	@Override
	public int reduceShopCar(Integer productId, Integer userId, Integer productNum) {
		// TODO Auto-generated method stub
		return this.shopCarMapper.reduceShopCar(productId, userId, productNum);
	}



	@Override
	public int addShopCar(Integer productId, Integer userId, Integer productNum) {
		// TODO Auto-generated method stub
		return this.shopCarMapper.addShopCar(productId, userId, productNum);
	}


	
}
