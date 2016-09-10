package com.d2h.service.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.d2h.service.constants.ApplicationConstants;
import com.d2h.service.domain.Address;
import com.d2h.service.domain.Coupons;
import com.d2h.service.domain.CustOrder;
import com.d2h.service.domain.Customer;
import com.d2h.service.domain.CustomerOrder;
import com.d2h.service.domain.OrderSelectionParam;
import com.d2h.service.domain.Product;
import com.d2h.service.domain.Status;
import com.d2h.service.domain.ui.AdminOrderDetails;
import com.d2h.service.domain.ui.CouponDetails;
import com.d2h.service.persistance.AddressMapper;
import com.d2h.service.persistance.CouponCodeMapper;
import com.d2h.service.persistance.CustomerMapper;
import com.d2h.service.persistance.OrderMapper;
import com.d2h.service.persistance.ProductMapper;
import com.d2h.service.utility.MailService;

@Service("orderService")
public class OrderServiceImpl implements OrderService{

	
	/*private static OrderMapper getMapper() {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		return sqlSession.getMapper(OrderMapper.class);
	}*/
	
	public List<AdminOrderDetails> allOrderFromDateToDate(OrderSelectionParam orderSelection) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		List<CustomerOrder> orderList1 = sqlSession.getMapper(OrderMapper.class).allOrderFromDateToDate(orderSelection);
		List<AdminOrderDetails> adminOrderList = new ArrayList<AdminOrderDetails>();
		CustOrder custOrder = null;
		double totalOrderValue = 0;
		AdminOrderDetails adminOrderDetails = null;
		Address address1 = null;
		for (Iterator<CustomerOrder> iterator = orderList1.iterator(); iterator.hasNext();) {
			CustomerOrder customerOrder = (CustomerOrder) iterator.next();
			if(adminOrderDetails == null ||  !adminOrderDetails.getOrderId().equals(customerOrder.getOrderId())){
				adminOrderDetails = new AdminOrderDetails();
				custOrder = new CustOrder();
				Customer customer = sqlSession.getMapper(CustomerMapper.class).selectCustomerByMobileNumber(customerOrder.getMobileNumber());
				adminOrderDetails.setMobileNumber(customerOrder.getMobileNumber());
				adminOrderDetails.setCustomerString(customer.getFirstName());
				adminOrderDetails.setCustomerString(adminOrderDetails.getCustomerString()+"  "+customer.getLastName());
				adminOrderDetails.setTotal(customerOrder.getTotalSellPrice());
				adminOrderDetails.setOrderId(customerOrder.getOrderId());
				adminOrderDetails.setOrderDeliveryDate(customerOrder.getOrderDeliveryDate());
				
				SimpleDateFormat sdf = new SimpleDateFormat(ApplicationConstants.DATE_FORMAT);
				Date date = null;
				try {
					date = sdf.parse(sdf.format(customerOrder.getOrderPlaceDate()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				adminOrderDetails.setOrderPlaceDate(date);
				adminOrderDetails.setStatus(customerOrder.getOrderStatus());
				adminOrderDetails.setProducString(customerOrder.getProductName());
				adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" - "+customerOrder.getTotalSellPrice());
				adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" ("+customerOrder.getOrderQty()+")");
				totalOrderValue = totalOrderValue + Double.parseDouble(customerOrder.getTotalSellPrice());
//				custOrder.setTotalSalePrice(""+totalOrderValue);
				adminOrderDetails.setTotal(""+totalOrderValue);
				address1 = new Address();
				custOrder.setAddress(address1);
				custOrder.setCustomer(customer);
				if(custOrder.getOrderId() == null ){
					Address address = sqlSession.getMapper(AddressMapper.class).selectAddressByAddressId(customerOrder.getAddressId());
					adminOrderDetails.setAddressString(address.getAddressLine1());
					adminOrderDetails.setAddressString(adminOrderDetails.getAddressString()+" , "+address.getAddressLine2());
					adminOrderDetails.setAddressString(adminOrderDetails.getAddressString()+" , "+address.getLandMark());
					adminOrderList.add(adminOrderDetails);
				}
			}
			else {
				if(adminOrderDetails.getOrderId() != null && adminOrderDetails.getOrderId().equals(customerOrder.getOrderId())){
					totalOrderValue = totalOrderValue + Double.parseDouble(customerOrder.getTotalSellPrice());
//					custOrder.setTotalSalePrice(""+totalOrderValue);
					adminOrderDetails.setTotal(""+totalOrderValue);
					adminOrderDetails.setProducString(adminOrderDetails.getProducString()+", "+customerOrder.getProductName());
					adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" - "+customerOrder.getTotalSellPrice());
					adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" ("+customerOrder.getOrderQty()+")");
				}
			}
			
			}
	        if (sqlSession != null) {
	        	sqlSession.close();
	        }
		return adminOrderList;
	}
	
	
	
