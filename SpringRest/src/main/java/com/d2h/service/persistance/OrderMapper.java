/**
 * 
 */
package com.d2h.service.persistance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.d2h.service.domain.CustOrder;
import com.d2h.service.domain.Customer;
import com.d2h.service.domain.CustomerOrder;
import com.d2h.service.domain.OrderSelectionParam;
import com.d2h.service.domain.ui.AdminOrderDetails;

/**
 * @author Yostna
 *
 */
public interface OrderMapper {
	
	/**
	 * @return all the Order
	 */
	public List<CustomerOrder> getAllOrder(Customer customer);
	
	/**
	 * @param CustOrder
	 * @return the number of rows affected
	 */
	public int insertOrder(List<CustomerOrder> order);
	
	/**
	 * @param CustOrder
	 * @return the number of rows affected
	 */
	public int updateOrder(CustOrder order);
	
	/**
	 * @param CustOrder
	 * @return the number of rows affected
	 */
	public List<CustomerOrder> selectOrder(@Param("orderId") String orderId);
	
	public List<CustomerOrder> allOrderFromDateToDate(OrderSelectionParam orderSelection);
	
	public List<CustomerOrder> allOrderByDateMobileNumber(OrderSelectionParam orderSelection);
	
	public List<CustomerOrder> selecOrdertByMobileNumber(@Param("mobileNumber") String mobileNumber);
	public List<CustomerOrder> selectOrdertByOrderId(@Param("orderId") String orderId);
	public List<CustomerOrder> getAllOrdersById(CustomerOrder order);
	
	public List<AdminOrderDetails> allVendorOrdersByVenderId(OrderSelectionParam orderSelection);
	public List<AdminOrderDetails> allVendorByFromToDate(OrderSelectionParam orderSelection);
	public List<AdminOrderDetails> allVendorOrdersByStatus(OrderSelectionParam orderSelection);
	
	

}
