/**
 * 
 */
package com.d2h.service.domain.ui;

import java.io.Serializable;
import java.util.List;

import com.d2h.service.domain.Address;
import com.d2h.service.domain.Customer;
import com.d2h.service.domain.Product;
import com.d2h.service.domain.Status;

/**
 * @author Yostna
 *
 */
public class CustOrderDetail implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8836261853407087243L;
	/**
	 * "totalSalePrice": null "orderId": "Ord-1833220069" "orderQty": "2"
	 * "orderDesc": "Best Quality Grocery Order" "orderStatus": "In Progress"
	 * "orderPlaceDate": "09-12-2015 10:20:52" "orderDeliveryDate": null
	 * "paymentType": "Cash" "couponDiscount": null
	 */
	private String orderId; // created on the Database
	private String orderDesc;
	private String totalSalePrice;
	private String orderQty;
	private String orderPlaceDate;
	private String orderDeliveryDate;
	private String orderStatus;
	private String paymentType;
	private Address address;
	private List<Product> productList;
	private Customer customer;
	private Status status;
	private String couponDiscount;
	private String referralNumber;

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
	 * @param address
	 *            the address to set
	 */
	public void setAddress(Address address) {
		this.address = address;
	}

	/**
	 * @param orderId
	 *            the orderId to set
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
	 * @param orderDesc
	 *            the orderDesc to set
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
	 * @param productList
	 *            the productList to set
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
	 * @param orderQty
	 *            the orderQty to set
	 */
	public void setOrderQty(String orderQty) {
		this.orderQty = orderQty;
	}

	/**
	 * @return the orderPlaceDate
	 */
	public String getOrderPlaceDate() {
		return orderPlaceDate;
	}

	/**
	 * @param orderPlaceDate
	 *            the orderPlaceDate to set
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
	 * @param orderDeliveryDate
	 *            the orderDeliveryDate to set
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
	 * @param orderStatus
	 *            the orderStatus to set
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
	 * @param paymentType
	 *            the paymentType to set
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
	 * @param customer
	 *            the customer to set
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
	 * @param totalSalePrice
	 *            the totalSalePrice to set
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
	 * @param status
	 *            the status to set
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
	 * @param couponDiscount
	 *            the couponDiscount to set
	 */
	public void setCouponDiscount(String couponDiscount) {
		this.couponDiscount = couponDiscount;
	}

	/**
	 * @return the referralNumber
	 */
	public String getReferralNumber() {
		return referralNumber;
	}

	/**
	 * @param referralNumber the referralNumber to set
	 */
	public void setReferralNumber(String referralNumber) {
		this.referralNumber = referralNumber;
	}
	
}
