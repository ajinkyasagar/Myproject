/**
 * 
 */
package com.d2h.service.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


/**
 * @author Yostna
 *
 */
public class CustOrder implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 8836261853407087243L;
	/**
	 * 
	 */
	private String orderId; // created on the Database
	private String orderDesc;
	private String totalSalePrice;
	private String orderQty;
	private String email;
	private String orderPlaceDate;
	private Date orderDeliveryDate;
	private String orderStatus;
	private String paymentType;
	private Address address;
	private List<Product> productList;
	private Customer customer;
	private Status status;
	private String couponDiscount;
	private String  paymentStatus;
	private String couponCode;
	private String venderId;
	
	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}
	/**
	 * @return the address
	 */
	public Address getAddress() {
		return address;
	}
	/**
	 * @param address the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
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
	 * @return the productList
	 */
	public List<Product> getProductList() {
		return productList;
	}
	/**
	 * @param productList the productList to set
	 */
	public void setProductList(List<Product> productList) {
		this.productList = productList;
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
	 * @return the customer
	 */
	public Customer getCustomer() {
		return customer;
	}
	/**
	 * @param customer the customer to set
	 */
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	/**
	 * @return the totalSalePrice
	 */
	public String getTotalSalePrice() {
		return totalSalePrice;
	}
	/**
	 * @param totalSalePrice the totalSalePrice to set
	 */
	public void setTotalSalePrice(String totalSalePrice) {
		this.totalSalePrice = totalSalePrice;
	}
	/**
	 * @return the status
	 */
	public Status getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(Status status) {
		this.status = status;
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
	 * @return the paymentStatus
	 */
	public String getPaymentStatus() {
		return paymentStatus;
	}
	/**
	 * @param paymentStatus the paymentStatus to set
	 */
	public void setPaymentStatus(String paymentStatus) {
		this.paymentStatus = paymentStatus;
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
