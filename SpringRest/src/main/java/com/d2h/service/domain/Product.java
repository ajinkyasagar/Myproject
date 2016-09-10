/**
 * 
 */
package com.d2h.service.domain;

import java.io.Serializable;

/**
 * @author Hemanta
 *
 */

public class Product implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4456711181853662080L;
	private String productId; 
	private String productCatagory; 
	private String ProductSubCatagory; 
	private String productName;
	private int avbleQuantity;
	private String salePrice;
	private String buyPrice;
	private String percentage;
	private String productVenderId;
	private String imageUrl;
	private String discount;
	private String isOrganic;
	private String minQuantity;
	private String description;
	private String productEntryDate;
	private String longDescription;
	private String MRP;
	private String productFeature;
	private String unit;
	private String isOnSale;
	private String isValid;
	private String numberOfItemsIncart="0";
	private String totalPriceInCart="0";
	private String orderQty;
	private String orderCancelQty;
	private String barCodeId;
	
	private String brand;
	private String productMoveLocation;
	private String vatPercentage;
	private String MBQ;
	private String reOrderPoint;
	private String rateOfSale;
	private String others;

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
	 * @return the avbleQuantity
	 */
	public int getAvbleQuantity() {
		return avbleQuantity;
	}

	/**
	 * @param avbleQuantity
	 *            the avbleQuantity to set
	 */
	public void setAvbleQuantity(int avbleQuantity) {
		this.avbleQuantity = avbleQuantity;
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
	 * @return the buyPrice
	 */
	public String getBuyPrice() {
		return buyPrice;
	}

	/**
	 * @param buyPrice
	 *            the buyPrice to set
	 */
	public void setBuyPrice(String buyPrice) {
		this.buyPrice = buyPrice;
	}

	/**
	 * @return the percentage
	 */
	public String getPercentage() {
		return percentage;
	}

	/**
	 * @param percentage
	 *            the percentage to set
	 */
	public void setPercentage(String percentage) {
		this.percentage = percentage;
	}

	/**
	 * @return the productVenderId
	 */
	public String getProductVenderId() {
		return productVenderId;
	}

	/**
	 * @param productVenderId
	 *            the productVenderId to set
	 */
	public void setProductVenderId(String productVenderId) {
		this.productVenderId = productVenderId;
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
	 * @return the isOrganic
	 */
	public String getIsOrganic() {
		return isOrganic;
	}

	/**
	 * @param isOrganic
	 *            the isOrganic to set
	 */
	public void setIsOrganic(String isOrganic) {
		this.isOrganic = isOrganic;
	}

	/**
	 * @return the minQuantity
	 */
	public String getMinQuantity() {
		return minQuantity;
	}

	/**
	 * @param minQuantity
	 *            the minQuantity to set
	 */
	public void setMinQuantity(String minQuantity) {
		this.minQuantity = minQuantity;
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
	 * @return the productEntryDate
	 */
	public String getProductEntryDate() {
		return productEntryDate;
	}

	/**
	 * @param productEntryDate
	 *            the productEntryDate to set
	 */
	public void setProductEntryDate(String productEntryDate) {
		this.productEntryDate = productEntryDate;
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
	 * @return the productFeature
	 */
	public String getProductFeature() {
		return productFeature;
	}

	/**
	 * @param productFeature the productFeature to set
	 */
	public void setProductFeature(String productFeature) {
		this.productFeature = productFeature;
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
	 * @return the isValid
	 */
	public String getIsValid() {
		return isValid;
	}

	/**
	 * @param isValid the isValid to set
	 */
	public void setIsValid(String isValid) {
		this.isValid = isValid;
	}



	public String getNumberOfItemsIncart() {
		return numberOfItemsIncart;
	}

	public void setNumberOfItemsIncart(String numberOfItemsIncart) {
		this.numberOfItemsIncart = numberOfItemsIncart;
	}

	/**
	 * @return the totalPriceOnCart
	 */
	public String getTotalPriceInCart() {
		return totalPriceInCart;
	}

	/**
	 * @param totalPriceOnCart the totalPriceOnCart to set
	 */
	public void setTotalPriceInCart(String totalPriceInCart) {
		this.totalPriceInCart = totalPriceInCart;
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
	 * @return the barCodeId
	 */
	public String getBarCodeId() {
		return barCodeId;
	}

	/**
	 * @param barCodeId the barCodeId to set
	 */
	public void setBarCodeId(String barCodeId) {
		this.barCodeId = barCodeId;
	}

	/**
	 * @return the orderCancelQty
	 */
	public String getOrderCancelQty() {
		return orderCancelQty;
	}

	/**
	 * @param orderCancelQty the orderCancelQty to set
	 */
	public void setOrderCancelQty(String orderCancelQty) {
		this.orderCancelQty = orderCancelQty;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getProductMoveLocation() {
		return productMoveLocation;
	}

	public void setProductMoveLocation(String productMoveLocation) {
		this.productMoveLocation = productMoveLocation;
	}

	public String getVatPercentage() {
		return vatPercentage;
	}

	public void setVatPercentage(String vatPercentage) {
		this.vatPercentage = vatPercentage;
	}

	public String getMBQ() {
		return MBQ;
	}

	public void setMBQ(String mBQ) {
		MBQ = mBQ;
	}

	public String getReOrderPoint() {
		return reOrderPoint;
	}

	public void setReOrderPoint(String reOrderPoint) {
		this.reOrderPoint = reOrderPoint;
	}

	public String getRateOfSale() {
		return rateOfSale;
	}

	public void setRateOfSale(String rateOfSale) {
		this.rateOfSale = rateOfSale;
	}

	public String getOthers() {
		return others;
	}

	public void setOthers(String others) {
		this.others = others;
	}
	
	

}
