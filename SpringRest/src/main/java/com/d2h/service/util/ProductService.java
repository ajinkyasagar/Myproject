package com.d2h.service.util;

import java.util.List;

import com.d2h.service.domain.Product;
import com.d2h.service.domain.ProductSelection;
import com.d2h.service.domain.ui.ProductDetail;

/**
 * 
 * @author Hemanta
 */
public interface ProductService {

	/**
	 * @return a list of all {@link Product}s
	 */
	public List<ProductDetail> getAllProducts();
	
	
	public List<ProductDetail> getAllProductsForCache();
	/**
	 * @param Product
	 * @return success
	 */
	public int updateProduct(Product product);

	
	/**
	 * @param Product
	 * @return success
	 */
	public int insertProduct(Product product);

	
	/**
	 * @param Product
	 * @return success
	 */
	public int deleteProduct(Product product);
	
//	public List<ProductCategory> getMobileAllProductCategoty();
	
	/**
	 * @param Product
	 * @return success
	 */
	public ProductDetail selectProductById(String id);
	
	public List<ProductDetail> selectProductByName(String name);
	
	public List<ProductDetail> selectProductByPrice(ProductSelection prodSelection);
	public List<ProductDetail> selectHotSale();
	

}
