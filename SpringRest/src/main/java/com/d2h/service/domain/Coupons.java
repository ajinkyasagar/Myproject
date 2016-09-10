package com.d2h.service.domain;

import java.io.Serializable;

/**
 * 
 * @author Hemanta
 */
public class Coupons implements Serializable {

	private static final long serialVersionUID = 1L;

	private String couponId;
	private String couponCode;
	private String coupanDescription;
	private String couponEntryDate;
	private String couponExpireDate;
	private String couponStatus;
	private String couponPercentage;
	private String onSpecificProduct;
	private String couponQuantity;
	private String maxDiscountAmount;
	private String shoppingAmount;
//	private String shopIngThreshHoldAmount;
	private String erroMessage;
	private String minShoppingAmount;
	private String maxShoppingAmount;
	private String couponType;
	private String refPercentage;

	/**
	 * @return the couponId
	 */
	public String getCouponId() {
		return couponId;
	}

	/**
	 * @param couponId
	 *            the couponId to set
	 */
	public void setCouponId(String couponId) {
		this.couponId = couponId;
	}

	/**
	 * @return the couponCode
	 */
	public String getCouponCode() {
		return couponCode;
	}

	/**
	 * @param couponCode
	 *            the couponCode to set
	 */
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}

	/**
	 * @return the coupanDescription
	 */
	public String getCoupanDescription() {
		return coupanDescription;
	}

	/**
	 * @param coupanDescription
	 *            the coupanDescription to set
	 */
	public void setCoupanDescription(String coupanDescription) {
		this.coupanDescription = coupanDescription;
	}

	/**
	 * @return the couponEntryDate
	 */
	public String getCouponEntryDate() {
		return couponEntryDate;
	}

	/**
	 * @param couponEntryDate
	 *            the couponEntryDate to set
	 */
	public void setCouponEntryDate(String couponEntryDate) {
		this.couponEntryDate = couponEntryDate;
	}

	/**
	 * @return the couponExpireDate
	 */
	public String getCouponExpireDate() {
		return couponExpireDate;
	}

	/**
	 * @param couponExpireDate
	 *            the couponExpireDate to set
	 */
	public void setCouponExpireDate(String couponExpireDate) {
		this.couponExpireDate = couponExpireDate;
	}

	/**
	 * @return the couponStatus
	 */
	public String getCouponStatus() {
		return couponStatus;
	}

	/**
	 * @param couponStatus
	 *            the couponStatus to set
	 */
	public void setCouponStatus(String couponStatus) {
		this.couponStatus = couponStatus;
	}

	/**
	 * @return the couponPercentage
	 */
	public String getCouponPercentage() {
		return couponPercentage;
	}

	/**
	 * @param couponPercentage
	 *            the couponPercentage to set
	 */
	public void setCouponPercentage(String couponPercentage) {
		this.couponPercentage = couponPercentage;
	}

	/**
	 * @return the onSpecificProduct
	 */
	public String getOnSpecificProduct() {
		return onSpecificProduct;
	}

	/**
	 * @param onSpecificProduct
	 *            the onSpecificProduct to set
	 */
	public void setOnSpecificProduct(String onSpecificProduct) {
		this.onSpecificProduct = onSpecificProduct;
	}

	/**
	 * @return the maxDiscountAmount
	 */
	public String getMaxDiscountAmount() {
		return maxDiscountAmount;
	}

	/**
	 * @param maxDiscountAmount the maxDiscountAmount to set
	 */
	public void setMaxDiscountAmount(String maxDiscountAmount) {
		this.maxDiscountAmount = maxDiscountAmount;
	}

	/**
	 * @return the shoppingAmount
	 */
	public String getShoppingAmount() {
		return shoppingAmount;
	}

	/**
	 * @param shoppingAmount the shoppingAmount to set
	 */
	public void setShoppingAmount(String shoppingAmount) {
		this.shoppingAmount = shoppingAmount;
	}

	/**
	 * @return the erroMessage
	 */
	public String getErroMessage() {
		return erroMessage;
	}

	/**
	 * @param erroMessage the erroMessage to set
	 */
	public void setErroMessage(String erroMessage) {
		this.erroMessage = erroMessage;
	}

	/**
	 * @return the minShoppingAmount
	 */
	public String getMinShoppingAmount() {
		return minShoppingAmount;
	}

	/**
	 * @param minShoppingAmount the minShoppingAmount to set
	 */
	public void setMinShoppingAmount(String minShoppingAmount) {
		this.minShoppingAmount = minShoppingAmount;
	}

	/**
	 * @return the maxShoppingAmount
	 */
	public String getMaxShoppingAmount() {
		return maxShoppingAmount;
	}

	/**
	 * @param maxShoppingAmount the maxShoppingAmount to set
	 */
	public void setMaxShoppingAmount(String maxShoppingAmount) {
		this.maxShoppingAmount = maxShoppingAmount;
	}

	/**
	 * @return the couponType
	 */
	public String getCouponType() {
		return couponType;
	}

	/**
	 * @param couponType the couponType to set
	 */
	public void setCouponType(String couponType) {
		this.couponType = couponType;
	}

	/**
	 * @return the couponQuantity
	 */
	public String getCouponQuantity() {
		return couponQuantity;
	}

	/**
	 * @param couponQuantity the couponQuantity to set
	 */
	public void setCouponQuantity(String couponQuantity) {
		this.couponQuantity = couponQuantity;
	}

	/**
	 * @return the refPercentage
	 */
	public String getRefPercentage() {
		return refPercentage;
	}

	/**
	 * @param refPercentage the refPercentage to set
	 */
	public void setRefPercentage(String refPercentage) {
		this.refPercentage = refPercentage;
	}

	
	
	
}
