package com.d2h.service.util;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.d2h.service.domain.Seller;
import com.d2h.service.persistance.SellerMapper;

@Service("sellerService")
public class SellerServiceImpl implements SellerService{

	public int insertSeller(Seller seller) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		int value = sqlSession.getMapper(SellerMapper.class).insertSeller(seller);
		try{
			sqlSession.commit();
		  }finally{
			  if (sqlSession != null) {
		        	sqlSession.close();
		        }
		  }
		return value;
	}
}
