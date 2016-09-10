/**
 * 
 */
package com.d2h.service.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Hemant
 *
 */
public class DamagedProduct implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String orderId;
	private String productId;
	private String quantity;
	private String status;
	private String reason;
	private Date damagedDate;
	private String amount;
	private String productName;
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
	 * @return the quantity
	 */
	public String getQuantity() {
		return quantity;
	}
	/**
	 * @param quantity the quantity to set
	 */
	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}
	/**
	 * @return the status
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * @param status the status to set
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * @return the reason
	 */
	public String getReason() {
		return reason;
	}
	/**
	 * @param reason the reason to set
	 */
	public void setReason(String reason) {
		this.reason = reason;
	}
	/**
	 * @return the amount
	 */
	public String getAmount() {
		return amount;
	}
	/**
	 * @param amount the amount to set
	 */
	public void setAmount(String amount) {
		this.amount = amount;
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
	 * @return the damagedDate
	 */
	public Date getDamagedDate() {
		return damagedDate;
	}
	/**
	 * @param damagedDate the damagedDate to set
	 */
	public void setDamagedDate(Date damagedDate) {
		this.damagedDate = damagedDate;
	}

}
