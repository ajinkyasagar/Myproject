/**
 * 
 */
package com.d2h.service.util;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.d2h.service.domain.CustOrder;
import com.d2h.service.domain.Customer;
import com.d2h.service.domain.CustomerOrder;
import com.d2h.service.domain.OrderSelectionParam;
import com.d2h.service.domain.Status;
import com.d2h.service.domain.ui.AdminOrderDetails;

/**
 * @author Yostna
 *
 */
@Component
public interface OrderService {
	
	/**
	 * @return a list of all {@link CustOrder}s
	 */
	public List<CustOrder> getAllOrder(Customer customer);
	/**
	 * @param CustOrder
	 * @return success
	 */
	public int updateOrder(CustOrder order);

	
	/**
	 * @param CustOrder
	 * @return success
	 */
	public Status insertOrder(CustOrder order);

	
	/**
	 * @param Order
	 * @return success
	 */
//	public int deleteOrder(Order order);
	
	/**
	 * @param CustOrder
	 * @return success
	 */
	public List<CustOrder> selectOrder(String  orderId);
	
	public List<AdminOrderDetails> allOrderFromDateToDate(OrderSelectionParam orderSelection);
	public List<AdminOrderDetails> allVendorOrdersByVenderId(OrderSelectionParam orderSelection);
	
	public List<AdminOrderDetails> allVendorByFromToDate(OrderSelectionParam orderSelection);
	public List<AdminOrderDetails> allVendorOrdersByStatus(OrderSelectionParam orderSelection);
	public List<AdminOrderDetails> allOrderByDateMobileNumber(OrderSelectionParam orderSelection);
	public List<CustomerOrder> selectOrdertByOrderId(String orderId);
	public List<CustOrder> selecOrdertByMobileNumber(String mobileNumber);

	
}
