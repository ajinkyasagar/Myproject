/**
 * 
 */
package com.d2h.service.domain;

import java.io.Serializable;

/**
 * @author Hemant
 *
 */
public class ProductCategory implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String idproductcategory;
	private String productDescription;
	private String productDiscount;
	private String productUrl;
	private  String categoryName;
	/**
	 * @return the idproductcategory
	 */
	public String getIdproductcategory() {
		return idproductcategory;
	}
	/**
	 * @param idproductcategory the idproductcategory to set
	 */
	public void setIdproductcategory(String idproductcategory) {
		this.idproductcategory = idproductcategory;
	}
	/**
	 * @return the productDescription
	 */
	public String getProductDescription() {
		return productDescription;
	}
	/**
	 * @param productDescription the productDescription to set
	 */
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	/**
	 * @return the productDiscount
	 */
	public String getProductDiscount() {
		return productDiscount;
	}
	/**
	 * @param productDiscount the productDiscount to set
	 */
	public void setProductDiscount(String productDiscount) {
		this.productDiscount = productDiscount;
	}
	/**
	 * @return the productUrl
	 */
	public String getProductUrl() {
		return productUrl;
	}
	/**
	 * @param productUrl the productUrl to set
	 */
	public void setProductUrl(String productUrl) {
		this.productUrl = productUrl;
	}
	/**
	 * @return the categoryName
	 */
	public String getCategoryName() {
		return categoryName;
	}
	/**
	 * @param categoryName the categoryName to set
	 */
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	
	

}
