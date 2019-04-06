package com.lyz.makeupMall.service;

import java.util.List;

import com.lyz.makeupMall.domain.Order;

public interface IOrderService {
	public List<Order> selectOrderByUserPhone(Order order);
	public List<Order> selectOrderByStatus(Order order);
	public List<Order> selectOrderByMonth(String userPhone,Long leftTime,Long rightTime);
	public String insertOrder(Order order);
}
