package com.d2h.service.persistance;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.d2h.service.domain.Product;
import com.d2h.service.domain.ProductSelection;
import com.d2h.service.domain.ui.ProductDetail;

public interface ProductMapper {

	/**
	 * @return all the Products
	 */
	public List<ProductDetail> getAllProducts();
	
	public List<ProductDetail> getAllProductsForCache();
	
	
	/**
	 * @param Product
	 * @return the number of rows affected
	 */
	public int insertProduct(Product product);
	/**
	 * @param Product
	 * @return the number of rows affected
	 */
	public int updateProduct(Product productList);
	
	public List<Product> getAllProductsById(List<Product> productList);
	public List<ProductDetail> selectProductByPrice( ProductSelection prodSelection);
	public List<ProductDetail> selectHotSale();
	
	/**
	 * @param Product
	 * @return the number of rows affected
	 */
	public int deleteProduct(Product product);
	
	/**
	 * @param Product
	 * @return the number of rows affected
	 */
	public ProductDetail selectProductById(@Param("productId") String productId);
	
	/**
	 * @param Product
	 * @return the number of rows affected
	 */
	public List<ProductDetail> selectProductByName(@Param("productCatagory") String productCatagory);
}
