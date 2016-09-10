/**
 * 
 */
package com.d2h.service.persistance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.d2h.service.domain.Address;

/**
 * @author Yostna
 *
 */
public interface AddressMapper {
	
	/**
	 * @return all the Address
	 */
	public List<Address> getAllAddress(Address address);
	/**
	 * @param Address
	 * @return the number of rows affected
	 */
	public int insertAddress(Address address);
	/**
	 * @param Address
	 * @return the number of rows affected
	 */
	public int updateAddress(Address address);
	
	/**
	 * @param Address
	 * @return the number of rows affected
	 */
	public int deleteAddress(Address address);
	
	/**
	 * @param Address
	 * @return the number of rows affected
	 */
	public Address selectAddressByAddressId(@Param("addressId") String addressId);
	
	public List<Address>  selectAddressByMoboleNumber(@Param("mobileNumber") String mobileNumber);

}
