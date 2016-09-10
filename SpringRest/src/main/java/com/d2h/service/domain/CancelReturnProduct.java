/**
 * 
 */
package com.d2h.service.domain;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * @author Hemanta
 *
 */
public class CancelReturnProduct implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String orderId;
	private List<Product> productList;
	private Date cancelReturnDate;
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
	 * @return the cancelReturnDate
	 */
	public Date getCancelReturnDate() {
		return cancelReturnDate;
	}
	/**
	 * @param cancelReturnDate the cancelReturnDate to set
	 */
	public void setCancelReturnDate(Date cancelReturnDate) {
		this.cancelReturnDate = cancelReturnDate;
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
	
	
	
	
}
