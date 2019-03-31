package com.lyz.makeupMall.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lyz.makeupMall.domain.Product;
import com.lyz.makeupMall.service.impl.ProductServiceImpl;

@RestController
public class ProductController {
	@Autowired
	private ProductServiceImpl productService;
	
	/*
	 * 根据产品ID查询接口
	 * @Param: Product product
	 * @return: List<Product>
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("product/selectById")
	public List<Product> selectProductById(@RequestBody Product product){
		return productService.selectProductById(product);
	}
	
	/*
	 * 根据产品名字查询接口
	 * @Param: Product product
	 * @return: List<Product>
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("product/selectByName")
	public List<Product> selectProductByName(@RequestBody Product product){
		return productService.selectProductByName(product);
	}

	/*
	 * 根据产品品牌查询接口
	 * @Param: Product product
	 * @return: List<Product>
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("product/selectByBrand")
	public List<Product> selectProductByBrand(@RequestBody Product product){
		return productService.selectProductByBrand(product);
	}

	/*
	 * 根据产品上架时间查询接口
	 * @Param: Product product
	 * @return: List<Product>
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("product/selectByTime")
	public List<Product> selectProductByTime(@RequestBody Product product){
		return productService.selectProductByTime(product);
	}

	/*
	 * 根据产品种类查询接口
	 * @Param: Product product
	 * @return: List<Product>
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("product/selectByType")
	public List<Product> selectProductByType(@RequestBody Product product){
		return productService.selectProductByType(product);
	}
	
	/*
	 * 根据产品销量查询接口
	 * @Param: Product product
	 * @return: List<Product>
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("product/selectBySale")
	public List<Product> selectProductBySale(@RequestBody Product product){
		return productService.selectProductBySale(product);
	}
	
	/*
	 * 根据产品名字或品牌查询接口
	 * @Param: String str
	 * @return: List<Product>
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("product/selectByNameOrBrand")
	public List<Product> selectProductByNameOrBrand(String str){
		return productService.selectProductByNameOrBrand(str);
	}
}
