package com.mission.shop.product.dao.model;

import java.io.Serializable;
import java.util.Date;

public class ProductDetail implements Serializable {

	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_detail.detail_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Long detailId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_detail.product_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Long productId;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_detail.description
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private String description;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_detail.create_time
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Date createTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database column product_detail.update_time
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private Date updateTime;
	/**
	 * This field was generated by MyBatis Generator. This field corresponds to the database table product_detail
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_detail.detail_id
	 * @return  the value of product_detail.detail_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Long getDetailId() {
		return detailId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_detail.detail_id
	 * @param detailId  the value for product_detail.detail_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setDetailId(Long detailId) {
		this.detailId = detailId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_detail.product_id
	 * @return  the value of product_detail.product_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Long getProductId() {
		return productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_detail.product_id
	 * @param productId  the value for product_detail.product_id
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setProductId(Long productId) {
		this.productId = productId;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_detail.description
	 * @return  the value of product_detail.description
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_detail.description
	 * @param description  the value for product_detail.description
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setDescription(String description) {
		this.description = description == null ? null : description.trim();
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_detail.create_time
	 * @return  the value of product_detail.create_time
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Date getCreateTime() {
		return createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_detail.create_time
	 * @param createTime  the value for product_detail.create_time
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method returns the value of the database column product_detail.update_time
	 * @return  the value of product_detail.update_time
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public Date getUpdateTime() {
		return updateTime;
	}

	/**
	 * This method was generated by MyBatis Generator. This method sets the value of the database column product_detail.update_time
	 * @param updateTime  the value for product_detail.update_time
	 * @mbggenerated  Wed Aug 20 14:11:54 CST 2014
	 */
	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}
}