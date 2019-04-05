package com.lyz.makeupMall.service;

import java.util.List;

import com.lyz.makeupMall.domain.Product;

public interface IProductService {
	List<Product> selectProductById(Product product);
	List<Product> selectProductByTime(Product product);
	List<Product> selectProductByType(Product product);
	List<Product> selectProductAllBySale();
	List<Product> selectProductByNameOrBrand(String str);
}
