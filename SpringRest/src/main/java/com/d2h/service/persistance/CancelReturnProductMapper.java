/**
 * 
 */
package com.d2h.service.persistance;

import com.d2h.service.domain.CustomerOrder;


/**
 * @author Yostna
 *
 */
public interface CancelReturnProductMapper {
	
	/**
	 * @return all the Address
	 */
	public int updateCancelReturn(CustomerOrder cancelReturnProductList);

}
