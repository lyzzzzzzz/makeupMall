package com.lyz.makeupMall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lyz.makeupMall.domain.Brand;
import com.lyz.makeupMall.mapper.BrandMapper;
import com.lyz.makeupMall.service.IBrandService;

@Service
public class BrandServiceImpl implements IBrandService {
	@Autowired
	private BrandMapper brandMapper;

	public List<Brand> selectBrand(Brand brand){
		return brandMapper.selectBrand(brand);
	}
}
