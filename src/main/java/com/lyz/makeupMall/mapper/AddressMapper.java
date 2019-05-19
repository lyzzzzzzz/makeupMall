package com.lyz.makeupMall.mapper;

import java.util.List;

import com.lyz.makeupMall.domain.Address;
import tk.mybatis.mapper.common.Mapper;

public interface AddressMapper extends Mapper<Address> {
	List<Address> selectAllByUserId(Integer userId);

	int insertAddr(Address address);
}