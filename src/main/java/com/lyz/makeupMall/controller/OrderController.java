package com.lyz.makeupMall.controller;

import org.springframework.web.bind.annotation.RestController;

import java.util.Calendar;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.lyz.makeupMall.domain.Order;
import com.lyz.makeupMall.service.impl.OrderServiceImpl;

@RestController
public class OrderController {
	@Autowired
	private OrderServiceImpl orderService;
	
	/*
	 * 根据用户手机号查询接口
	 * @Param: Order order
	 * @return: JSONArray
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("order/selectByPhone")
	@ResponseBody
	public JSONArray selectOrderByUserPhone(@RequestBody Map<String, Object> orderMap){
		Order order = new Order();
		order.setOrderUserPhone(orderMap.get("orderUserPhone").toString());
		return JSONArray.parseArray(JSON.toJSONString(orderService.selectOrderByUserPhone(order))); 
	}
	
	/*
	 * 根据订单状态查询接口
	 * @Param: Order order
	 * @return: ResultCode
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("order/selectByStatus")
	@ResponseBody
	public JSONArray selectOrderByState(@RequestBody Map<String, Object> orderMap){
		Order order = new Order();
		order.setOrderUserPhone(orderMap.get("orderUserPhone").toString());
		order.setOrderStatus(orderMap.get("orderStatus").toString());
		return JSONArray.parseArray(JSON.toJSONString(orderService.selectOrderByStatus(order))); 
	}
	
	/*
	 * 添加订单接口
	 * @Param: Order order
	 * @return: List<Order>
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("order/insertOrder")
	@ResponseBody
	public String insertOrder(@RequestBody Map<String, Object> orderMap){
		Order order = new Order();
		order.setOrderUserPhone(orderMap.get("orderUserPhone").toString());
		order.setOrderName(orderMap.get("orderName").toString());
		order.setOrderAddress(orderMap.get("orderAddress").toString());
		order.setOrderDetail(orderMap.get("orderDetail").toString());
		order.setOrderTotal(Float.valueOf(orderMap.get("orderTotal").toString()));
		Calendar c = Calendar.getInstance();
		order.setOrderTime(c.getTimeInMillis());
		order.setOrderStatus(orderMap.get("orderStatus").toString());
		return orderService.insertOrder(order);
	}
	
	/*
	 * 删除订单接口
	 * @Param: Order order
	 * @return: ResultCode
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("order/deleteOrderById")
	@ResponseBody
	public String deleteOrder(@RequestBody Map<String, Object> orderMap){
		Order order = new Order();
		order.setOrderId(Integer.valueOf(orderMap.get("orderId").toString()));
		return orderService.deleteOrder(order);
	}
	
	/*
	 * 根据月份查询接口
	 * @Param: Order order
	 * @return: ResultCode
	 * @updateTime: 2019-03-31 22:30
	 **/
	@RequestMapping("order/selectOrderByMonth")
	@ResponseBody
	public JSONArray selectOrderByMonth(@RequestBody Map<String, Object> orderTimeMap){
		Long leftTime = Long.valueOf(orderTimeMap.get("leftTime").toString());
		Long rightTime = Long.valueOf(orderTimeMap.get("rightTime").toString());
		String userPhone = orderTimeMap.get("userPhone").toString();
		return JSONArray.parseArray(JSON.toJSONString(orderService.selectOrderByMonth(userPhone,leftTime,rightTime))); 
	}
}
