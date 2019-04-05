package com.lyz.makeupMall.domain;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.*;

@Table(name = "orders")
public class Order implements Serializable {
    @Column(name = "order_id")
    private Integer orderId;

    @Column(name = "order_userphone")
    private String orderUserPhone;
    
    @Column(name = "order_name")
    private String orderName;
    
    @Column(name = "order_address")
    private String orderAddress;
    
    @Column(name = "order_detail")
    private String orderDetail;
    
    @Column(name = "order_total")
    private Float orderTotal;
    
    @Column(name = "order_time")
    private Long orderTime;
    
    @Column(name = "order_status")
    private String orderStatus;

    private static final long serialVersionUID = 1L;

    /**
     * @return order_id
     */
	public Integer getOrderId() {
		return orderId;
	}

	/**
     * @param orderId
     */
	public void setOrderId(Integer orderId) {
		this.orderId = orderId;
	}

	/**
     * @return order_userphone
     */
	public String getOrderUserPhone() {
		return orderUserPhone;
	}

	/**
     * @param orderUserPhone
     */
	public void setOrderUserPhone(String orderUserPhone) {
		this.orderUserPhone = orderUserPhone;
	}

	/**
     * @return order_name
     */
	public String getOrderName() {
		return orderName;
	}

	/**
     * @param orderName
     */
	public void setOrderName(String orderName) {
		this.orderName = orderName;
	}

	/**
     * @return order_address
     */
	public String getOrderAddress() {
		return orderAddress;
	}

	/**
     * @param orderAddress
     */
	public void setOrderAddress(String orderAddress) {
		this.orderAddress = orderAddress;
	}

	/**
     * @return order_detail
     */
	public String getOrderDetail() {
		return orderDetail;
	}

	/**
     * @param orderDetail
     */
	public void setOrderDetail(String orderDetail) {
		this.orderDetail = orderDetail;
	}

	/**
     * @return order_total
     */
	public Float getOrderTotal() {
		return orderTotal;
	}

	/**
     * @param orderTotal
     */
	public void setOrderTotal(Float orderTotal) {
		this.orderTotal = orderTotal;
	}

	/**
     * @return order_time
     */
	public Long getOrderTime() {
		return orderTime;
	}

	/**
     * @param orderTime
     */
	public void setOrderTime(Long orderTime) {
		this.orderTime = orderTime;
	}

	/**
     * @return orderState
     */
	public String getOrderStatus() {
		return orderStatus;
	}

	/**
     * @param orderState
     */
	public void setOrderState(String orderStatus) {
		this.orderStatus = orderStatus;
	}
}