package com.lyz.makeupMall.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lyz.makeupMall.domain.Address;
import com.lyz.makeupMall.domain.Product;
import com.lyz.makeupMall.service.IAddressService;
import com.lyz.makeupMall.service.impl.BrandServiceImpl;

import io.swagger.annotations.ApiOperation;

@RestController
public class AddrController {
	@Autowired
	private IAddressService addressService;

	/**
	 * 根据用户Id查询地址
	 *
	 * @return
	 */
	@RequestMapping(value = "/addr/selectAllByUserId", method = RequestMethod.GET)
	@ApiOperation(value = " 根据用户Id查询地址", notes = " 根据用户Id查询地址")
	public List<Address> selectAllByUserId(Integer userId) {
		return this.addressService.selectAllByUserId(userId);
	}

	/**
	 * 新增地址
	 *
	 * @return
	 */
	@RequestMapping(value = "/addr/insertAddr", method = RequestMethod.POST)
	@ApiOperation(value = " 新增地址", notes = " 新增地址")
	public int insertAddr(@RequestBody Address address) {
		// TODO Auto-generated method stub
		return this.addressService.insertAddr(address);
	}
}
