/**
 * 
 */
package com.d2h.service.domain;

import java.io.Serializable;
import java.util.Date;


/**
 * @author Yostna
 *
 */
public class CustomerOrder implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private String orderId; // created on the Database
	private String orderDesc;
	private String productDesc;
	private String productId;
	private String orderQty;
	private String productQty;
	private String totalSellPrice;
	private String totalBuyPrice;
//	private String productUnitSalePrice;
	private String productUnitBuyPrice;
	private String email;
	private Date orderPlaceDate;
	private Date orderDeliveryDate;
	private String orderStatus;
	private String paymentType;
	private String addressId;
	private String mobileNumber;
	private String profitLossPrice;
	private String productUnitSellPrice;
	private String productName;
	private String barCodeId;
	private String couponDiscount;
	private String couponCode;
	private String venderId;
	/*orderId, 
	orderDesc, 
	productDesc, 
	productId, 
	productQty, 
	orderQty, 
	productUnitBuyPrice, email, orderPlaceDate, orderDeliveryDate, orderStatus, paymentType, addressId, mobileNumber, productUnitSellPrice, totalBuyPrice, totalSellPrice, 
	profitLossPrice*/
	
	
	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * @param orderId the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	/**
	 * @return the orderDesc
	 */
	public String getOrderDesc() {
		return orderDesc;
	}
	/**
	 * @param orderDesc the orderDesc to set
	 */
	public void setOrderDesc(String orderDesc) {
		this.orderDesc = orderDesc;
	}
	/**
	 * @return the productDesc
	 */
	public String getProductDesc() {
		return productDesc;
	}
	/**
	 * @param productDesc the productDesc to set
	 */
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}
	/**
	 * @param productId the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}
	/**
	 * @return the orderQty
	 */
	public String getOrderQty() {
		return orderQty;
	}
	/**
	 * @param orderQty the orderQty to set
	 */
	public void setOrderQty(String orderQty) {
		this.orderQty = orderQty;
	}
	/**
	 * @return the productQty
	 */
	public String getProductQty() {
		return productQty;
	}
	/**
	 * @param productQty the productQty to set
	 */
	public void setProductQty(String productQty) {
		this.productQty = productQty;
	}
	/**
	 * @return the orderPlaceDate
	 */
	public Date getOrderPlaceDate() {
		return orderPlaceDate;
	}
	/**
	 * @param orderPlaceDate the orderPlaceDate to set
	 */
	public void setOrderPlaceDate(Date orderPlaceDate) {
		this.orderPlaceDate = orderPlaceDate;
	}
	/**
	 * @return the orderDeliveryDate
	 */
	public Date getOrderDeliveryDate() {
		return orderDeliveryDate;
	}
	/**
	 * @param orderDeliveryDate the orderDeliveryDate to set
	 */
	public void setOrderDeliveryDate(Date orderDeliveryDate) {
		this.orderDeliveryDate = orderDeliveryDate;
	}
	/**
	 * @return the orderStatus
	 */
	public String getOrderStatus() {
		return orderStatus;
	}
	/**
	 * @param orderStatus the orderStatus to set
	 */
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	/**
	 * @return the paymentType
	 */
	public String getPaymentType() {
		return paymentType;
	}
	/**
	 * @param paymentType the paymentType to set
	 */
	public void setPaymentType(String paymentType) {
		this.paymentType = paymentType;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the addressId
	 */
	public String getAddressId() {
		return addressId;
	}
	/**
	 * @param addressId the addressId to set
	 */
	public void setAddressId(String addressId) {
		this.addressId = addressId;
	}
	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the totalSellPrice
	 */
	public String getTotalSellPrice() {
		return totalSellPrice;
	}
	/**
	 * @param totalSellPrice the totalSellPrice to set
	 */
	public void setTotalSellPrice(String totalSellPrice) {
		this.totalSellPrice = totalSellPrice;
	}
	/**
	 * @return the totalBuyPrice
	 */
	public String getTotalBuyPrice() {
		return totalBuyPrice;
	}
	/**
	 * @param totalBuyPrice the totalBuyPrice to set
	 */
	public void setTotalBuyPrice(String totalBuyPrice) {
		this.totalBuyPrice = totalBuyPrice;
	}
	/**
	 * @return the productUnitBuyPrice
	 */
	public String getProductUnitBuyPrice() {
		return productUnitBuyPrice;
	}
	/**
	 * @param productUnitBuyPrice the productUnitBuyPrice to set
	 */
	public void setProductUnitBuyPrice(String productUnitBuyPrice) {
		this.productUnitBuyPrice = productUnitBuyPrice;
	}
	/**
	 * @return the profitLossPrice
	 */
	public String getProfitLossPrice() {
		return profitLossPrice;
	}
	/**
	 * @param profitLossPrice the profitLossPrice to set
	 */
	public void setProfitLossPrice(String profitLossPrice) {
		this.profitLossPrice = profitLossPrice;
	}
	/**
	 * @return the productUnitSellPrice
	 */
	public String getProductUnitSellPrice() {
		return productUnitSellPrice;
	}
	/**
	 * @param productUnitSellPrice the productUnitSellPrice to set
	 */
	public void setProductUnitSellPrice(String productUnitSellPrice) {
		this.productUnitSellPrice = productUnitSellPrice;
	}
	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}
	/**
	 * @param productName the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}
	/**
	 * @return the barCodeId
	 */
	public String getBarCodeId() {
		return barCodeId;
	}
	/**
	 * @param barCodeId the barCodeId to set
	 */
	public void setBarCodeId(String barCodeId) {
		this.barCodeId = barCodeId;
	}
	/**
	 * @return the couponDiscount
	 */
	public String getCouponDiscount() {
		return couponDiscount;
	}
	/**
	 * @param couponDiscount the couponDiscount to set
	 */
	public void setCouponDiscount(String couponDiscount) {
		this.couponDiscount = couponDiscount;
	}
	/**
	 * @return the couponCode
	 */
	public String getCouponCode() {
		return couponCode;
	}
	/**
	 * @param couponCode the couponCode to set
	 */
	public void setCouponCode(String couponCode) {
		this.couponCode = couponCode;
	}
	/**
	 * @return the venderId
	 */
	public String getVenderId() {
		return venderId;
	}
	/**
	 * @param venderId the venderId to set
	 */
	public void setVenderId(String venderId) {
		this.venderId = venderId;
	}
	
	
	
}
