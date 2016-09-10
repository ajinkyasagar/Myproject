package com.d2h.service.domain;

import java.io.Serializable;

/**
 * 
 * @author Hemanta
 */
public class Customer implements Serializable {

	private static final long serialVersionUID = 1L;
		
	private String firstName;
	private String lastName;
	private String email; //reference to address table
	private String mobileNumber;
	private String password;
	private String customerLoginCreatedDate;
	private boolean isValid;
	private String errorMessage;
	private String otp;
	private String promoCode;
	private String customerReferralNumber;
	private String goWallet;


	
//	private Address address;
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the customerLoginCreatedDate
	 */
	public String getCustomerLoginCreatedDate() {
		return customerLoginCreatedDate;
	}
	/**
	 * @param customerLoginCreatedDate the customerLoginCreatedDate to set
	 */
	public void setCustomerLoginCreatedDate(String customerLoginCreatedDate) {
		this.customerLoginCreatedDate = customerLoginCreatedDate;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
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
	 * @return the isValid
	 */
	public boolean isValid() {
		return isValid;
	}
	/**
	 * @param isValid the isValid to set
	 */
	public void setValid(boolean isValid) {
		this.isValid = isValid;
	}
	/**
	 * @return the errorMessage
	 */
	public String getErrorMessage() {
		return errorMessage;
	}
	/**
	 * @param errorMessage the errorMessage to set
	 */
	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}
	/**
	 * @return the otp
	 */
	public String getOtp() {
		return otp;
	}
	/**
	 * @param otp the otp to set
	 */
	public void setOtp(String otp) {
		this.otp = otp;
	}
	/**
	 * @return the promoCode
	 */
	public String getPromoCode() {
		return promoCode;
	}
	/**
	 * @param promoCode the promoCode to set
	 */
	public void setPromoCode(String promoCode) {
		this.promoCode = promoCode;
	}
	/**
	 * @return the customerReferralNumber
	 */
	public String getCustomerReferralNumber() {
		return customerReferralNumber;
	}
	/**
	 * @param customerReferralNumber the customerReferralNumber to set
	 */
	public void setCustomerReferralNumber(String customerReferralNumber) {
		this.customerReferralNumber = customerReferralNumber;
	}
	/**
	 * @return the goWallet
	 */
	public String getGoWallet() {
		return goWallet;
	}
	/**
	 * @param goWallet the goWallet to set
	 */
	public void setGoWallet(String goWallet) {
		this.goWallet = goWallet;
	}
	
	
	
}
