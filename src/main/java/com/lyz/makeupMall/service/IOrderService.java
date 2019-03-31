package com.lyz.makeupMall.service;

import java.util.List;

import com.lyz.makeupMall.domain.Order;

public interface IOrderService {
	public List<Order> selectOrderByUserPhone(Order order);
	public List<Order> selectOrderByState(Order order);
	public String insertOrder(Order order);
}
