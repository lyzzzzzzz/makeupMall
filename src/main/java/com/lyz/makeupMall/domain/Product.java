package com.lyz.makeupMall.domain;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "product")
public class Product implements Serializable {

	private ShopCar shopCar;

	/**
	 * 商品id
	 */
	@Id
	@Column(name = "product_id")
	private Integer productId;

	/**
	 * 商品名称
	 */
	@Column(name = "product_name")
	private String productName;

	/**
	 * 商品价格
	 */
	@Column(name = "product_price")
	private Float productPrice;

	/**
	 * 商品色号
	 */
	@Column(name = "product_color")
	private String productColor;

	/**
	 * 商品容量
	 */
	@Column(name = "product_capicity")
	private String productCapicity;

	/**
	 * 商品品牌
	 */
	@Column(name = "product_brand")
	private String productBrand;

	/**
	 * 商品分类
	 */
	@Column(name = "product_type")
	private String productType;

	/**
	 * 商品时间
	 */
	@Column(name = "product_time")
	private String productTime;

	/**
	 * 商品销量
	 */
	@Column(name = "product_sale")
	private Integer productSale;

	/**
	 * 商品图片
	 */
	@Column(name = "product_picurl")
	private String productPicUrl;

	@Column(name = "isChecked")
	private Integer ischecked;

	/**
	 * 商品描述
	 */
	@Column(name = "product_describe")
	private String productDescribe;

	private static final long serialVersionUID = 1L;

	public ShopCar getShopCar() {
		return shopCar;
	}

	public void setShopCar(ShopCar shopCar) {
		this.shopCar = shopCar;
	}

	/**
	 * 获取商品id
	 *
	 * @return product_id - 商品id
	 */
	public Integer getProductId() {
		return productId;
	}

	/**
	 * 设置商品id
	 *
	 * @param productId
	 *            商品id
	 */
	public void setProductId(Integer productId) {
		this.productId = productId;
	}

	/**
	 * 获取商品名称
	 *
	 * @return product_name - 商品名称
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * 设置商品名称
	 *
	 * @param productName
	 *            商品名称
	 */
	public void setProductName(String productName) {
		this.productName = productName == null ? null : productName.trim();
	}

	/**
	 * 获取商品价格
	 *
	 * @return product_price - 商品价格
	 */
	public Float getProductPrice() {
		return productPrice;
	}

	/**
	 * 设置商品价格
	 *
	 * @param productPrice
	 *            商品价格
	 */
	public void setProductPrice(Float productPrice) {
		this.productPrice = productPrice;
	}

	/**
	 * 获取商品色号
	 *
	 * @return product_color - 商品色号
	 */
	public String getProductColor() {
		return productColor;
	}

	/**
	 * 设置商品色号
	 *
	 * @param productColor
	 *            商品色号
	 */
	public void setProductColor(String productColor) {
		this.productColor = productColor == null ? null : productColor.trim();
	}

	/**
	 * 获取商品容量
	 *
	 * @return product_capicity - 商品容量
	 */
	public String getProductCapicity() {
		return productCapicity;
	}

	/**
	 * 设置商品容量
	 *
	 * @param productCapicity
	 *            商品容量
	 */
	public void setProductCapicity(String productCapicity) {
		this.productCapicity = productCapicity == null ? null : productCapicity.trim();
	}

	/**
	 * 获取商品品牌
	 *
	 * @return product_brand - 商品品牌
	 */
	public String getProductBrand() {
		return productBrand;
	}

	/**
	 * 设置商品品牌
	 *
	 * @param productBrand
	 *            商品品牌
	 */
	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand == null ? null : productBrand.trim();
	}

	/**
	 * 获取商品分类
	 *
	 * @return product_type - 商品分类
	 */
	public String getProductType() {
		return productType;
	}

	/**
	 * 设置商品分类
	 *
	 * @param productType
	 *            商品分类
	 */
	public void setProductType(String productType) {
		this.productType = productType == null ? null : productType.trim();
	}

	/**
	 * 获取商品时间
	 *
	 * @return product_time - 商品时间
	 */
	public String getProductTime() {
		return productTime;
	}

	/**
	 * 设置商品时间
	 *
	 * @param productTime
	 *            商品时间
	 */
	public void setProductTime(String productTime) {
		this.productTime = productTime == null ? null : productTime.trim();
	}

	/**
	 * 获取商品销量
	 *
	 * @return product_sale - 商品销量
	 */
	public Integer getProductSale() {
		return productSale;
	}

	/**
	 * 设置商品销量
	 *
	 * @param productSale
	 *            商品销量
	 */
	public void setProductSale(Integer productSale) {
		this.productSale = productSale;
	}

	public String getProductPicUrl() {
		return productPicUrl;
	}

	public void setProductPicUrl(String productPicUrl) {
		this.productPicUrl = productPicUrl;
	}

	/**
	 * @return isChecked
	 */
	public Integer getIschecked() {
		return ischecked;
	}

	/**
	 * @param ischecked
	 */
	public void setIschecked(Integer ischecked) {
		this.ischecked = ischecked;
	}

	/**
	 * 获取商品描述
	 *
	 * @return product_describe - 商品描述
	 */
	public String getProductDescribe() {
		return productDescribe;
	}

	/**
	 * 设置商品描述
	 *
	 * @param productDescribe
	 *            商品描述
	 */
	public void setProductDescribe(String productDescribe) {
		this.productDescribe = productDescribe == null ? null : productDescribe.trim();
	}
}