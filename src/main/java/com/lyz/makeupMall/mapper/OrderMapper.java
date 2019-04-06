package com.lyz.makeupMall.mapper;

import java.util.List;

import com.lyz.makeupMall.domain.Order;

import tk.mybatis.mapper.common.Mapper;

public interface OrderMapper extends Mapper<Order> {
	List<Order> selectOrderByUserPhone(Order order);
	List<Order> selectOrderByStatus(Order order);
	List<Order> selectOrderByMonth(String userPhone,Long leftTime,Long rightTime);
	int insertOrder(Order order);
	int deleteOrder(Order order);
}