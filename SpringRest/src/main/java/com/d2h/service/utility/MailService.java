/**
 * 
 */
package com.d2h.service.utility;

import java.util.ArrayList;
import java.util.Map;

import com.d2h.service.domain.Address;
import com.d2h.service.domain.CustOrder;
import com.d2h.service.report.OrderInvoice;

/**
 * @author Hemant
 *
 */
public class MailService {
	public void sendMail(ArrayList<Map<String, String>> list, Address address, String orderId, CustOrder order, double totalSalePrice ){
		OrderInvoice orderInvoice = new OrderInvoice();
		orderInvoice.mailServiceHtml(list, address, orderId, order, totalSalePrice);
	}

}
