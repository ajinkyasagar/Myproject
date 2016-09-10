package com.d2h.service.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.d2h.service.domain.CancelReturnProduct;
import com.d2h.service.domain.Coupons;
import com.d2h.service.domain.CustomerOrder;
import com.d2h.service.domain.Product;
import com.d2h.service.domain.ui.CouponDetails;
import com.d2h.service.persistance.CancelReturnProductMapper;
import com.d2h.service.persistance.OrderMapper;
import com.d2h.service.persistance.ProductMapper;

@Service("cancelReturnProductService")
public class CancelReturnProductServiceImpl implements CancelReturnProductService{
	
	public int updateCancelReturn(CancelReturnProduct cancelReturnProductList){
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		int value = -1;
		Double shoppingAmount = 0.0;
		Map<String, CustomerOrder> orderMap = new HashMap<String, CustomerOrder>();
		List<CustomerOrder> orderList1 = sqlSession.getMapper(OrderMapper.class).selectOrder(cancelReturnProductList.getOrderId());
		for (Iterator iterator = orderList1.iterator(); iterator.hasNext();) {
			CustomerOrder customerOrder = (CustomerOrder) iterator.next();
			shoppingAmount = shoppingAmount + Double.valueOf(customerOrder.getTotalSellPrice());
			orderMap.put(customerOrder.getProductId(), customerOrder);
		}
		
		try{
				List<Product> productIdList = sqlSession.getMapper(ProductMapper.class).getAllProductsById(cancelReturnProductList.getProductList());
				Map<String, Product> productMap = new HashMap<String, Product>();
				for (Product product : productIdList) {
					productMap.put(product.getProductId(), product);
				}
				int counter = 0;
				
//				List<CustomerOrder> updateCustOrderList = new ArrayList<CustomerOrder>();
				CustomerOrder customerOrder = null;
//				List<Product> updateList = new ArrayList<Product>();
				for (Product product : cancelReturnProductList.getProductList()) {
					int updateQty = 0;
					customerOrder = orderMap.get(product.getProductId());
					if(productMap != null && productMap.get(product.getProductId())!=null){
						int avlQty = Integer.valueOf(productMap.get(product.getProductId()).getAvbleQuantity());
						int odrQty = Integer.valueOf(product.getOrderCancelQty()); 
						updateQty = avlQty + odrQty;
					}
					counter = counter + 1;
					if(updateQty >= 0){
						product.setAvbleQuantity(updateQty);
						Double finalOrderQty = Double.valueOf(customerOrder.getOrderQty()) - Double.valueOf(product.getOrderCancelQty());
						Double totalSale = Double.valueOf(customerOrder.getOrderQty()) *  Double.valueOf(productMap.get(product.getProductId()).getSalePrice());
						Double totalBuy = Double.valueOf(customerOrder.getOrderQty()) *  Double.valueOf(productMap.get(product.getProductId()).getBuyPrice());
						Double cancelSellAmount = Double.valueOf(product.getOrderCancelQty()) *  Double.valueOf(productMap.get(product.getProductId()).getSalePrice());
						Double cancelBuyAmount = Double.valueOf(product.getOrderCancelQty()) *  Double.valueOf(productMap.get(product.getProductId()).getBuyPrice());
						Double finalBuy = totalBuy - cancelBuyAmount;
						Double finalSell = totalSale - cancelSellAmount;
						customerOrder.setOrderQty(String.valueOf(finalOrderQty));
						customerOrder.setTotalSellPrice(String.valueOf(finalSell));
						customerOrder.setTotalBuyPrice(String.valueOf(finalBuy));
						shoppingAmount = shoppingAmount - cancelSellAmount;
						customerOrder.setProfitLossPrice(String.valueOf(finalSell - finalBuy));
//						updateList.add(product);
//						updateCustOrderList.add(customerOrder);
					}
					if(cancelReturnProductList.getProductList().size() == counter){
						Coupons coupon = new Coupons();
						coupon.setCouponCode(customerOrder.getCouponCode());
						coupon.setShoppingAmount(String.valueOf(shoppingAmount));
						CouponDetails couponDetails =new CouponCodeServiceImpl().validateCoupanCode(coupon);
						if(null!=couponDetails.getMaxDiscountAmount())
						{
						double couponDiscount = Double.valueOf(couponDetails.getMaxDiscountAmount());
						customerOrder.setCouponDiscount(""+couponDiscount);
						}else
						{
							customerOrder.setCouponDiscount("0");
						}
					}
					value = sqlSession.getMapper(ProductMapper.class).updateProduct(product);
					value = sqlSession.getMapper(CancelReturnProductMapper.class).updateCancelReturn(customerOrder);
					
				}
			
			sqlSession.commit();
			productMap = null;
			orderMap = null;
			productIdList = null;
		  }finally {
		        if (sqlSession != null) {
		        	sqlSession.close();
		        }
		    }
		return value;
	}
	
	
	/*public int insertDamagedProduct(List<DamagedProduct> dProductList){
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
	}*/
	
	public static void main(String[] args) {
		List<Product> pList = new ArrayList<Product>();
		CancelReturnProduct CancelReturnProduct = new CancelReturnProduct();
		Product product = new Product();
		product.setProductId("2");
		product.setOrderCancelQty("2");
//		product.setSalePrice("200");
//		product.setBuyPrice("150");
		pList.add(product);
			Product product1 = new Product();
			product1.setProductId("1");
			product1.setOrderCancelQty("2");
//			product1.setSalePrice("750");
//			product1.setBuyPrice("550");
			pList.add(product1);
			CancelReturnProduct.setOrderId("Ord-1273044544");
			CancelReturnProduct.setProductList(pList);
		new CancelReturnProductServiceImpl().updateCancelReturn(CancelReturnProduct);
		System.out.println("22+2 : ");
	}
	
}

