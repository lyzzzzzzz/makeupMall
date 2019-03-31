package com.lyz.makeupMall.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lyz.makeupMall.domain.Brand;
import com.lyz.makeupMall.service.impl.BrandServiceImpl;

@RestController
public class BrandController {
	@Autowired
	private BrandServiceImpl brandService;
	
	/*
	 * 查询品牌接口
	 * @Param: Brand brand
	 * @return: List<Brand>
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("brand/selectBrand")
	public List<Brand> selectBrand(@RequestBody Brand brand){
		return brandService.selectBrand(brand);
	}
	
}
