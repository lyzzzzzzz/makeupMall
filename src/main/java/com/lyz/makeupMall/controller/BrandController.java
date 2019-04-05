package com.lyz.makeupMall.controller;

import org.springframework.web.bind.annotation.RestController;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
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
	@ResponseBody
	public JSONArray selectBrand(){
		return JSONArray.parseArray(JSON.toJSONString(brandService.selectBrand()));
	}
	
}
