package com.lyz.makeupMall.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lyz.makeupMall.component.ResultCode;
import com.lyz.makeupMall.domain.Order;
import com.lyz.makeupMall.mapper.OrderMapper;
import com.lyz.makeupMall.service.IOrderService;

@Service
public class OrderServiceImpl implements IOrderService {
	@Autowired
	private OrderMapper orderMapper;
	
	public List<Order> selectOrderByUserPhone(Order order) {
		return orderMapper.selectOrderByUserPhone(order);
	}
	
	public List<Order> selectOrderByState(Order order) {
		return orderMapper.selectOrderByState(order);
	}
	
	public String insertOrder(Order order) {
		if(orderMapper.insertOrder(order) > 0) {
			return ResultCode.SUCCESS;
		}else {
			return ResultCode.FAIL;
		}
	}
	
	public String deleteOrder(Order order) {
		if(orderMapper.deleteOrder(order) > 0) {
			return ResultCode.SUCCESS;
		}else {
			return ResultCode.FAIL;
		}
	}

}
