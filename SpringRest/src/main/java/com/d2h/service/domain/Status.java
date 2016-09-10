/**
 * 
 */
package com.d2h.service.domain;

/**
 * @author Hemant
 *
 */
public class Status {
	private String orderEntry;
	private String addressEntry;
	private String productUpdateEntry;
	
	private String orderEntryError;
	private String addressEntryError;
	private String productUpdateEntryError;
	/**
	 * @return the orderEntry
	 */
	public String getOrderEntry() {
		return orderEntry;
	}
	/**
	 * @param orderEntry the orderEntry to set
	 */
	public void setOrderEntry(String orderEntry) {
		this.orderEntry = orderEntry;
	}
	/**
	 * @return the addressEntry
	 */
	public String getAddressEntry() {
		return addressEntry;
	}
	/**
	 * @param addressEntry the addressEntry to set
	 */
	public void setAddressEntry(String addressEntry) {
		this.addressEntry = addressEntry;
	}
	/**
	 * @return the productUpdateEntry
	 */
	public String getProductUpdateEntry() {
		return productUpdateEntry;
	}
	/**
	 * @param productUpdateEntry the productUpdateEntry to set
	 */
	public void setProductUpdateEntry(String productUpdateEntry) {
		this.productUpdateEntry = productUpdateEntry;
	}
	/**
	 * @return the orderEntryError
	 */
	public String getOrderEntryError() {
		return orderEntryError;
	}
	/**
	 * @param orderEntryError the orderEntryError to set
	 */
	public void setOrderEntryError(String orderEntryError) {
		this.orderEntryError = orderEntryError;
	}
	/**
	 * @return the addressEntryError
	 */
	public String getAddressEntryError() {
		return addressEntryError;
	}
	/**
	 * @param addressEntryError the addressEntryError to set
	 */
	public void setAddressEntryError(String addressEntryError) {
		this.addressEntryError = addressEntryError;
	}
	/**
	 * @return the productUpdateEntryError
	 */
	public String getProductUpdateEntryError() {
		return productUpdateEntryError;
	}
	/**
	 * @param productUpdateEntryError the productUpdateEntryError to set
	 */
	public void setProductUpdateEntryError(String productUpdateEntryError) {
		this.productUpdateEntryError = productUpdateEntryError;
	}
	
}
