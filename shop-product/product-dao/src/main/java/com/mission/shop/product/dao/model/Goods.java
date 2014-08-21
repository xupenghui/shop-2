package com.mission.shop.product.dao.model;

import java.io.Serializable;
import java.util.Date;

public class Goods implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.goods_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Long goodsId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.product_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Long productId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.goods_sn
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Integer goodsSn;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.spec
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private String spec;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.stock
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Integer stock;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.sales
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Integer sales;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.price
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Integer price;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.display_price
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Integer displayPrice;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.create_time
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.update_time
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.version
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Integer version;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.product_pic_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Long productPicId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column goods.status
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Short status;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table goods
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.goods_id
	 * @return  the value of goods.goods_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Long getGoodsId() {
		return goodsId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.goods_id
	 * @param goodsId  the value for goods.goods_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.product_id
	 * @return  the value of goods.product_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.product_id
	 * @param productId  the value for goods.product_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.goods_sn
	 * @return  the value of goods.goods_sn
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Integer getGoodsSn() {
		return goodsSn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.goods_sn
	 * @param goodsSn  the value for goods.goods_sn
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setGoodsSn(Integer goodsSn) {
		this.goodsSn = goodsSn;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.spec
	 * @return  the value of goods.spec
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public String getSpec() {
		return spec;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.spec
	 * @param spec  the value for goods.spec
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setSpec(String spec) {
		this.spec = spec == null ? null : spec.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.stock
	 * @return  the value of goods.stock
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Integer getStock() {
		return stock;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.stock
	 * @param stock  the value for goods.stock
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setStock(Integer stock) {
		this.stock = stock;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.sales
	 * @return  the value of goods.sales
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Integer getSales() {
		return sales;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.sales
	 * @param sales  the value for goods.sales
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setSales(Integer sales) {
		this.sales = sales;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.price
	 * @return  the value of goods.price
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Integer getPrice() {
		return price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.price
	 * @param price  the value for goods.price
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setPrice(Integer price) {
		this.price = price;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.display_price
	 * @return  the value of goods.display_price
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Integer getDisplayPrice() {
		return displayPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.display_price
	 * @param displayPrice  the value for goods.display_price
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setDisplayPrice(Integer displayPrice) {
		this.displayPrice = displayPrice;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.create_time
	 * @return  the value of goods.create_time
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.create_time
	 * @param createTime  the value for goods.create_time
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.update_time
	 * @return  the value of goods.update_time
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.update_time
	 * @param updateTime  the value for goods.update_time
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.version
	 * @return  the value of goods.version
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Integer getVersion() {
		return version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.version
	 * @param version  the value for goods.version
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setVersion(Integer version) {
		this.version = version;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.product_pic_id
	 * @return  the value of goods.product_pic_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Long getProductPicId() {
		return productPicId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.product_pic_id
	 * @param productPicId  the value for goods.product_pic_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setProductPicId(Long productPicId) {
		this.productPicId = productPicId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column goods.status
	 * @return  the value of goods.status
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Short getStatus() {
		return status;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column goods.status
	 * @param status  the value for goods.status
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setStatus(Short status) {
		this.status = status;
	}
}