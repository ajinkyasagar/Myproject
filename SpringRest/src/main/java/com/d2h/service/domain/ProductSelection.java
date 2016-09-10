/**
 * 
 */
package com.d2h.service.domain;

import java.io.Serializable;

/**
 * @author Hemant
 *
 */
public class ProductSelection implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String startPrice;
	private String endPrice;
	/**
	 * @return the startPrice
	 */
	public String getStartPrice() {
		return startPrice;
	}
	/**
	 * @param startPrice the startPrice to set
	 */
	public void setStartPrice(String startPrice) {
		this.startPrice = startPrice;
	}
	/**
	 * @return the endPrice
	 */
	public String getEndPrice() {
		return endPrice;
	}
	/**
	 * @param endPrice the endPrice to set
	 */
	public void setEndPrice(String endPrice) {
		this.endPrice = endPrice;
	}
	

}
