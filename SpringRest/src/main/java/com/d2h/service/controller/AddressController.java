package com.d2h.service.controller;

import java.util.List;
import java.util.UUID;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.d2h.service.constants.ApplicationConstants;
import com.d2h.service.domain.Address;
import com.d2h.service.domain.Customer;
import com.d2h.service.util.AddressrService;
import com.d2h.service.util.CustomerService;

/**
 * StudentController class will expose a series of RESTful end points
 */
@Controller
public class AddressController {

	@Autowired
	private AddressrService addressService;
	@Autowired
	private CustomerService custService;

	private static final Logger log = Logger.getLogger(AddressController.class);
	
	@RequestMapping(value = "/address", method = RequestMethod.POST)
	public @ResponseBody List<Address> getAllAddresses( @RequestBody Customer customer) {
		Address address = new Address();
		address.setMobileNumber(customer.getMobileNumber());
		 List<Address> addressList = addressService.getAllAddresses(address);
		return addressList;
	}
	
	@RequestMapping(value = "/insertAddress", method = RequestMethod.POST)
	public @ResponseBody int insertAddress(@RequestBody Address address) {
		address.setCity(ApplicationConstants.CITY);
		address.setState(ApplicationConstants.STATE);
		address.setCountry(ApplicationConstants.COUNTRY);
		address.setAddressId(generateUniqueId());
		return addressService.insertAddress(address);
	}
	
	@RequestMapping(value = "/updateAddress", method = RequestMethod.POST)
	public @ResponseBody int updateAddress(@RequestBody Address address) {
		return addressService.updateAddress(address);
	}
	
	@RequestMapping(value = "/deleteAddress", method = RequestMethod.POST)
	public @ResponseBody int deleteAddress(@RequestBody Address address) {
		return addressService.deleteAddress(address);
	}
	
	private String generateUniqueId() {      
        UUID idOne = UUID.randomUUID();
        String str=ApplicationConstants.EMPTY_STRING+idOne;        
        int uid=str.hashCode();
        String filterStr=ApplicationConstants.EMPTY_STRING+uid;
        str=filterStr.replaceAll(ApplicationConstants.HYPHEN, "");
        return str;
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
	public void setStudentService(AddressrService studService_p) {
		addressService = studService_p;
	}
}
