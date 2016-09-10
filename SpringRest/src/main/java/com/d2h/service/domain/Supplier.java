package com.d2h.service.domain;

import java.io.Serializable;

/**
 * 
 * @author Hemanta
 */
public class Supplier implements Serializable {

	private static final long serialVersionUID = 1L;
		
	private String supplierId;
	private String supplierFirstName;
	private String supplierLastName;
	private String productCategory;
	private String productSubCategory;
	private String supplierContactNumber1;
	private String supplierContactNumber2;
	private String addressEmail;
	private String productName;
	private String supplyDate;
	private String supplyQty;
	private String supplierPrice;

	/**
	 * @return the productCategory
	 */
	public String getProductCategory() {
		return productCategory;
	}
	/**
	 * @param productCategory the productCategory to set
	 */
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	/**
	 * @return the productSubCategory
	 */
	public String getProductSubCategory() {
		return productSubCategory;
	}
	/**
	 * @param productSubCategory the productSubCategory to set
	 */
	public void setProductSubCategory(String productSubCategory) {
		this.productSubCategory = productSubCategory;
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
	 * @return the supplierPrice
	 */
	public String getSupplierPrice() {
		return supplierPrice;
	}
	/**
	 * @param supplierPrice the supplierPrice to set
	 */
	public void setSupplierPrice(String supplierPrice) {
		this.supplierPrice = supplierPrice;
	}
	/**
	 * @return the addressEmail
	 */
	public String getAddressEmail() {
		return addressEmail;
	}
	/**
	 * @param addressEmail the addressEmail to set
	 */
	public void setAddressEmail(String addressEmail) {
		this.addressEmail = addressEmail;
	}
	/**
	 * @return the supplierId
	 */
	public String getSupplierId() {
		return supplierId;
	}
	/**
	 * @param supplierId the supplierId to set
	 */
	public void setSupplierId(String supplierId) {
		this.supplierId = supplierId;
	}
	/**
	 * @return the supplierFirstName
	 */
	public String getSupplierFirstName() {
		return supplierFirstName;
	}
	/**
	 * @param supplierFirstName the supplierFirstName to set
	 */
	public void setSupplierFirstName(String supplierFirstName) {
		this.supplierFirstName = supplierFirstName;
	}
	/**
	 * @return the supplierLastName
	 */
	public String getSupplierLastName() {
		return supplierLastName;
	}
	/**
	 * @param supplierLastName the supplierLastName to set
	 */
	public void setsSpplierLastName(String supplierLastName) {
		this.supplierLastName = supplierLastName;
	}
	/**
	 * @return the supplierContactNumber1
	 */
	public String getSupplierContactNumber1() {
		return supplierContactNumber1;
	}
	/**
	 * @param supplierContactNumber1 the supplierContactNumber1 to set
	 */
	public void setSupplierContactNumber1(String supplierContactNumber1) {
		this.supplierContactNumber1 = supplierContactNumber1;
	}
	/**
	 * @return the supplyDate
	 */
	public String getSupplyDate() {
		return supplyDate;
	}
	/**
	 * @param supplyDate the supplyDate to set
	 */
	public void setSupplyDate(String supplyDate) {
		this.supplyDate = supplyDate;
	}
	/**
	 * @return the supplyQty
	 */
	public String getSupplyQty() {
		return supplyQty;
	}
	/**
	 * @param supplyQty the supplyQty to set
	 */
	public void setSupplyQty(String supplyQty) {
		this.supplyQty = supplyQty;
	}
	/**
	 * @return the supplierContactNumber2
	 */
	public String getSupplierContactNumber2() {
		return supplierContactNumber2;
	}
	/**
	 * @param supplierContactNumber2 the supplierContactNumber2 to set
	 */
	public void setSupplierContactNumber2(String supplierContactNumber2) {
		this.supplierContactNumber2 = supplierContactNumber2;
	}
	
	
}