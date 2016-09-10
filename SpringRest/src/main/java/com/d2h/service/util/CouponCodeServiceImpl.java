package com.d2h.service.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.d2h.service.domain.Coupons;
import com.d2h.service.domain.ui.CouponDetails;
import com.d2h.service.persistance.CouponCodeMapper;

@Service("coupanCodeService")
public class CouponCodeServiceImpl implements CouponCodeService{

	
	/*private static CouponCodeMapper getMapper() {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		return sqlSession.getMapper(CouponCodeMapper.class);
	}*/


	public CouponDetails validateCoupanCode(Coupons couponCode) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		Coupons coupon = sqlSession.getMapper(CouponCodeMapper.class).validateCoupanCode(couponCode);
		if(sqlSession != null)
			sqlSession.close();
		
		CouponDetails couponDetails = new CouponDetails();
		if(null!=coupon)
		{
		Double shoppingAmount =  Double.valueOf(couponCode.getShoppingAmount());
		Double maxThreshold = Double.valueOf(coupon.getMaxShoppingAmount());
		Double minThresHold = Double.valueOf(coupon.getMinShoppingAmount());
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		String today = sdf.format(new Date());
		String exiparyDate = null;
		try {
			exiparyDate = sdf.format(sdf.parse(coupon.getCouponExpireDate()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
    	if(coupon.getCouponStatus().equals("True") && exiparyDate.compareTo(today) >0){
    		if(coupon.getCouponType().equals("Flat")){
    			if(shoppingAmount>= maxThreshold){
    				couponDetails.setMaxDiscountAmount(String.valueOf(coupon.getMaxDiscountAmount()));
    				couponDetails.setStatusMessage("Congratulations, SuccessFul applied coupon code : "+coupon.getCouponCode()+ " and amount "+couponDetails.getMaxDiscountAmount()+ " added to your goWallet after 24 hrs.");
    				couponDetails.setRefCouponCode(coupon.getRefPercentage());
    			}
    			else if(shoppingAmount>= minThresHold){
    				Double maxDiscount = shoppingAmount * Double.valueOf(coupon.getCouponPercentage())/100;
    				couponDetails.setMaxDiscountAmount(String.valueOf(maxDiscount));
    				couponDetails.setStatusMessage("Congratulations, SuccessFul applied coupon code : "+coupon.getCouponCode()+ " and amount "+couponDetails.getMaxDiscountAmount()+ " added to your goWallet after 24 hrs.");
    				couponDetails.setRefCouponCode(coupon.getRefPercentage());
    			}
    			
    			else {
    				couponDetails.setMaxDiscountAmount(String.valueOf("0"));
    			}
    		}
    		else if(coupon.getCouponType().equals("Percentage") ){
    			if(shoppingAmount>= minThresHold){
    				if(shoppingAmount >= maxThreshold){
    					couponDetails.setMaxDiscountAmount(coupon.getMaxDiscountAmount());
    					couponDetails.setRefCouponCode(coupon.getRefPercentage());
    					couponDetails.setStatusMessage("Congratulations, SuccessFul applied coupon code : "+coupon.getCouponCode()+ " and amount "+couponDetails.getMaxDiscountAmount()+ " added to your goWallet after 24 hrs.");
    				}
    				else{
    					Double maxDiscount = shoppingAmount * Double.valueOf(coupon.getCouponPercentage())/100;
    					couponDetails.setMaxDiscountAmount(String.valueOf(maxDiscount));
    					couponDetails.setRefCouponCode(coupon.getRefPercentage());
    					couponDetails.setStatusMessage("Congratulations, SuccessFul applied coupon code : "+coupon.getCouponCode()+ " and amount "+couponDetails.getMaxDiscountAmount()+ " added to your goWallet after 24 hrs.");
    				}
        		}
    			else{
    				couponDetails.setMaxDiscountAmount(String.valueOf("0"));
    			}
    		}
    		else if(coupon.getCouponType().equals("Referral") ){

    			if(shoppingAmount>= minThresHold){
    				if(shoppingAmount >= maxThreshold){
    					couponDetails.setMaxDiscountAmount(coupon.getMaxDiscountAmount());
    					couponDetails.setRefCouponCode(coupon.getRefPercentage());
    					couponDetails.setStatusMessage("Congratulations, SuccessFul applied coupon code : "+coupon.getCouponCode()+ " and amount "+couponDetails.getMaxDiscountAmount()+ " added to your goWallet after 24 hrs.");
    				}
    				else{
    					Double maxDiscount = shoppingAmount * Double.valueOf(coupon.getCouponPercentage())/100;
    					couponDetails.setMaxDiscountAmount(String.valueOf(maxDiscount));
    					couponDetails.setRefCouponCode(coupon.getRefPercentage());
    					couponDetails.setStatusMessage("Congratulations, SuccessFul applied coupon code : "+coupon.getCouponCode()+ " and amount "+couponDetails.getMaxDiscountAmount()+ " added to your goWallet after 24 hrs.");
    				}
        		}
    			else{
    				couponDetails.setMaxDiscountAmount(String.valueOf("0"));
    			}
    		}
    		else {
    			if(shoppingAmount>= minThresHold){
    				if(shoppingAmount >= maxThreshold){
    					couponDetails.setMaxDiscountAmount(coupon.getMaxDiscountAmount());
    					couponDetails.setRefCouponCode(coupon.getRefPercentage());
    					couponDetails.setStatusMessage("Congratulations, SuccessFul applied coupon code : "+coupon.getCouponCode()+ " and amount "+couponDetails.getMaxDiscountAmount()+ " added to your goWallet after 24 hrs.");
    				}
    				else{
    					Double maxDiscount = shoppingAmount * Double.valueOf(coupon.getCouponPercentage())/100;
    					couponDetails.setMaxDiscountAmount(String.valueOf(maxDiscount));
    					couponDetails.setRefCouponCode(coupon.getRefPercentage());
    					couponDetails.setStatusMessage("Congratulations, SuccessFul applied coupon code : "+coupon.getCouponCode()+ " and amount "+couponDetails.getMaxDiscountAmount()+ " added to your goWallet after 24 hrs.");
    				}
        		}
    			else{
    				couponDetails.setMaxDiscountAmount(String.valueOf("0"));
    			}
    		}
    		
			return couponDetails;
		}
		else {
//			couponDetails = new CouponDetails();
			couponDetails.setErroMessage("Invalid Coupan Code");
			return couponDetails;
		}
		}else
		{
			return couponDetails;
		}
	
	
	}
	
	public static void main(String[] args) {
		CouponCodeServiceImpl cc = new CouponCodeServiceImpl();
		Coupons cp = new Coupons();
		cp.setShoppingAmount("500.00");
		cp.setCouponCode("1234567");
		CouponDetails couponDetails = cc.validateCoupanCode(cp);
		System.out.println(couponDetails.getMaxDiscountAmount());
	}
	
}
