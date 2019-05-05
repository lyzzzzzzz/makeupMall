package com.lyz.makeupMall.service;

import java.util.List;

import org.apache.ibatis.annotations.Param;

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
	List<Product> SelectProductByTypeOrNameOrBrand(String search);
	List<Product> SelectProductBaseBrand(@Param("productBrand") String productBrand,@Param("searchText") String searchText);
	List<Product> SelectProductBaseType(@Param("productType") String productType,@Param("searchText") String searchText);
	List<Product> selectProductByUserId(Integer userId);
}
