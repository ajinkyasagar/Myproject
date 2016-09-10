package com.d2h.service.util;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.d2h.service.domain.Address;
import com.d2h.service.domain.Customer;
import com.d2h.service.persistance.AddressMapper;

@Service("addressService")
public class AddressServiceImpl implements AddressrService{

	
	private static AddressMapper getMapper() {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		return sqlSession.getMapper(AddressMapper.class);
	}

	public List<Address> getAllAddresses(Address address) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		List<Address> addressList =  sqlSession.getMapper(AddressMapper.class).getAllAddress(address);
		if(sqlSession != null)
			sqlSession.close();
		return addressList;
	}

	public int insertAddress(Address address) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		int value = sqlSession.getMapper(AddressMapper.class).insertAddress(address);
		try{
			sqlSession.commit();
		} finally{
			sqlSession.close();
		}
		return value;
	}

	public int updateAddress(Address address) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		int value = sqlSession.getMapper(AddressMapper.class).updateAddress(address);
		try{
			sqlSession.commit();
		} finally{
			sqlSession.close();
		}
		return value;
	}

	public int deleteAddress(Address address) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		int value = sqlSession.getMapper(AddressMapper.class).deleteAddress(address);
		try{
			sqlSession.commit();
		} finally{
			sqlSession.close();
		}
		return value;
	}
	
	public Address selectAddressByAddressId(String mobileNumber) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		Address address =  sqlSession.getMapper(AddressMapper.class).selectAddressByAddressId(mobileNumber);
		if(sqlSession != null)
			sqlSession.close();
		return address;
	}

	/*public Address selectAddressByMobileNumber(int mobileNumber) {
		return getMapper().selectAddressByMobileNumber(mobileNumber);
	}

	public Address selectAddressByUserId(String userId) {
		return getMapper().selectAddressByUserId(userId);
	}*/
}
