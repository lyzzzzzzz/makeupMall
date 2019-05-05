package com.lyz.makeupMall.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "shopcar")
public class ShopCar implements Serializable {
    @Id
    @Column(name = "shopCar_id")
    private Integer shopcarId;

    @Column(name = "product_id")
    private Integer productId;

    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "product_num")
    private Integer productNum;

    private static final long serialVersionUID = 1L;

    /**
     * @return shopCar_id
     */
    public Integer getShopcarId() {
        return shopcarId;
    }

    /**
     * @param shopcarId
     */
    public void setShopcarId(Integer shopcarId) {
        this.shopcarId = shopcarId;
    }

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
     * @return user_id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * @param userId
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * @return product_num
     */
    public Integer getProductNum() {
        return productNum;
    }

    /**
     * @param productNum
     */
    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
    }

	@Override
	public String toString() {
		return "ShopCar [shopcarId=" + shopcarId + ", productId=" + productId + ", userId=" + userId + ", productNum="
				+ productNum + "]";
	}
    
    
}