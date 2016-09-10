package com.d2h.service.domain.ui;

import java.io.Serializable;

/**
 * 
 * @author Hemanta
 */
public class CouponDetails implements Serializable {

	private static final long serialVersionUID = 1L;

	private String maxDiscountAmount;
	private String erroMessage;
	private String statusMessage;
	private String refCouponCode;


	/**
	 * @return the maxDiscountAmount
	 */
	public String getMaxDiscountAmount() {
		return maxDiscountAmount;
	}

	/**
	 * @param maxDiscountAmount the maxDiscountAmount to set
	 */
	public void setMaxDiscountAmount(String maxDiscountAmount) {
		this.maxDiscountAmount = maxDiscountAmount;
	}

	/**
	 * @return the erroMessage
	 */
	public String getErroMessage() {
		return erroMessage;
	}

	/**
	 * @param erroMessage the erroMessage to set
	 */
	public void setErroMessage(String erroMessage) {
		this.erroMessage = erroMessage;
	}

	/**
	 * @return the statusMessage
	 */
	public String getStatusMessage() {
		return statusMessage;
	}

	/**
	 * @param statusMessage the statusMessage to set
	 */
	public void setStatusMessage(String statusMessage) {
		this.statusMessage = statusMessage;
	}

	/**
	 * @return the refCouponCode
	 */
	public String getRefCouponCode() {
		return refCouponCode;
	}

	/**
	 * @param refCouponCode the refCouponCode to set
	 */
	public void setRefCouponCode(String refCouponCode) {
		this.refCouponCode = refCouponCode;
	}
	
	

}
