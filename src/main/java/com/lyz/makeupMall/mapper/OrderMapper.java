package com.lyz.makeupMall.mapper;

import java.util.List;

import com.lyz.makeupMall.domain.Order;

import tk.mybatis.mapper.common.Mapper;

public interface OrderMapper extends Mapper<Order> {
	List<Order> selectOrderByUserPhone(Order order);
	List<Order> selectOrderByState(Order order);
	int insertOrder(Order order);
	int deleteOrder(Order order);
}