/**
 * 
 */
package com.d2h.service.domain.ui;

import java.io.Serializable;

/**
 * @author Hemanta
 *
 */

public class ProductDetail implements Serializable{

	private static final long serialVersionUID = 4456711181853662080L;
	private String productId; 
	private String productName;
	private String salePrice;
	private String description;
	private String productCatagory;
	private String MRP;
	private String brand;
	private String numberOfItemsIncart = "0";
	private String  totalPriceInCart = "0";
	
	private String isOnSale;
	private String isNew;
	private String discount;
	
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
	 * @return the salePrice
	 */
	public String getSalePrice() {
		return salePrice;
	}
	/**
	 * @param salePrice the salePrice to set
	 */
	public void setSalePrice(String salePrice) {
		this.salePrice = salePrice;
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
	 * @return the productCatagory
	 */
	public String getProductCatagory() {
		return productCatagory;
	}
	/**
	 * @param productCatagory the productCatagory to set
	 */
	public void setProductCatagory(String productCatagory) {
		this.productCatagory = productCatagory;
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
	 * @return the brand
	 */
	public String getBrand() {
		return brand;
	}
	/**
	 * @param brand the brand to set
	 */
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	/**
	 * @return the numberOfItemsIncart
	 */
	public String getNumberOfItemsIncart() {
		return numberOfItemsIncart;
	}
	/**
	 * @param numberOfItemsIncart the numberOfItemsIncart to set
	 */
	public void setNumberOfItemsIncart(String numberOfItemsIncart) {
		this.numberOfItemsIncart = numberOfItemsIncart;
	}
	/**
	 * @return the totalPriceInCart
	 */
	public String getTotalPriceInCart() {
		return totalPriceInCart;
	}
	/**
	 * @param totalPriceInCart the totalPriceInCart to set
	 */
	public void setTotalPriceInCart(String totalPriceInCart) {
		this.totalPriceInCart = totalPriceInCart;
	}
	/**
	 * @return the isOnSale
	 */
	public String getIsOnSale() {
		return isOnSale;
	}
	/**
	 * @param isOnSale the isOnSale to set
	 */
	public void setIsOnSale(String isOnSale) {
		this.isOnSale = isOnSale;
	}
	/**
	 * @return the isNew
	 */
	public String getIsNew() {
		return isNew;
	}
	/**
	 * @param isNew the isNew to set
	 */
	public void setIsNew(String isNew) {
		this.isNew = isNew;
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
	
}