//	public List<AdminOrderDetails> allVendorByFromToDate(OrderSelectionParam orderSelection);
//	public List<AdminOrderDetails> allVendorOrdersByStatus(OrderSelectionParam orderSelection);
//	public List<AdminOrderDetails> allVendorOrdersByVenderId(OrderSelectionParam orderSelection);
	
	
	public List<AdminOrderDetails> allVendorOrdersByVenderId(OrderSelectionParam orderSelection) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		List<CustomerOrder> orderList1 = sqlSession.getMapper(OrderMapper.class).allOrderFromDateToDate(orderSelection);
		List<AdminOrderDetails> adminOrderList = new ArrayList<AdminOrderDetails>();
		CustOrder custOrder = null;
		double totalOrderValue = 0;
		AdminOrderDetails adminOrderDetails = null;
		Address address1 = null;
		for (Iterator<CustomerOrder> iterator = orderList1.iterator(); iterator.hasNext();) {
			CustomerOrder customerOrder = (CustomerOrder) iterator.next();
			if(adminOrderDetails == null ||  !adminOrderDetails.getOrderId().equals(customerOrder.getOrderId())){
				adminOrderDetails = new AdminOrderDetails();
				custOrder = new CustOrder();
				Customer customer = sqlSession.getMapper(CustomerMapper.class).selectCustomerByMobileNumber(customerOrder.getMobileNumber());
				adminOrderDetails.setMobileNumber(customerOrder.getMobileNumber());
				adminOrderDetails.setCustomerString(customer.getFirstName());
				adminOrderDetails.setCustomerString(adminOrderDetails.getCustomerString()+"  "+customer.getLastName());
				adminOrderDetails.setTotal(customerOrder.getTotalSellPrice());
				adminOrderDetails.setOrderId(customerOrder.getOrderId());
				adminOrderDetails.setOrderDeliveryDate(customerOrder.getOrderDeliveryDate());
				
				SimpleDateFormat sdf = new SimpleDateFormat(ApplicationConstants.DATE_FORMAT);
				Date date = null;
				try {
					date = sdf.parse(sdf.format(customerOrder.getOrderPlaceDate()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				adminOrderDetails.setOrderPlaceDate(date);
				adminOrderDetails.setStatus(customerOrder.getOrderStatus());
				adminOrderDetails.setProducString(customerOrder.getProductName());
				adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" - "+customerOrder.getTotalSellPrice());
				adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" ("+customerOrder.getOrderQty()+")");
				totalOrderValue = totalOrderValue + Double.parseDouble(customerOrder.getTotalSellPrice());
//				custOrder.setTotalSalePrice(""+totalOrderValue);
				adminOrderDetails.setTotal(""+totalOrderValue);
				address1 = new Address();
				custOrder.setAddress(address1);
				custOrder.setCustomer(customer);
				if(custOrder.getOrderId() == null ){
					Address address = sqlSession.getMapper(AddressMapper.class).selectAddressByAddressId(customerOrder.getAddressId());
					adminOrderDetails.setAddressString(address.getAddressLine1());
					adminOrderDetails.setAddressString(adminOrderDetails.getAddressString()+" , "+address.getAddressLine2());
					adminOrderDetails.setAddressString(adminOrderDetails.getAddressString()+" , "+address.getLandMark());
					adminOrderList.add(adminOrderDetails);
				}
			}
			else {
				if(adminOrderDetails.getOrderId() != null && adminOrderDetails.getOrderId().equals(customerOrder.getOrderId())){
					totalOrderValue = totalOrderValue + Double.parseDouble(customerOrder.getTotalSellPrice());
//					custOrder.setTotalSalePrice(""+totalOrderValue);
					adminOrderDetails.setTotal(""+totalOrderValue);
					adminOrderDetails.setProducString(adminOrderDetails.getProducString()+", "+customerOrder.getProductName());
					adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" - "+customerOrder.getTotalSellPrice());
					adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" ("+customerOrder.getOrderQty()+")");
				}
			}
			
			}
	        if (sqlSession != null) {
	        	sqlSession.close();
	        }
		return adminOrderList;
	}
	
	public List<AdminOrderDetails> allVendorOrdersByStatus(OrderSelectionParam orderSelection) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		List<CustomerOrder> orderList1 = sqlSession.getMapper(OrderMapper.class).allOrderFromDateToDate(orderSelection);
		List<AdminOrderDetails> adminOrderList = new ArrayList<AdminOrderDetails>();
		CustOrder custOrder = null;
		double totalOrderValue = 0;
		AdminOrderDetails adminOrderDetails = null;
		Address address1 = null;
		for (Iterator<CustomerOrder> iterator = orderList1.iterator(); iterator.hasNext();) {
			CustomerOrder customerOrder = (CustomerOrder) iterator.next();
			if(adminOrderDetails == null ||  !adminOrderDetails.getOrderId().equals(customerOrder.getOrderId())){
				adminOrderDetails = new AdminOrderDetails();
				custOrder = new CustOrder();
				Customer customer = sqlSession.getMapper(CustomerMapper.class).selectCustomerByMobileNumber(customerOrder.getMobileNumber());
				adminOrderDetails.setMobileNumber(customerOrder.getMobileNumber());
				adminOrderDetails.setCustomerString(customer.getFirstName());
				adminOrderDetails.setCustomerString(adminOrderDetails.getCustomerString()+"  "+customer.getLastName());
				adminOrderDetails.setTotal(customerOrder.getTotalSellPrice());
				adminOrderDetails.setOrderId(customerOrder.getOrderId());
				adminOrderDetails.setOrderDeliveryDate(customerOrder.getOrderDeliveryDate());
				
				SimpleDateFormat sdf = new SimpleDateFormat(ApplicationConstants.DATE_FORMAT);
				Date date = null;
				try {
					date = sdf.parse(sdf.format(customerOrder.getOrderPlaceDate()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				adminOrderDetails.setOrderPlaceDate(date);
				adminOrderDetails.setStatus(customerOrder.getOrderStatus());
				adminOrderDetails.setProducString(customerOrder.getProductName());
				adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" - "+customerOrder.getTotalSellPrice());
				adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" ("+customerOrder.getOrderQty()+")");
				totalOrderValue = totalOrderValue + Double.parseDouble(customerOrder.getTotalSellPrice());
//				custOrder.setTotalSalePrice(""+totalOrderValue);
				adminOrderDetails.setTotal(""+totalOrderValue);
				address1 = new Address();
				custOrder.setAddress(address1);
				custOrder.setCustomer(customer);
				if(custOrder.getOrderId() == null ){
					Address address = sqlSession.getMapper(AddressMapper.class).selectAddressByAddressId(customerOrder.getAddressId());
					adminOrderDetails.setAddressString(address.getAddressLine1());
					adminOrderDetails.setAddressString(adminOrderDetails.getAddressString()+" , "+address.getAddressLine2());
					adminOrderDetails.setAddressString(adminOrderDetails.getAddressString()+" , "+address.getLandMark());
					adminOrderList.add(adminOrderDetails);
				}
			}
			else {
				if(adminOrderDetails.getOrderId() != null && adminOrderDetails.getOrderId().equals(customerOrder.getOrderId())){
					totalOrderValue = totalOrderValue + Double.parseDouble(customerOrder.getTotalSellPrice());
//					custOrder.setTotalSalePrice(""+totalOrderValue);
					adminOrderDetails.setTotal(""+totalOrderValue);
					adminOrderDetails.setProducString(adminOrderDetails.getProducString()+", "+customerOrder.getProductName());
					adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" - "+customerOrder.getTotalSellPrice());
					adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" ("+customerOrder.getOrderQty()+")");
				}
			}
			
			}
	        if (sqlSession != null) {
	        	sqlSession.close();
	        }
		return adminOrderList;
	}
	
	
	public List<AdminOrderDetails> allVendorByFromToDate(OrderSelectionParam orderSelection) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		List<CustomerOrder> orderList1 = sqlSession.getMapper(OrderMapper.class).allOrderFromDateToDate(orderSelection);
		List<AdminOrderDetails> adminOrderList = new ArrayList<AdminOrderDetails>();
		CustOrder custOrder = null;
		double totalOrderValue = 0;
		AdminOrderDetails adminOrderDetails = null;
		Address address1 = null;
		for (Iterator<CustomerOrder> iterator = orderList1.iterator(); iterator.hasNext();) {
			CustomerOrder customerOrder = (CustomerOrder) iterator.next();
			if(adminOrderDetails == null ||  !adminOrderDetails.getOrderId().equals(customerOrder.getOrderId())){
				adminOrderDetails = new AdminOrderDetails();
				custOrder = new CustOrder();
				Customer customer = sqlSession.getMapper(CustomerMapper.class).selectCustomerByMobileNumber(customerOrder.getMobileNumber());
				adminOrderDetails.setMobileNumber(customerOrder.getMobileNumber());
				adminOrderDetails.setCustomerString(customer.getFirstName());
				adminOrderDetails.setCustomerString(adminOrderDetails.getCustomerString()+"  "+customer.getLastName());
				adminOrderDetails.setTotal(customerOrder.getTotalSellPrice());
				adminOrderDetails.setOrderId(customerOrder.getOrderId());
				adminOrderDetails.setOrderDeliveryDate(customerOrder.getOrderDeliveryDate());
				
				SimpleDateFormat sdf = new SimpleDateFormat(ApplicationConstants.DATE_FORMAT);
				Date date = null;
				try {
					date = sdf.parse(sdf.format(customerOrder.getOrderPlaceDate()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				adminOrderDetails.setOrderPlaceDate(date);
				adminOrderDetails.setStatus(customerOrder.getOrderStatus());
				adminOrderDetails.setProducString(customerOrder.getProductName());
				adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" - "+customerOrder.getTotalSellPrice());
				adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" ("+customerOrder.getOrderQty()+")");
				totalOrderValue = totalOrderValue + Double.parseDouble(customerOrder.getTotalSellPrice());
//				custOrder.setTotalSalePrice(""+totalOrderValue);
				adminOrderDetails.setTotal(""+totalOrderValue);
				address1 = new Address();
				custOrder.setAddress(address1);
				custOrder.setCustomer(customer);
				if(custOrder.getOrderId() == null ){
					Address address = sqlSession.getMapper(AddressMapper.class).selectAddressByAddressId(customerOrder.getAddressId());
					adminOrderDetails.setAddressString(address.getAddressLine1());
					adminOrderDetails.setAddressString(adminOrderDetails.getAddressString()+" , "+address.getAddressLine2());
					adminOrderDetails.setAddressString(adminOrderDetails.getAddressString()+" , "+address.getLandMark());
					adminOrderList.add(adminOrderDetails);
				}
			}
			else {
				if(adminOrderDetails.getOrderId() != null && adminOrderDetails.getOrderId().equals(customerOrder.getOrderId())){
					totalOrderValue = totalOrderValue + Double.parseDouble(customerOrder.getTotalSellPrice());
//					custOrder.setTotalSalePrice(""+totalOrderValue);
					adminOrderDetails.setTotal(""+totalOrderValue);
					adminOrderDetails.setProducString(adminOrderDetails.getProducString()+", "+customerOrder.getProductName());
					adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" - "+customerOrder.getTotalSellPrice());
					adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" ("+customerOrder.getOrderQty()+")");
				}
			}
			
			}
	        if (sqlSession != null) {
	        	sqlSession.close();
	        }
		return adminOrderList;
	}
	
	
	public List<AdminOrderDetails> allOrderByDateMobileNumber(OrderSelectionParam orderSelection) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		List<CustomerOrder> orderList1 = sqlSession.getMapper(OrderMapper.class).allOrderByDateMobileNumber(orderSelection);
		List<AdminOrderDetails> adminOrderList = new ArrayList<AdminOrderDetails>();
		CustOrder custOrder = null;
		double totalOrderValue = 0;
		AdminOrderDetails adminOrderDetails = null;
		Address address1 = null;
		for (Iterator<CustomerOrder> iterator = orderList1.iterator(); iterator.hasNext();) {
			CustomerOrder customerOrder = (CustomerOrder) iterator.next();
			if(adminOrderDetails == null ||  !adminOrderDetails.getOrderId().equals(customerOrder.getOrderId())){
				adminOrderDetails = new AdminOrderDetails();
				custOrder = new CustOrder();
				Customer customer = sqlSession.getMapper(CustomerMapper.class).selectCustomerByMobileNumber(customerOrder.getMobileNumber());
				adminOrderDetails.setMobileNumber(customerOrder.getMobileNumber());
				adminOrderDetails.setCustomerString(customer.getFirstName());
				adminOrderDetails.setCustomerString(adminOrderDetails.getCustomerString()+"  "+customer.getLastName());
				totalOrderValue = totalOrderValue + Double.parseDouble(customerOrder.getTotalSellPrice());
//				custOrder.setTotalSalePrice(""+totalOrderValue);
				adminOrderDetails.setTotal(""+totalOrderValue);
				adminOrderDetails.setOrderId(customerOrder.getOrderId());
				adminOrderDetails.setOrderDeliveryDate(customerOrder.getOrderDeliveryDate());
				SimpleDateFormat sdf = new SimpleDateFormat(ApplicationConstants.DATE_FORMAT);
				Date date = null;
				try {
					date = sdf.parse(sdf.format(customerOrder.getOrderPlaceDate()));
				} catch (ParseException e) {
					e.printStackTrace();
				}
				
				adminOrderDetails.setOrderPlaceDate(date);
//				adminOrderDetails.setOrderPlaceDate(customerOrder.getOrderPlaceDate());
				adminOrderDetails.setStatus(customerOrder.getOrderStatus());
				adminOrderDetails.setProducString(customerOrder.getProductName());
				adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" - "+customerOrder.getTotalSellPrice());
				adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" ("+customerOrder.getOrderQty()+")");
				address1 = new Address();
				custOrder.setAddress(address1);
				custOrder.setCustomer(customer);
				if(custOrder.getOrderId() == null ){
					Address address = sqlSession.getMapper(AddressMapper.class).selectAddressByAddressId(customerOrder.getAddressId());
					adminOrderDetails.setAddressString(address.getAddressLine1());
					adminOrderDetails.setAddressString(adminOrderDetails.getAddressString()+" , "+address.getAddressLine2());
					adminOrderDetails.setAddressString(adminOrderDetails.getAddressString()+" , "+address.getLandMark());
					adminOrderList.add(adminOrderDetails);
				}
			}
			else {
				if(adminOrderDetails.getOrderId() != null && adminOrderDetails.getOrderId().equals(customerOrder.getOrderId())){
					totalOrderValue = totalOrderValue + Double.parseDouble(customerOrder.getTotalSellPrice());
//					custOrder.setTotalSalePrice(""+totalOrderValue);
					adminOrderDetails.setTotal(""+totalOrderValue);
					adminOrderDetails.setProducString(adminOrderDetails.getProducString()+", "+customerOrder.getProductName());
					adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" - "+customerOrder.getTotalSellPrice());
					adminOrderDetails.setProducString(adminOrderDetails.getProducString()+" ("+customerOrder.getOrderQty()+")");
				}
			}
			
			}
	        if (sqlSession != null) {
	        	sqlSession.close();
	        }
		return adminOrderList;
	}
	
	public List<CustOrder> getAllOrder(Customer customer) {
		List<CustOrder> orderList = new ArrayList<CustOrder>();
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		List<CustomerOrder> orderList1 = sqlSession.getMapper(OrderMapper.class).getAllOrder(customer);
		CustOrder custOrder = null;
		Address address1 = null;
		double totalOrderValue = 0;
		int totalOrderQty = 0;
		List<Product> pList = null;
		for (Iterator<CustomerOrder> iterator = orderList1.iterator(); iterator.hasNext();) {
			CustomerOrder customerOrder = (CustomerOrder) iterator.next();
			if(custOrder == null || custOrder.getAddress() == null || custOrder.getAddress().getAddressId() == null || !custOrder.getOrderId().equals(customerOrder.getOrderId())){
				custOrder = new CustOrder();
				pList = new ArrayList<Product>();
				customer = sqlSession.getMapper(CustomerMapper.class).selectCustomerByMobileNumber(customer.getMobileNumber());
				address1 = new Address();
				custOrder.setAddress(address1);
				custOrder.setCustomer(customer);
				if(custOrder.getOrderId() == null ){
					custOrder.setOrderId(customerOrder.getOrderId());
					custOrder.setOrderStatus(customerOrder.getOrderStatus());
					totalOrderQty = totalOrderQty + Integer.valueOf(customerOrder.getOrderQty());
					custOrder.setOrderQty(""+totalOrderQty);
					SimpleDateFormat sdf = new SimpleDateFormat(ApplicationConstants.DATE_FORMAT);
					String date = sdf.format(customerOrder.getOrderPlaceDate());
					custOrder.setOrderPlaceDate(date);
					custOrder.setOrderDeliveryDate(customerOrder.getOrderDeliveryDate());
					custOrder.setOrderDesc(customerOrder.getOrderDesc());
					custOrder.setPaymentType(customerOrder.getPaymentType());
					totalOrderValue = totalOrderValue + Double.parseDouble(customerOrder.getTotalSellPrice());
					custOrder.setTotalSalePrice(""+totalOrderValue);
					custOrder.setVenderId(customerOrder.getVenderId());
					Product prod = new Product();
					prod.setDescription(customerOrder.getProductDesc());
					prod.setProductId(customerOrder.getProductId());
					prod.setSalePrice(customerOrder.getTotalSellPrice());
					prod.setOrderQty(customerOrder.getOrderQty());
					prod.setProductName(customerOrder.getProductDesc());
					prod.setOrderQty(customerOrder.getOrderQty());
					pList.add(prod);
					Address address = sqlSession.getMapper(AddressMapper.class).selectAddressByAddressId(customerOrder.getAddressId());
					custOrder.getAddress().setAddressId(customerOrder.getAddressId());
					custOrder.getAddress().setAddressLine1(address.getAddressLine1());
					custOrder.getAddress().setAddressLine2(address.getAddressLine2());
					custOrder.getAddress().setCity(address.getCity());
					custOrder.getAddress().setCountry(address.getCountry());
					custOrder.getAddress().setLandMark(address.getLandMark());
					custOrder.getAddress().setMobileNumber(address.getMobileNumber());
					custOrder.getAddress().setPinCode(address.getPinCode());;
					custOrder.getAddress().setState(address.getState());
					custOrder.setProductList(pList);
					orderList.add(custOrder);
				}
			}
			else {
				if(custOrder.getOrderId() != null && custOrder.getOrderId().equals(customerOrder.getOrderId())){
					Product prod = new Product();
					totalOrderValue = totalOrderValue + Double.parseDouble(customerOrder.getTotalSellPrice());
					custOrder.setTotalSalePrice(""+totalOrderValue);
					prod.setDescription(customerOrder.getProductDesc());
					prod.setProductId(customerOrder.getProductId());
					prod.setBuyPrice(customerOrder.getTotalBuyPrice());
					prod.setSalePrice(customerOrder.getTotalSellPrice());
					prod.setProductName(customerOrder.getProductName());
					prod.setOrderQty(customerOrder.getOrderQty());
					pList.add(prod);
					custOrder.setProductList(pList);
				}
			}
			
			}
	        if (sqlSession != null) {
	        	sqlSession.close();
	        }
		return  orderList;
	}
	public List<CustomerOrder> selectOrdertByOrderId(String orderId) {

		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		List<CustomerOrder> orderList = null;
		orderList = sqlSession.getMapper(OrderMapper.class).selectOrdertByOrderId(orderId);
		 if (sqlSession != null) {
	        	sqlSession.close();
	        }
		
		return orderList;
	
	}

	public int updateOrder(CustOrder order) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		double totalOrder = 0.0;
		String couponCode = null;
		Customer customer = new Customer();
		List<CustomerOrder> orderList = selectOrdertByOrderId(order.getOrderId());
		for (Iterator<CustomerOrder> iterator = orderList.iterator(); iterator.hasNext();) {
			CustomerOrder customerOrder = (CustomerOrder) iterator.next();
			totalOrder = totalOrder + Double.valueOf(customerOrder.getTotalSellPrice());
			customer.setMobileNumber(customerOrder.getMobileNumber());
			
		}
		couponCode = orderList.get(0).getCouponCode();
		Coupons coupon = new Coupons();
		coupon.setShoppingAmount(""+totalOrder);
		coupon.setCouponCode(couponCode);
