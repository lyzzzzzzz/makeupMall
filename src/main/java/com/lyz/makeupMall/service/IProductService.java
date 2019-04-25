package com.lyz.makeupMall.service;

import java.util.List;

import com.lyz.makeupMall.domain.Product;

public interface IProductService {
	List<Product> selectProductById(Product product);
	List<Product> selectProductByTime(Long leftTime,Long rightTime);
	List<Product> selectProductByType(Product product);
	List<Product> selectProductAllBySale();
	List<Product> selectProductByNameOrBrand(String str);
	List<Product> selectProductByToday();
	List<Product> mySelectProductByBrand(String product_brand);
	List<Product> mySelectProductByType(String productType);
}
