package com.d2h.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.d2h.service.domain.Seller;
import com.d2h.service.util.SellerService;

/**
 * CustomerController class will expose a series of RESTful end points
 */
@Controller
public class BecomeSellerController {

	@Autowired
	private SellerService sellerService;
	
	
	@RequestMapping(value = "/sellerSignUp", method = RequestMethod.POST)
	public  @ResponseBody int insertSeller(@RequestBody Seller seller) {
		return sellerService.insertSeller(seller);
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
	public void setStudentService(SellerService sellerService_p) {
		sellerService = sellerService_p;
	}
}
