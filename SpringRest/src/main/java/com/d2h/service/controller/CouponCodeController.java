package com.d2h.service.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.d2h.service.domain.Coupons;
import com.d2h.service.domain.ui.CouponDetails;
import com.d2h.service.util.CouponCodeService;

/**
 * StudentController class will expose a series of RESTful end points
 */
@Controller
public class CouponCodeController {

	@Autowired
	private CouponCodeService coupanCodeService;

	private static final Logger log = Logger.getLogger(CouponCodeController.class);
	
	
	@RequestMapping(value = "/validateCoupan", method = RequestMethod.POST)
	public @ResponseBody CouponDetails validateCoupanCode( @RequestBody Coupons coupanCode) {
		return coupanCodeService.validateCoupanCode(coupanCode);
	}
	
	/**
	 * Create an error REST response.
	 * @param sMessage
	 * @return
	 */
	/**
	 * Injector methods.
	 *
	 * @param studentService_p
	 *            the new student service
	 */
	public void setStudentService(CouponCodeService coupanCodeService) {
		this.coupanCodeService = coupanCodeService;
	}
	/*public static void main(String[] args) {
		CouponCodeController cc = new CouponCodeController();
		Coupons cp = new Coupons();
		cp.setShoppingAmount("1000");
		cp.setCouponCode("12345678");
		cc.validateCoupanCode(cp);
	}*/
}
