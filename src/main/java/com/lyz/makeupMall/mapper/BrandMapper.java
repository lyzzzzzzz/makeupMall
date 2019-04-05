package com.lyz.makeupMall.mapper;

import java.util.List;

import com.lyz.makeupMall.domain.Brand;
import tk.mybatis.mapper.common.Mapper;

public interface BrandMapper extends Mapper<Brand> {
	List<Brand> selectBrand();
}