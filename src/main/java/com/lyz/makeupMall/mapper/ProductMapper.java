package com.lyz.makeupMall.mapper;

import java.util.List;

import com.lyz.makeupMall.domain.Product;

import tk.mybatis.mapper.common.Mapper;

public interface ProductMapper extends Mapper<Product> {
	List<Product> selectProductById(Product product);
	List<Product> selectProductByName(Product product);
	List<Product> selectProductByBrand(Product product);
	List<Product> selectProductByTime(Product product);
	List<Product> selectProductByType(Product product);
	List<Product> selectProductAllBySale();
}