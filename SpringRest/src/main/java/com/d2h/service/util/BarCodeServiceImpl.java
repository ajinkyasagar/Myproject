package com.d2h.service.util;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.d2h.service.domain.Address;
import com.d2h.service.domain.Customer;
import com.d2h.service.persistance.AddressMapper;

@Service("addressService1")
public class BarCodeServiceImpl implements BarCodeService{

	
	private static AddressMapper getMapper() {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		return sqlSession.getMapper(AddressMapper.class);
	}

	public List<Address> getAllAddresses(Address address) {
		
		return  getMapper().getAllAddress(address);
	}


	public String getBarCodeDetails(String barCode) {
		// TODO Auto-generated method stub
		return null;
	}

}
