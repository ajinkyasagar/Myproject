package com.d2h.service.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.d2h.service.constants.ApplicationConstants;
import com.d2h.service.domain.DamagedProduct;
import com.d2h.service.persistance.DamagedProductMapper;

@Service("damagedProductService")
public class DamagedProductServiceImpl implements DamagedProductService{
	
	public int insertDamagedProduct(List<DamagedProduct> dProductList){
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		int value = -1;
		try{
			value = sqlSession.getMapper(DamagedProductMapper.class).insertDamagedProduct(dProductList);
			sqlSession.commit();
		  }finally {
		        if (sqlSession != null) {
		        	sqlSession.close();
		        }
		    }
		return value;
	}
	
	public static void main(String[] args) {
		List<DamagedProduct> dProductList = new ArrayList<DamagedProduct>();
		DamagedProduct damagedProduct = new DamagedProduct();
		dProductList.add(damagedProduct);
		
		damagedProduct.setOrderId("Ord-1273044544");
		damagedProduct.setProductId("1");
		damagedProduct.setQuantity("1");
		damagedProduct.setAmount("100.00");
		SimpleDateFormat sdf = new SimpleDateFormat(ApplicationConstants.SIMPLE_FORMAT);
		Date startDate = null;
		try {
			startDate = sdf.parse("2015-12-10");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		damagedProduct.setDamagedDate(startDate);
		damagedProduct.setProductName("Cashew");
		damagedProduct.setReason("Broken during delivery");
		damagedProduct.setStatus("Failed");
		new DamagedProductServiceImpl().insertDamagedProduct(dProductList);
	}
	
}