//		Coupons coupon = sqlSession.getMapper(CouponCodeMapper.class).validateCoupanCode(couponCode);
		CouponCodeServiceImpl couponCodeServiceImpl = new CouponCodeServiceImpl();
		CouponDetails couponDetails = couponCodeServiceImpl.validateCoupanCode(coupon);
		customer.setGoWallet(couponDetails.getMaxDiscountAmount());
		
		Customer refCustomer = sqlSession.getMapper(CustomerMapper.class).selectCustomerByCouponCode(couponCode);
		coupon.setCouponCode(couponDetails.getRefCouponCode());
		couponDetails = couponCodeServiceImpl.validateCoupanCode(coupon);
		refCustomer.setGoWallet(couponDetails.getMaxDiscountAmount());
		int value = -1;
		try{
			value = sqlSession.getMapper(OrderMapper.class).updateOrder(order);
			if(value == 1 ){
//				Customer customer = order.getCustomer();
				if(customer != null){
					value = sqlSession.getMapper(CustomerMapper.class).updateCustomerWallet(customer);
					value = sqlSession.getMapper(CustomerMapper.class).updateCustomerWallet(refCustomer);
				}
			}
			sqlSession.commit();
		}finally{
		
		 if (sqlSession != null) {
	        	sqlSession.close();
	        }
		}
		return value;
	}
	
	private CustOrder orderUtility(CustOrder order){
		order.setOrderId("Ord-"+generateUniqueId());
		SimpleDateFormat sdf = new SimpleDateFormat(ApplicationConstants.DATE_FORMAT);
		String date = null;
		date = sdf.format(new Date());
		order.setOrderPlaceDate(date);
		return order;
	}
	private Address addressUtility(Address address){
		address.setAddressId("Add-"+generateUniqueId());
		address.setCity(ApplicationConstants.CITY);
		address.setState(ApplicationConstants.STATE);
		address.setCountry(ApplicationConstants.COUNTRY);
		return address;
	}
	public Status insertOrder(CustOrder order) {
		int value = 0;
		Status status = new Status();
		orderUtility(order);
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		List<CustomerOrder> insertOrderList = new ArrayList<CustomerOrder>();
		List<Product> prodList = order.getProductList();
		Map<String, String> prodMap = null;
		 ArrayList<Map<String, String>> list = new ArrayList<Map<String, String>>();
		 Lock lock = new ReentrantLock();
		int prodQty = 0;
		
		String mobileNumber = order.getCustomer().getMobileNumber();
		Address address =  order.getAddress();
		List<Address> addressList = sqlSession.getMapper(AddressMapper.class).selectAddressByMoboleNumber(mobileNumber);
		boolean matchAddress=false;
		for (Iterator iterator = addressList.iterator(); iterator.hasNext();) {
			Address tempAddress = (Address) iterator.next();
			if(addressComparision(address, tempAddress)){
				matchAddress=true;
				order.setAddress(tempAddress);
				break;
			}
			
		}
		if(!matchAddress)
		{
			addressUtility(address);
			address.setAddressId(order.getAddress().getAddressId());
			address.setAddressLine1(order.getAddress().getAddressLine1());
			address.setAddressLine2(order.getAddress().getAddressLine2());
			address.setCity(order.getAddress().getCity());
			address.setCountry(order.getAddress().getCountry());
			address.setEmail(order.getCustomer().getEmail());
			address.setLandMark(order.getAddress().getLandMark());
			address.setMobileNumber(mobileNumber);
			address.setState(order.getAddress().getState());
			sqlSession.getMapper(AddressMapper.class).insertAddress(address);
		}
		
		order.getCustomer().setCustomerLoginCreatedDate(new SimpleDateFormat(ApplicationConstants.DATE_FORMAT).format(new Date()));
		Customer customer = sqlSession.getMapper(CustomerMapper.class).selectCustomerByMobileNumber(mobileNumber);
		if(!(customer != null && customer.getMobileNumber().equals(mobileNumber))){
			value = sqlSession.getMapper(CustomerMapper.class).insertCustomer(order.getCustomer());
		}
		
		List<Product> productIdList = sqlSession.getMapper(ProductMapper.class).getAllProductsById(prodList);
		Map<String, Product> productMap = new HashMap<String, Product>();
		for (Product product : productIdList) {
			productMap.put(product.getProductId(), product);
		}
		double totalSalePrice = 0;
		for (Product product : prodList) {
			prodMap = new HashMap<String, String>();
			CustomerOrder custOrder = new CustomerOrder();
			custOrder.setAddressId(order.getAddress().getAddressId());
			custOrder.setOrderDesc(order.getOrderDesc());
			SimpleDateFormat sdf = new SimpleDateFormat(ApplicationConstants.DATE_FORMAT);
			Date date = null;
			try {
				date = sdf.parse(order.getOrderPlaceDate());
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			custOrder.setOrderPlaceDate(date);
//			custOrder.setOrderPlaceDate(order.getOrderPlaceDate());
			custOrder.setOrderDeliveryDate(order.getOrderDeliveryDate());
			custOrder.setVenderId(order.getVenderId());
			custOrder.setOrderStatus(order.getOrderStatus());
			custOrder.setPaymentType(order.getPaymentType());
			custOrder.setOrderId(order.getOrderId());
			custOrder.setMobileNumber(mobileNumber);
			custOrder.setProductDesc(product.getDescription());
			custOrder.setOrderStatus(ApplicationConstants.ORDER_STATUS);
			custOrder.setEmail(order.getCustomer().getEmail());
			custOrder.setProductId(product.getProductId());
			prodQty = prodQty + Integer.valueOf(product.getOrderQty());
			custOrder.setOrderQty(""+prodQty);
			Double salePrice = Double.valueOf(product.getOrderQty())*Double.valueOf(product.getSalePrice());
			totalSalePrice = totalSalePrice + salePrice;
			custOrder.setTotalSellPrice(String.valueOf(salePrice ));
			custOrder.setOrderQty(String.valueOf(product.getOrderQty()));
			custOrder.setProductUnitSellPrice(product.getSalePrice());
			custOrder.setProductName(product.getProductName());
			custOrder.setCouponDiscount(order.getCouponDiscount());
			Double buyPrice = Double.valueOf(product.getOrderQty())*Double.valueOf(productMap.get(product.getProductId()).getBuyPrice());
			custOrder.setTotalBuyPrice(String.valueOf(buyPrice));
//			Double couponAmount = Double.valueOf(order.getCouponDiscount());
			custOrder.setProfitLossPrice(String.valueOf(salePrice - buyPrice));
			custOrder.setCouponCode(order.getCouponCode());
			custOrder.setCouponDiscount(order.getCouponDiscount());
			int remainingQty = 0;
			if(lock.tryLock()){
				try{
					lock.lock();
//					Product p = sqlSession.getMapper(ProductMapper.class).selectProductById(product.getProductId());
					if(productMap != null && productMap.get(product.getProductId())!=null){
						int avlQty = Integer.valueOf(productMap.get(product.getProductId()).getAvbleQuantity());
						int odrQty = Integer.valueOf(product.getOrderQty()); 
						remainingQty = avlQty - odrQty;
					}
					if(remainingQty >= 0){
						product.setAvbleQuantity(remainingQty);
						value = sqlSession.getMapper(ProductMapper.class).updateProduct(product);
						if(value == 1){
							status.setProductUpdateEntry("Success");
						}
						else {
							status.setProductUpdateEntry("UnSuccess");
						}
						
					}
					else {
						status.setProductUpdateEntryError("Order quantity is greater than avialable quantiry");
					}
				}
				finally{
					lock.unlock();
				}
			}
			prodMap.put(ReportConstants.Sl_No, product.getProductId());
			prodMap.put(ReportConstants.name, product.getProductName());
			prodMap.put(ReportConstants.price, product.getSalePrice());
			prodMap.put(ReportConstants.count, product.getOrderQty());
			prodMap.put(ReportConstants.Total, ""+salePrice);  
			list.add(prodMap);
			insertOrderList.add(custOrder);
			
		}
		/*prodMap.put(ReportConstants.SubTotal, ""+totalSalePrice);  
		prodMap.put(ReportConstants.CustomerName, ""+order.getCustomer().getFirstName()+" "+order.getCustomer().getLastName()); 
		prodMap.put(ReportConstants.Address, ""+address.getAddressLine1()+", "+address.getAddressLine2()+", "+address.getLandMark()+", "+address.getLocality()+", "+
		address.getCity()+", "+address.getState()+", "+address.getCountry()); 
		prodMap.put(ReportConstants.MobileNumber, ""+order.getCustomer().getMobileNumber());  
		prodMap.put(ReportConstants.Email, ""+order.getCustomer().getEmail()); */ 
		try{
			value = sqlSession.getMapper(OrderMapper.class).insertOrder(insertOrderList);
//			value = sqlSession.getMapper(CustomerMapper.class).updateCustomerWallet(customer);
			sqlSession.commit();
		  }finally {
		        if (sqlSession != null) {
		        	sqlSession.close();
		        }
		    }
		
		MailService mailService = new MailService();
		mailService.sendMail(list, address, insertOrderList.get(0).getOrderId(), order, totalSalePrice);
//		mailService.sendMail(list, address, insertOrderList.get(0).getOrderId(), order, totalSalePrice);
//		mailService.sendMail(list, address, insertOrderList.get(0).getOrderId(), order, totalSalePrice);
		return status;
	}

	
	private boolean addressComparision(Address address1, Address address2){
		if(address1.getAddressLine1().equals(address2.getAddressLine1()) && 
				address1.getAddressLine2().equals(address2.getAddressLine2()) &&
						address1.getLandMark().equals(address2.getLandMark()) &&
						address1.getMobileNumber().equals(address2.getMobileNumber()) /*&& 
						address1.getCity().equals(address2.getCity())*/ ){
			return true;
					
				}
		else {
			return false;
		}
	}
	public List<CustOrder> selectOrder(String orderId) {
		List<CustOrder> orderList = new ArrayList<CustOrder>();
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		List<CustomerOrder> orderList1 = sqlSession.getMapper(OrderMapper.class).selectOrder(orderId);
		CustOrder cust = null;
		Address address1 = null;
		List<Product> pList =  null;
		for (Iterator<CustomerOrder> iterator = orderList1.iterator(); iterator.hasNext();) {
			CustomerOrder customerOrder = (CustomerOrder) iterator.next();
			if(cust == null || cust.getAddress() == null || cust.getAddress().getAddressId() == null || !cust.getOrderId().equals(customerOrder.getOrderId())){
				cust = new CustOrder();
				pList = new ArrayList<Product>();
				address1 = new Address();
				cust.setAddress(address1);
				if(cust.getOrderId() == null ){
					cust.setOrderId(customerOrder.getOrderId());
					cust.setOrderStatus(customerOrder.getOrderStatus());
					cust.setOrderQty(customerOrder.getOrderQty());
					cust.setEmail(customerOrder.getEmail());
					SimpleDateFormat sdf = new SimpleDateFormat(ApplicationConstants.DATE_FORMAT);
					String date = sdf.format(customerOrder.getOrderPlaceDate());
					cust.setOrderPlaceDate(date);
					cust.setOrderDeliveryDate(customerOrder.getOrderDeliveryDate());
					cust.setOrderDesc(customerOrder.getOrderDesc());
					cust.setPaymentType(customerOrder.getPaymentType());
					cust.setVenderId(customerOrder.getVenderId());
					Product prod = new Product();
					prod.setDescription(customerOrder.getProductDesc());
					prod.setProductName(customerOrder.getProductName());
					prod.setProductId(customerOrder.getProductId());
					prod.setSalePrice(customerOrder.getProductUnitSellPrice());
					prod.setOrderQty(customerOrder.getOrderQty());
					pList.add(prod);
					Address address = sqlSession.getMapper(AddressMapper.class).selectAddressByAddressId(customerOrder.getAddressId());
					cust.getAddress().setAddressId(address.getAddressId());
					cust.getAddress().setAddressLine1(address.getAddressLine1());
					cust.getAddress().setAddressLine2(address.getAddressLine2());
					cust.getAddress().setCity(address.getCity());
					cust.getAddress().setCountry(address.getCountry());
					cust.getAddress().setEmail(address.getEmail());
					cust.getAddress().setLandMark(address.getLandMark());
					cust.getAddress().setMobileNumber(address.getMobileNumber());
					cust.getAddress().setPinCode(address.getPinCode());;
					cust.getAddress().setState(address.getState());
					cust.setProductList(pList);
					orderList.add(cust);
					Customer customer = sqlSession.getMapper(CustomerMapper.class).selectCustomerByMobileNumber(customerOrder.getMobileNumber());
					cust.setCustomer(customer);
//					customer.setAddressId(address.getAddressId());
					
				}
			}
			else {
				if(cust.getOrderId() != null && cust.getOrderId().equals(customerOrder.getOrderId())){
					Product prod = new Product();
					prod.setDescription(customerOrder.getProductDesc());
					prod.setProductName(customerOrder.getProductName());
					prod.setProductId(customerOrder.getProductId());
					prod.setSalePrice(customerOrder.getProductUnitSellPrice());
					prod.setOrderQty(customerOrder.getOrderQty());
					pList.add(prod);
					cust.setProductList(pList);
				}
			}
			
			}
		if (sqlSession != null) {
        	sqlSession.close();
        }
		return  orderList;
	
	}

	public List<CustOrder> selecOrdertByMobileNumber(String mobileNumber) {
		List<CustOrder> orderList = new ArrayList<CustOrder>();
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		List<CustomerOrder> orderList1 = sqlSession.getMapper(OrderMapper.class).selecOrdertByMobileNumber(mobileNumber);
		CustOrder cust = null;
		Address address1 = null;
		List<Product> pList = null;
		for (Iterator<CustomerOrder> iterator = orderList1.iterator(); iterator.hasNext();) {
			CustomerOrder customerOrder = (CustomerOrder) iterator.next();
			if(cust == null || cust.getAddress() == null || cust.getAddress().getAddressId() == null || !cust.getOrderId().equals(customerOrder.getOrderId())){
				cust = new CustOrder();
				pList = new ArrayList<Product>();
				address1 = new Address();
				cust.setAddress(address1);
				if(cust.getOrderId() == null ){
					cust.setOrderId(customerOrder.getOrderId());
					cust.setOrderStatus(customerOrder.getOrderStatus());
					cust.setOrderQty(customerOrder.getOrderQty());
					cust.setEmail(customerOrder.getEmail());
					SimpleDateFormat sdf = new SimpleDateFormat(ApplicationConstants.DATE_FORMAT);
					String date = sdf.format(customerOrder.getOrderPlaceDate());
					cust.setOrderPlaceDate(date);
					cust.setOrderDeliveryDate(customerOrder.getOrderDeliveryDate());
					cust.setOrderDesc(customerOrder.getOrderDesc());
					cust.setPaymentType(customerOrder.getPaymentType());
					cust.setVenderId(customerOrder.getVenderId());
					Product prod = new Product();
					prod.setDescription(customerOrder.getProductDesc());
					prod.setProductName(customerOrder.getProductName());
					prod.setProductId(customerOrder.getProductId());
					prod.setSalePrice(customerOrder.getProductUnitSellPrice());
					prod.setOrderQty(customerOrder.getOrderQty());
					pList.add(prod);
					Address address = sqlSession.getMapper(AddressMapper.class).selectAddressByAddressId(customerOrder.getAddressId());
					cust.getAddress().setAddressId(address.getAddressId());
					cust.getAddress().setAddressLine1(address.getAddressLine1());
					cust.getAddress().setAddressLine2(address.getAddressLine2());
					cust.getAddress().setCity(address.getCity());
					cust.getAddress().setCountry(address.getCountry());
					cust.getAddress().setEmail(address.getEmail());
					cust.getAddress().setLandMark(address.getLandMark());
					cust.getAddress().setMobileNumber(address.getMobileNumber());
					cust.getAddress().setPinCode(address.getPinCode());;
					cust.getAddress().setState(address.getState());
					Customer customer = sqlSession.getMapper(CustomerMapper.class).selectCustomerByMobileNumber(customerOrder.getMobileNumber());
					cust.setCustomer(customer);
					cust.setProductList(pList);
					orderList.add(cust);
				}
			}
			else {
				if(cust.getOrderId() != null && cust.getOrderId().equals(customerOrder.getOrderId())){
					Product prod = new Product();
					prod.setDescription(customerOrder.getProductDesc());
					prod.setProductName(customerOrder.getProductName());
					prod.setProductId(customerOrder.getProductId());
					prod.setSalePrice(customerOrder.getProductUnitSellPrice());
					prod.setOrderQty(customerOrder.getOrderQty());
					pList.add(prod);
					cust.setProductList(pList);
				}
			}
			
			}
		if (sqlSession != null) {
        	sqlSession.close();
        }
		return  orderList;
	
	}
	private String generateUniqueId() {      
        UUID idOne = UUID.randomUUID();
        String str=""+idOne;        
        int uid=str.hashCode();
        String filterStr=""+uid;
        str=filterStr.replaceAll("-", "");
        return str;
    }
	
	public static void main(String[] args) {
		OrderServiceImpl order = new OrderServiceImpl();
		
		/*List<DamagedProduct> dProductList = new ArrayList<DamagedProduct>();
		DamagedProduct damagedProduct = new DamagedProduct();
		dProductList.add(damagedProduct);
		
		damagedProduct.setProductId("Ord-1273044544");
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
		order.insertDamagedProduct(dProductList);*/
		
		
		
		
		
		/*OrderSelectionParam orderSelectionParam = new OrderSelectionParam();
		CustOrder ord = new CustOrder();
		ord.setOrderId("Ord-1273044544");
		ord.setOrderStatus("Confirmed");
		ord.setPaymentStatus("Paid");
		
		order.updateOrder(ord);*/
		
		
		
		/*SimpleDateFormat sdf = new SimpleDateFormat(ApplicationConstants.SIMPLE_FORMAT);
		Date startDate = null;
		Date endDate = null;
		try {
			startDate = sdf.parse("2015-12-10");
			endDate = sdf.parse("2015-12-14");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		orderSelectionParam.setStartDate(startDate);
		
		orderSelectionParam.setEndDate(endDate);
		orderSelectionParam.setMobileNumber("4684680090");
		order.allOrderByDateMobileNumber(orderSelectionParam);*/
		
		
		
		/*System.out.println("I start here....");
		Customer customer = new Customer();
		customer.setMobileNumber("409680164");
		System.out.println("I start here....");
		order.getAllOrder(customer);
		System.out.println("I end here....");
		Customer customer = new Customer();
		customer.setMobileNumber("4684680090");
		List<CustOrder> orderList = order.getAllOrder(customer);
		ObjectMapper mapperObj = new ObjectMapper();
        
        try {
            // get Employee object as a json string
            String jsonStr = mapperObj.writeValueAsString(orderList);
            System.out.println(jsonStr);
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }*/
		
		Customer customer = new Customer();
		customer.setEmail("abcde@gmail.com");
		customer.setMobileNumber("9987330777");
		customer.setFirstName("Hemanta");
		customer.setLastName("Patasani");
		
		
		/*Address add = new Address();
		add.setAddressLine1("Pimple soudagar");
		add.setAddressLine2("Near Konkan chowk");
		add.setCity("Pune");
		add.setCountry("India");
		add.setEmail(customer.getEmail());
		add.setLandMark("Near Knokan Chowk");
		add.setMobileNumber(customer.getMobileNumber());
		add.setPinCode("441110");
		add.setState("Maharastra");
		CustOrder ord = new CustOrder();
		ord.setAddress(add);
		List<Product> prodList =  new ArrayList<Product>();
		
		Product p = new Product();
		p.setDescription("Cashew");
		p.setProductId("11");
		p.setSalePrice("223");
		p.setOrderQty("5");
		p.setProductName("Rosated Cashew");
		prodList.add(p);
		
		Product p1 = new Product();
		p1.setDescription("Basmati Rice");
		p1.setProductId("10");
		p1.setSalePrice("1100");
		p1.setProductName("Rosated Cashew");
		p1.setOrderQty("3");
		prodList.add(p1);
		ord.setProductList(prodList);
		ord.setOrderDesc("Best Quality Grocery Order");
		ord.setEmail(customer.getEmail());
		
		SimpleDateFormat sdf = new SimpleDateFormat(ApplicationConstants.DATE_FORMAT);
		Date date = null;
		try {
			date = sdf.parse(sdf.format(new Date()));
		} catch (ParseException e) {
			e.printStackTrace();
		}
		ord.setOrderPlaceDate(sdf.format(new Date()));
		
		ord.setPaymentType("Sodexo");
		ord.setCustomer(customer);
		ord.setCouponDiscount("50");
		order.insertOrder(ord);*/
		order.getAllOrder(customer);
		System.out.println("I am done");
		
//		order.selecOrdertByMobileNumber("7777777777");
	//		System.out.println("I end here....");
		
		/*SimpleDateFormat sdf = new SimpleDateFormat(ApplicationConstants.DATE_FORMAT);
		Date date = null;
		try {
			date = sdf.parse(sdf.format(new Date()));
			System.out.println(date);
		} catch (ParseException e) {
			e.printStackTrace();
		}*/
			
		}

}
