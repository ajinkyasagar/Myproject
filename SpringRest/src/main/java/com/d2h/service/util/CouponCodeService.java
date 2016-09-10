/**
 * 
 */
package com.d2h.service.util;

import com.d2h.service.domain.Coupons;
import com.d2h.service.domain.ui.CouponDetails;


/**
 * @author Hemanta
 *
 */
public interface CouponCodeService {
	
	public CouponDetails validateCoupanCode(Coupons  coupanCode);

}
