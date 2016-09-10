package com.d2h.service.domain;

import java.io.Serializable;

/**
 * 
 * @author Hemanta
 */
public class BarCode implements Serializable {

	private static final long serialVersionUID = 1L;
		
	private String productId;
	private String barcodeId;
	private String description;
	private String entryDate;
	private String saleDate;
	private String status;
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
	 * @return the barcodeId
	 */
	public String getBarcodeId() {
		return barcodeId;
	}
	/**
	 * @param barcodeId the barcodeId to set
	 */
	public void setBarcodeId(String barcodeId) {
		this.barcodeId = barcodeId;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	/**
	 * @return the entryDate
	 */
	public String getEntryDate() {
		return entryDate;
	}
	/**
	 * @param entryDate the entryDate to set
	 */
	public void setEntryDate(String entryDate) {
		this.entryDate = entryDate;
	}
	/**
	 * @return the saleDate
	 */
	public String getSaleDate() {
		return saleDate;
	}
	/**
	 * @param saleDate the saleDate to set
	 */
	public void setSaleDate(String saleDate) {
		this.saleDate = saleDate;
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

}
