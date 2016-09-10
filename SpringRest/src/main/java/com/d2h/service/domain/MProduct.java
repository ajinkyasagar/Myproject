/**
 * 
 */
package com.d2h.service.domain;

/**
 * @author Hemanta
 *
 */

public class MProduct {

	private String productId; 
	private String productCatagory; 
	private String ProductSubCatagory; 
	private String productName;
	private String salePrice;
	private String imageUrl;
	private String discount;
	private String description;
	private String longDescription;
	private String MRP;
	private String unit;
	private String orderQty;

	/**
	 * @return the productId
	 */
	public String getProductId() {
		return productId;
	}

	/**
	 * @param productId
	 *            the productId to set
	 */
	public void setProductId(String productId) {
		this.productId = productId;
	}

	/**
	 * @return the productCatagory
	 */
	public String getProductCatagory() {
		return productCatagory;
	}

	/**
	 * @param productCatagory
	 *            the productCatagory to set
	 */
	public void setProductCatagory(String productCatagory) {
		this.productCatagory = productCatagory;
	}

	/**
	 * @return the productSubCatagory
	 */
	public String getProductSubCatagory() {
		return ProductSubCatagory;
	}

	/**
	 * @param productSubCatagory
	 *            the productSubCatagory to set
	 */
	public void setProductSubCatagory(String productSubCatagory) {
		ProductSubCatagory = productSubCatagory;
	}

	/**
	 * @return the productName
	 */
	public String getProductName() {
		return productName;
	}

	/**
	 * @param productName
	 *            the productName to set
	 */
	public void setProductName(String productName) {
		this.productName = productName;
	}

	/**
	 * @return the salePrice
	 */
	public String getSalePrice() {
		return salePrice;
	}

	/**
	 * @param salePrice
	 *            the salePrice to set
	 */
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
	}


	/**
	 * @return the imageUrl
	 */
	public String getImageUrl() {
		return imageUrl;
	}

	/**
	 * @param imageUrl
	 *            the imageUrl to set
	 */
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description
	 *            the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @return the discount
	 */
	public String getDiscount() {
		return discount;
	}

	/**
	 * @param discount the discount to set
	 */
	public void setDiscount(String discount) {
		this.discount = discount;
	}

	/**
	 * @return the longDescription
	 */
	public String getLongDescription() {
		return longDescription;
	}

	/**
	 * @param longDescription the longDescription to set
	 */
	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	/**
	 * @return the mRP
	 */
	public String getMRP() {
		return MRP;
	}

	/**
	 * @param mRP the mRP to set
	 */
	public void setMRP(String mRP) {
		MRP = mRP;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
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
}
