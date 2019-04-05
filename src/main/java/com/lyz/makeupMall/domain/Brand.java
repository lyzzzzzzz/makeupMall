package com.lyz.makeupMall.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "brand")
public class Brand implements Serializable {
    @Column(name = "brand_id")
    private Integer brandId;

    @Column(name = "brand_name")
    private String brandName;
    
    @Column(name = "brand_sale")
    private Integer brandSale;
    
    @Column(name = "brand_picurl")
    private String brandPicUrl;

    private static final long serialVersionUID = 1L;

    /**
     * @return brand_id
     */
	public Integer getBrandId() {
		return brandId;
	}

	/**
     * @param brandId
     */
	public void setBrandId(Integer brandId) {
		this.brandId = brandId;
	}

	/**
     * @return brand_name
     */
	public String getBrandName() {
		return brandName;
	}

	/**
     * @param brandName
     */
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	
	/**
     * @return brand_sale
     */
	public int getBrandSale() {
		return brandSale;
	}

	/**
     * @param brandSale
     */
	public void setBrandSale(int brandSale) {
		this.brandSale = brandSale;
	}

	/**
     * @return brand_picurl
     */
	public String getBrandPicUrl() {
		return brandPicUrl;
	}

	/**
     * @param brandPicUrl
     */
	public void setBrandPicUrl(String brandPicUrl) {
		this.brandPicUrl = brandPicUrl;
	}
	
}