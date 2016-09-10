/**
 * 
 */
package com.d2h.service.domain;

import java.io.Serializable;

/**
 * @author Yostna
 *
 */
public class Order implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -7154866845132587530L;
	private String orderId; // created on the Database
	private String orderDesc;
	private String productDesc;
	private String productId;
	private String orderQty;
	private String productQty;
	private String productPrice;
	private String email;
//	private String employeeId;
	private String orderPlaceDate;
	private String orderDeliveryDate;
	private String orderStatus;
	private String paymentType;
	private String addressId;
	private String mobileNumber;
	/**
	 * @return the orderid
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * @param orderid the orderid to set
	 */
	public void setOrderid(String orderId) {
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
	 * @return the productPrice
	 */
	public String getProductPrice() {
		return productPrice;
	}
	/**
	 * @param productPrice the productPrice to set
	 */
	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}
	/**
	 * @return the employeeId
	 */
	/*public String getEmployeeId() {
		return employeeId;
	}*/
	/**
	 * @param employeeId the employeeId to set
	 */
	/*public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}*/
	/**
	 * @return the orderPlaceDate
	 */
	public String getOrderPlaceDate() {
		return orderPlaceDate;
	}
	/**
	 * @param orderPlaceDate the orderPlaceDate to set
	 */
	public void setOrderPlaceDate(String orderPlaceDate) {
		this.orderPlaceDate = orderPlaceDate;
	}
	/**
	 * @return the orderDeliveryDate
	 */
	public String getOrderDeliveryDate() {
		return orderDeliveryDate;
	}
	/**
	 * @param orderDeliveryDate the orderDeliveryDate to set
	 */
	public void setOrderDeliveryDate(String orderDeliveryDate) {
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
	
	
}
