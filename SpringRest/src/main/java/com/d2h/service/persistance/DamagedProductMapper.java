/**
 * 
 */
package com.d2h.service.persistance;

import java.util.List;

import com.d2h.service.domain.DamagedProduct;


/**
 * @author Yostna
 *
 */
public interface DamagedProductMapper {
	
	/**
	 * @return all the Address
	 */
	public int insertDamagedProduct(List<DamagedProduct> dProductList);

}
