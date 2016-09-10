package com.d2h.service.util;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.d2h.service.domain.ContactUs;
import com.d2h.service.domain.Customer;
import com.d2h.service.persistance.CustomerMapper;

@Service("custService")
public class CustomerServiceImpl implements CustomerService{

	
	private static CustomerMapper getMapper() {
		return getSqlSession().getMapper(CustomerMapper.class);
	}
	
	private static SqlSession getSqlSession() {
		return ConnectionFactory.getSqlSessionFactory().openSession();
	}

	public List<Customer> getAllCustomers() {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		List<Customer> customerList  = sqlSession.getMapper(CustomerMapper.class).getAllCustomers();
		 if (sqlSession != null) {
	        	sqlSession.close();
	        }
		return  customerList;
	}

	
	public int insertCustomer(Customer customer) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		int value = sqlSession.getMapper(CustomerMapper.class).insertCustomer(customer);
//		if (value > 0 )
		try{
			sqlSession.commit();
		  }finally{
			  sqlSession.close();
		  }
		return value;
	}
	
	public Customer loginCustomer(Customer customer) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		Customer cust  = sqlSession.getMapper(CustomerMapper.class).loginCustomer(customer);
		 if (sqlSession != null) {
	        	sqlSession.close();
	        }
		return cust;
	}
	
	public Customer forgetPassword(Customer customer) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		Customer cust  = sqlSession.getMapper(CustomerMapper.class).forgetPassword(customer);
		if (sqlSession != null) {
        	sqlSession.close();
        }
			
		return cust;
	}
	
	public int contactUs(ContactUs contactUs) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		int value = sqlSession.getMapper(CustomerMapper.class).contactUs(contactUs);
		try{
			sqlSession.commit();
		  }finally{
			  sqlSession.close();
		  }
		return value;
		
		
	}

	public int updateCustomer(Customer customer) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		int value = sqlSession.getMapper(CustomerMapper.class).updateCustomer(customer);
		try{
			sqlSession.commit();
		  }finally{
			  if(sqlSession != null)
			  sqlSession.close();
		  }
		return value;
	}

	public int updateCustomerWallet(Customer customer) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		int value = sqlSession.getMapper(CustomerMapper.class).updateCustomerWallet(customer);
		try{
			sqlSession.commit();
		  }finally{
			  if(sqlSession != null)
			  sqlSession.close();
		  }
		return value;
	}
	public int deleteCustomer(Customer customer) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		int value =  sqlSession.getMapper(CustomerMapper.class).deleteCustomer(customer);
		try{
			sqlSession.commit();
		  }finally{
			  if(sqlSession != null)
			  sqlSession.close();
		  }
		return value;
	}

	public Customer selectCustomerByMobileNumber(String mobileNumber) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		Customer customer =  sqlSession.getMapper(CustomerMapper.class).selectCustomerByMobileNumber(mobileNumber);
		return customer;
	}
	
	public Customer selectCustomerByCouponCode(String couponCode){
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		Customer customer =  sqlSession.getMapper(CustomerMapper.class).selectCustomerByCouponCode(couponCode);
		return customer;
	}

	public Customer selectCustomerByUserId(Customer customer) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		Customer customer1 =  sqlSession.getMapper(CustomerMapper.class).selectCustomerByUserId(customer);
		 if(sqlSession != null)
			  sqlSession.close();
		return customer1;
	}

	public String getPaymentDetails() {
		// TODO Auto-generated method stub
		return null;
	}
}
