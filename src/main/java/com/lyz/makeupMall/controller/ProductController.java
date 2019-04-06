package com.lyz.makeupMall.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.lyz.makeupMall.domain.Product;
import com.lyz.makeupMall.service.impl.ProductServiceImpl;

@RestController
public class ProductController {
	@Autowired
	private ProductServiceImpl productService;
	
	/*
	 * 根据产品ID查询接口
	 * @Param: Product product
	 * @return: JSONArray
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("product/selectById")
	@ResponseBody
	public JSONArray selectProductById(@RequestBody Map<String, Object> productMap){
		Product product = new Product();
		product.setProductId(Integer.valueOf(productMap.get("productId").toString()));
		return JSONArray.parseArray(JSON.toJSONString(productService.selectProductById(product)));
	}

	/*
	 * 根据产品上架时间查询接口
	 * @Param: Product product
	 * @return: JSONArray
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("product/selectByTime")
	@ResponseBody
	public JSONArray selectProductByTime(@RequestBody Map<String, Object> productTimeMap) throws Exception{
		Long leftTime = Long.valueOf(productTimeMap.get("leftTime").toString());
		Long rightTime = Long.valueOf(productTimeMap.get("rightTime").toString());
		return JSONArray.parseArray(JSON.toJSONString(productService.selectProductByTime(leftTime,rightTime)));
	}

	/*
	 * 根据产品种类查询接口
	 * @Param: Product product
	 * @return: JSONArray
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("product/selectByType")
	@ResponseBody
	public JSONArray selectProductByType(@RequestBody Map<String, Object> productMap){
		Product product = new Product();
        product.setProductType(productMap.get("productType").toString());
		return JSONArray.parseArray(JSON.toJSONString(productService.selectProductByType(product)));
	}
	
	/*
	 * 根据销量排序全部查询接口
	 * @Param: 
	 * @return: JSONArray
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("product/selectAllBySale")
	@ResponseBody
	public JSONArray selectProductAllBySale(){
		return JSONArray.parseArray(JSON.toJSONString(productService.selectProductAllBySale()));
	}
	
	/*
	 * 根据产品名字或品牌查询接口
	 * @Param: String str
	 * @return: List<Product>
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("product/selectByNameOrBrand")
	@ResponseBody
	public JSONArray selectProductByNameOrBrand(@RequestBody Map<String, Object> productMap){
		return JSONArray.parseArray(JSON.toJSONString(productService.selectProductByNameOrBrand(productMap.get("nameOrBrand").toString())));
	}
}
