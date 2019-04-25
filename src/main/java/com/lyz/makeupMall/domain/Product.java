package com.lyz.makeupMall.domain;

import java.io.Serializable;

import javax.persistence.*;

@Table(name = "product")
public class Product implements Serializable {
    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "product_name")
    private String productName;

    @Column(name = "product_price")
    private Float productPrice;
    
    @Column(name = "product_describe")
    private String productDescribe;
    
    @Column(name = "product_color")
    private String productColor;
    
    @Column(name = "product_capicity")
    private String productCapicity;
    
    @Column(name = "product_brand")
    private String productBrand;
    
    @Column(name = "product_type")
    private String productType;

    @Column(name = "product_time")
    private String productTime;
    
    @Column(name = "product_sale")
    private Integer productSale;
    
    @Column(name = "product_picurl")
    private String productPicUrl;

    private static final long serialVersionUID = 1L;

    /**
     * @return product_id
     */
	public Integer getProductId() {
		return productId;
	}

	/**
     * @param productId
     */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
     * @return product_name
     */
	public String getProductName() {
		return productName;
	}

	/**
     * @param productName
     */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
     * @return product_price
     */
	public Float getProductPrice() {
		return productPrice;
	}

	/**
     * @param productPrice
     */
	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

	/**
     * @return product_describe
     */
	public String getProductDescribe() {
		return productDescribe;
	}

	/**
     * @param productDescribe
     */
	public void setProductDescribe(String productDescribe) {
		this.productDescribe = productDescribe;
	}

	/**
     * @return product_color
     */
	public String getProductColor() {
		return productColor;
	}

	/**
     * @param productColor
     */
	public void setProductColor(String productColor) {
		this.productColor = productColor;
	}


	
	public String getProductCapicity() {
		return productCapicity;
	}

	public void setProductCapicity(String productCapicity) {
		this.productCapicity = productCapicity;
	}

	/**
     * @return product_brand
     */
	public String getProductBrand() {
		return productBrand;
	}

	/**
     * @param productBrand
     */
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}
	
	/**
     * @return product_type
     */
	public String getProductType() {
		return productType;
	}

	/**
     * @param productType
     */
	public void setProductType(String productType) {
		this.productType = productType;
	}

	

	public String getProductTime() {
		return productTime;
	}

	public void setProductTime(String productTime) {
		this.productTime = productTime;
	}

	/**
     * @return product_sale
     */
	public Integer getProductSale() {
		return productSale;
	}

	/**
     * @param productSale
     */
	public void setProductSale(Integer productSale) {
		this.productSale = productSale;
	}

	/**
     * @return product_picurl
     */
	public String getProductPicUrl() {
		return productPicUrl;
	}

	/**
     * @param productPicUrl
     */
	public void setProductPicUrl(String productPicUrl) {
		this.productPicUrl = productPicUrl;
	}

}