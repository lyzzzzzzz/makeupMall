package com.lyz.makeupMall.service;

import java.util.List;

import com.lyz.makeupMall.domain.Address;

public interface IAddressService {
	List<Address> selectAllByUserId(Integer userId);
	int insertAddr(Address address);
}
