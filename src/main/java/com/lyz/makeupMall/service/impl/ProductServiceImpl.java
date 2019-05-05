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

	public List<Product> selectProductByTime(Long leftTime,Long rightTime){
		return productMapper.selectProductByTime(leftTime,rightTime);
	}

	public List<Product> selectProductByType(Product product){
		return productMapper.selectProductByType(product);
	}
	
	public List<Product> selectProductAllBySale(){
		return productMapper.selectProductAllBySale();
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

	@Override
	public List<Product> selectProductByToday() {
		List<Product> productListByToday=productMapper.selectProductByToday();
		return productListByToday;
	}

	@Override
	public List<Product> mySelectProductByBrand(String product_brand) {
		List<Product> list=this.productMapper.mySelectProductByBrand(product_brand);
		return list;
	}

	@Override
	public List<Product> mySelectProductByType(String productType) {
		List<Product> list=this.productMapper.mySelectProductByType(productType);
		return list;
	}

	@Override
	public List<Product> SelectProductByTypeOrNameOrBrand(String search) {
		List<Product> list=this.productMapper.SelectProductByTypeOrNameOrBrand(search);
		return list;
	}

	@Override
	public List<Product> SelectProductBaseBrand(String productBrand, String searchText) {
		List<Product> list=this.productMapper.SelectProductBaseBrand(productBrand, searchText);
		return list;
	}

	@Override
	public List<Product> SelectProductBaseType(String productType, String searchText) {
		List<Product> list=this.productMapper.SelectProductBaseType(productType, searchText);
		return list;
	}

	@Override
	public List<Product> selectProductByUserId(Integer userId) {
		return this.productMapper.selectProductByUserId(userId);
	}

	

	
}
