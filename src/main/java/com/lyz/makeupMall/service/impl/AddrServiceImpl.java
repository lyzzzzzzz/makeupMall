package com.lyz.makeupMall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyz.makeupMall.domain.Address;
import com.lyz.makeupMall.mapper.AddressMapper;
import com.lyz.makeupMall.service.IAddressService;


@Service
public class AddrServiceImpl implements IAddressService{

	@Autowired
	private AddressMapper addressMapper;
	
	@Override
	public List<Address> selectAllByUserId(Integer userId) {
		return this.addressMapper.selectAllByUserId(userId);
	}

	@Override
	public int insertAddr(Address address) {
		// TODO Auto-generated method stub
		return this.addressMapper.insertAddr(address);
	}

}
