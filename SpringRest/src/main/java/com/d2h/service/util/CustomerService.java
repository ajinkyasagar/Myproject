/**
 * 
 */
package com.d2h.service.util;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.d2h.service.domain.ContactUs;
import com.d2h.service.domain.Customer;

/**
 * @author Hemanta
 *
 */
public interface CustomerService {
	
	public List<Customer> getAllCustomers();
	public int insertCustomer(Customer customer);
	public Customer loginCustomer(Customer customer);
	public Customer forgetPassword(Customer customer);
	public int contactUs(ContactUs contactUs);
	public int updateCustomer(Customer customer);
	public int deleteCustomer(Customer customer);
	public Customer selectCustomerByMobileNumber(String mobileNumber);
	public Customer selectCustomerByUserId(Customer customer);
	public int updateCustomerWallet(Customer customer);
	public Customer selectCustomerByCouponCode(String couponCode);
	
}
