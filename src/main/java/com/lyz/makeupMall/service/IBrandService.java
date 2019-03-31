package com.lyz.makeupMall.service;

import java.util.List;

import com.lyz.makeupMall.domain.Brand;

public interface IBrandService {
	List<Brand> selectBrand(Brand brand);
}
