/**
 * 
 */
package com.d2h.service.util;

import java.util.List;

import com.d2h.service.domain.Address;
import com.d2h.service.domain.Customer;

/**
 * @author Hemanta
 *
 */
public interface AddressrService {
	
	public List<Address> getAllAddresses(Address address);
	public int insertAddress(Address address);
	public int updateAddress(Address address);
	public int deleteAddress(Address address);
	public Address selectAddressByAddressId(String mobileNumber);
/*	public Address selectAddressByMobileNumber(int mobileNumber);
	public Address selectAddressByUserId(String userId);*/

}
