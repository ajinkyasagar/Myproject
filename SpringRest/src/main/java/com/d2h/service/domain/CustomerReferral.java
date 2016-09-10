/**
 * 
 */
package com.d2h.service.domain;

import java.io.Serializable;

/**
 * @author Hemanta
 *
 */
public class CustomerReferral implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mobileNumber;
	private String couponStartDate;
	private String referralCode;
	private String expiryDate;
	private String validFlag;
	private String referralAmount;
	/**
	 * @return the mobileNumber
	 */
	public String getMobileNumber() {
		return mobileNumber;
	}
	/**
	 * @param mobileNumber the mobileNumber to set
	 */
	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}
	/**
	 * @return the couponStartDate
	 */
	public String getCouponStartDate() {
		return couponStartDate;
	}
	/**
	 * @param couponStartDate the couponStartDate to set
	 */
	public void setCouponStartDate(String couponStartDate) {
		this.couponStartDate = couponStartDate;
	}
	/**
	 * @return the referralCode
	 */
	public String getReferralCode() {
		return referralCode;
	}
	/**
	 * @param referralCode the referralCode to set
	 */
	public void setReferralCode(String referralCode) {
		this.referralCode = referralCode;
	}
	/**
	 * @return the expiryDate
	 */
	public String getExpiryDate() {
		return expiryDate;
	}
	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	/**
	 * @return the validFlag
	 */
	public String getValidFlag() {
		return validFlag;
	}
	/**
	 * @param validFlag the validFlag to set
	 */
	public void setValidFlag(String validFlag) {
		this.validFlag = validFlag;
	}
	/**
	 * @return the referralAmount
	 */
	public String getReferralAmount() {
		return referralAmount;
	}
	/**
	 * @param referralAmount the referralAmount to set
	 */
	public void setReferralAmount(String referralAmount) {
		this.referralAmount = referralAmount;
	}
}
