/**
 * 
 */
package com.d2h.service.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.d2h.service.domain.CancelReturnProduct;
import com.d2h.service.domain.CustOrder;
import com.d2h.service.domain.Customer;
import com.d2h.service.domain.DamagedProduct;
import com.d2h.service.domain.OrderSelectionParam;
import com.d2h.service.domain.Status;
import com.d2h.service.domain.ui.AdminOrderDetails;
import com.d2h.service.util.CancelReturnProductService;
import com.d2h.service.util.DamagedProductService;
import com.d2h.service.util.OrderService;

/**
 * @author Yostna
 *
 */
@Controller
//@RequestMapping("/OrderDetails")
public class OrderController {
	@Autowired
	private OrderService orderService;
	
	@Autowired
	private DamagedProductService damagedProductService;
	
	@Autowired
	private CancelReturnProductService cancelReturnProductService;
	
	
	
	@RequestMapping(value = "/orders", method = RequestMethod.POST)
	public @ResponseBody List<CustOrder> getAllOrders(@RequestBody Customer customer) {
		return orderService.getAllOrder(customer);
	}
	
	@RequestMapping(value = "/ordersByVenderId", method = RequestMethod.POST)
	public @ResponseBody List<AdminOrderDetails> allVendorOrdersByVenderId(@RequestBody OrderSelectionParam orderByVenderId) {
		return orderService.allVendorOrdersByVenderId(orderByVenderId);
	}
	
	@RequestMapping(value = "/ordersByDate", method = RequestMethod.POST)
	public @ResponseBody List<AdminOrderDetails> allVendorByFromToDate(@RequestBody OrderSelectionParam orderByDate) {
		return orderService.allVendorByFromToDate(orderByDate);
	}
	
	@RequestMapping(value = "/ordersByStatus", method = RequestMethod.POST)
	public @ResponseBody List<AdminOrderDetails> allVendorOrdersByStatus(@RequestBody OrderSelectionParam orderByStatus) {
		return orderService.allVendorOrdersByStatus(orderByStatus);
	}
	
	@RequestMapping(value = "/ordersByDates", method = RequestMethod.POST)
	public @ResponseBody List<AdminOrderDetails> allOrderFromDateToDate(@RequestBody OrderSelectionParam orderSelectionParam) {
		return orderService.allOrderFromDateToDate(orderSelectionParam);
	}
	
	@RequestMapping(value = "/ordersByDateMobileNumber", method = RequestMethod.POST)
	public @ResponseBody List<AdminOrderDetails> allOrderByDateMobileNumber(@RequestBody OrderSelectionParam orderSelectionParam) {
		return orderService.allOrderByDateMobileNumber(orderSelectionParam);
	}
	
	@RequestMapping(value = "/selectid/{orderId}", method = RequestMethod.GET)
	public @ResponseBody List<CustOrder> selectOrder(@PathVariable("orderId") String orderId) {
		return orderService.selectOrder(orderId);
	}
	
	@RequestMapping(value = "/selectno/{mobileNumber}", method = RequestMethod.GET)
	public @ResponseBody List<CustOrder> selectOrderByMobileNumber(@PathVariable("mobileNumber") String mobileNumber) {
		return orderService.selecOrdertByMobileNumber(mobileNumber);
	}
	
	@RequestMapping(value = "/insertOrder", method = RequestMethod.POST)
	public @ResponseBody Status insertOrder(@RequestBody CustOrder order) {
		return orderService.insertOrder(order);
	}
	
/*	@RequestMapping(value = "/delete", method = RequestMethod.PUT)
	public int deleteUser(@RequestBody  Order Order) {
		return orderService.deleteOrder(Order);
	}
	*/
	@RequestMapping(value = "/updateOrder", method = RequestMethod.POST)
	public @ResponseBody int updateOrder(@RequestBody CustOrder order) {
		return orderService.updateOrder(order);
	}
	
	@RequestMapping(value = "/damagedProduct", method = RequestMethod.POST)
	public @ResponseBody int damagedProduct(@RequestBody List<DamagedProduct> dProductList) {
		return damagedProductService.insertDamagedProduct(dProductList);
	}
	
	@RequestMapping(value = "/cancelReturn", method = RequestMethod.POST)
	public @ResponseBody int cancelReturn(@RequestBody CancelReturnProduct cancelReturnList) {
		return cancelReturnProductService.updateCancelReturn(cancelReturnList);
	}
}
