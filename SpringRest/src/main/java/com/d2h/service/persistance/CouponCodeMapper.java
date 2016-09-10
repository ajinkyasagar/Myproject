/**
 * 
 */
package com.d2h.service.persistance;

import com.d2h.service.domain.Coupons;


/**
 * @author Yostna
 *
 */
public interface CouponCodeMapper {
	
	/**
	 * @return all the Address
	 */
	public Coupons validateCoupanCode(Coupons couponCode);

}
