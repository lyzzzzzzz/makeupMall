package com.lyz.makeupMall.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lyz.makeupMall.domain.Brand;
import com.lyz.makeupMall.domain.Order;
import com.lyz.makeupMall.service.impl.BrandServiceImpl;
import com.lyz.makeupMall.service.impl.OrderServiceImpl;

@RestController
public class OrderController {
	@Autowired
	private OrderServiceImpl orderService;
	
	/*
	 * 根据用户手机号查询接口
	 * @Param: Order order
	 * @return: List<Order>
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("order/selectByPhone")
	public List<Order> selectOrderByUserPhone(@RequestBody Order order){
		return orderService.selectOrderByUserPhone(order);
	}
	
	/*
	 * 根据订单状态查询接口
	 * @Param: Order order
	 * @return: ResultCode
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("order/selectByState")
	public List<Order> selectOrderByState(@RequestBody Order order){
		return orderService.selectOrderByState(order);
	}
	
	/*
	 * 添加订单接口
	 * @Param: Order order
	 * @return: List<Order>
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("user/insertOrder")
	public String insertOrder(@RequestBody Order order){
		return orderService.insertOrder(order);
	}
	
	/*
	 * 删除订单接口
	 * @Param: Order order
	 * @return: ResultCode
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("user/deleteOrder")
	public String deleteOrder(@RequestBody Order order){
		return orderService.deleteOrder(order);
	}
	
}
