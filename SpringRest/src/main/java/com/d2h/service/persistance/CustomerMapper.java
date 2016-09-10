package com.d2h.service.persistance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.d2h.service.domain.ContactUs;
import com.d2h.service.domain.Customer;
import com.d2h.service.domain.CustomerOrder;

public interface CustomerMapper {

	public List<Customer> getAllCustomers();
	public int insertCustomer(Customer customer);
	public Customer  loginCustomer(Customer customer);
	public Customer  forgetPassword(Customer customer);
	public int updateCustomer(Customer customer);
	public int deleteCustomer(Customer customer);
	public Customer selectCustomerByMobileNumber(@Param("mobileNumber")String mobileNumber);
	public Customer selectCustomerByUserId(Customer customer);
	public int contactUs(ContactUs contactUs);
	public int updateCustomerWallet(Customer customer);
	public Customer selectCustomerByCouponCode(@Param("couponCode")String couponCode);
	
}
