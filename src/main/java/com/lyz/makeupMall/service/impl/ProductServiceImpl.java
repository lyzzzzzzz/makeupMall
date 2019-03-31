package com.lyz.makeupMall.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyz.makeupMall.domain.Product;
import com.lyz.makeupMall.mapper.ProductMapper;
import com.lyz.makeupMall.service.IProductService;

@Service
public class ProductServiceImpl implements IProductService {
	@Autowired
	private ProductMapper productMapper;
	
	public List<Product> selectProductById(Product product){
		return productMapper.selectProductById(product);
	}
	
	public List<Product> selectProductByName(Product product){
		return productMapper.selectProductByName(product);
	}

	public List<Product> selectProductByBrand(Product product){
		return productMapper.selectProductByBrand(product);
	}

	public List<Product> selectProductByTime(Product product){
		return productMapper.selectProductByTime(product);
	}

	public List<Product> selectProductByType(Product product){
		return productMapper.selectProductByType(product);
	}
	
	public List<Product> selectProductBySale(Product product){
		return productMapper.selectProductBySale(product);
	}
	
	public List<Product> selectProductByNameOrBrand(String str){
		List<Product> productsList = new ArrayList<Product>();
		Product product = new Product();
		product.setProductName(str);
		productsList = productMapper.selectProductByName(product);
		if(!productsList.isEmpty()) {
			return productsList;
		}else {
			product.setProductBrand(str);
			productsList = productMapper.selectProductByBrand(product);
			if(!productsList.isEmpty()) {
				return productsList;
			}else {
				return new ArrayList<Product>();
			}
		}
	}
}
