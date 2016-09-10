/**
 * 
 */
package com.d2h.service.persistance;

import java.util.List;

import com.d2h.service.domain.ProductCategory;

/**
 * @author Hemanta
 *
 */
public interface ProductCategoryMapper {

	/**
	 * @return all the Products
	 */
	public List<ProductCategory> getAllProductCategory();
}
