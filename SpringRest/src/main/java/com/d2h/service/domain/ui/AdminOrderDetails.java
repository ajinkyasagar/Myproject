/**
 * 
 */
package com.d2h.service.domain.ui;

import java.util.Date;

/**
 * @author Hemant
 *
 */
public class AdminOrderDetails {
	private String producString;
	private String addressString;
	private String customerString;
	private String mobileNumber;
	private String status;
	private Date orderPlaceDate;
	private Date orderDeliveryDate;
	private String orderId;
	private String total;

	/**
	 * @return the producString
	 */
	public String getProducString() {
		return producString;
	}

	/**
	 * @param producString
	 *            the producString to set
	 */
	public void setProducString(String producString) {
		this.producString = producString;
	}

	/**
	 * @return the addressString
	 */
	public String getAddressString() {
		return addressString;
	}

	/**
	 * @param addressString
	 *            the addressString to set
	 */
	public void setAddressString(String addressString) {
		this.addressString = addressString;
	}

	/**
	 * @return the customerString
	 */
	public String getCustomerString() {
		return customerString;
	}

	/**
	 * @param customerString
	 *            the customerString to set
	 */
	public void setCustomerString(String customerString) {
		this.customerString = customerString;
	}

	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}

	/**
	 * @param mobileNumber
	 *            the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}

	/**
	 * @param status
	 *            the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}

	/**
	 * @return the orderPlaceDate
	 */
	public Date getOrderPlaceDate() {
		return orderPlaceDate;
	}

	/**
	 * @param orderPlaceDate
	 *            the orderPlaceDate to set
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
	 * @param orderDeliveryDate
	 *            the orderDeliveryDate to set
	 */
	public void setOrderDeliveryDate(Date orderDeliveryDate) {
		this.orderDeliveryDate = orderDeliveryDate;
	}

	/**
	 * @return the orderId
	 */
	public String getOrderId() {
		return orderId;
	}

	/**
	 * @param orderId
	 *            the orderId to set
	 */
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	/**
	 * @return the total
	 */
	public String getTotal() {
		return total;
	}

	/**
	 * @param total
	 *            the total to set
	 */
	public void setTotal(String total) {
		this.total = total;
	}

}
