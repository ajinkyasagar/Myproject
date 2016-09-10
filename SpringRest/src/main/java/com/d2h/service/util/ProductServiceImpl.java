package com.d2h.service.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.d2h.service.domain.Product;
import com.d2h.service.domain.ProductSelection;
import com.d2h.service.domain.ui.ProductDetail;
import com.d2h.service.persistance.ProductMapper;

@Service("productService")
public class ProductServiceImpl implements ProductService{

//	private int itemsTosend = 500;
	private static ProductMapper getMapper() {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		return sqlSession.getMapper(ProductMapper.class);
	}

	public List<ProductDetail> getAllProducts() {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		List<ProductDetail> productList =  sqlSession.getMapper(ProductMapper.class).getAllProducts();
		 if (sqlSession != null) {
	        	sqlSession.close();
	        }
		return  productList;
	}
	
	public List<ProductDetail> getAllProductsForCache() {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		List<ProductDetail> productList =  sqlSession.getMapper(ProductMapper.class).getAllProductsForCache();
		 if (sqlSession != null) {
	        	sqlSession.close();
	        }
		return  productList;
	
	}
	
	/*private Map<String, List<Product>> productMap(List<Product> prodList){
		Map<String, List<Product>> prodMap = new TreeMap<String, List<Product>>();
		ArrayList<Product> categoryList = null;
		
		for (Iterator<Product> iterator = prodList.iterator(); iterator.hasNext();) {
			Product product = (Product) iterator.next();
			if(prodMap.get(product.getProductCatagory()) == null){
				categoryList = new ArrayList<Product>();
				categoryList.add(product);
				prodMap.put(product.getProductCatagory(), categoryList);
			}
			else {
				prodMap.get(product.getProductCatagory()).add(product);
			}
		}
		return prodMap;
	}
	
	public Map<String, List<Product>> dataCache(List<Product> prodList, int from){
//		List<Map.Entry<String, List<Product>>> entryList =  new ArrayList<Map.Entry<String, List<Product>>>(mapData.entrySet());

//		for (Map.Entry<String, List<Product>> entry : entryList.subList(0, 10)) {
//		    List<Product> list = entry.getValue();
		    // Display list of people in City
//		}
		
		List<Product> prodSubList = prodList.subList(from, from + itemsTosend);
		Map<String, List<Product>> prodMap = productMap(prodSubList); 
		return prodMap;
	}*/
	

	public int updateProduct(Product product) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		int value = sqlSession.getMapper(ProductMapper.class).updateProduct(product);
		try{
			sqlSession.commit();
		}finally{
			if (sqlSession != null) {
	        	sqlSession.close();
	        }
		}
		
		return value;
	}

	public int insertProduct(Product product) {
		getMapper().insertProduct(product);
		return 0;
	}

	public int deleteProduct(Product product) {
		return 0;
	}

	public ProductDetail selectProductById(String id) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		ProductDetail product = sqlSession.getMapper(ProductMapper.class).selectProductById(id);
		if (sqlSession != null) {
        	sqlSession.close();
        }
		return product;
	}

	public List<ProductDetail> selectProductByName(String name) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		List<ProductDetail> productList =  sqlSession.getMapper(ProductMapper.class).selectProductByName(name);
		if (sqlSession != null) {
        	sqlSession.close();
        }
		return productList;
	}
	
	public List<ProductDetail> selectProductByPrice( ProductSelection prodSelection) {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		List<ProductDetail> productList =  sqlSession.getMapper(ProductMapper.class).selectProductByPrice(prodSelection);
		if (sqlSession != null) {
        	sqlSession.close();
        }
		return productList;
	}
	
	public List<ProductDetail> selectHotSale() {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		List<ProductDetail> productList =  sqlSession.getMapper(ProductMapper.class).selectHotSale();
		if (sqlSession != null) {
        	sqlSession.close();
        }
		return productList;
	}

	/*public List<ProductCategory> getMobileAllProductCategoty() {
		
		List<Product> products = getMapper().getAllProducts();
		List<ProductCategory> categoryList =  new ArrayList<ProductCategory>();
		for (Iterator iterator = products.iterator(); iterator.hasNext();) {
			Product product = (Product) iterator.next();
			ProductCategory pCategory =  new ProductCategory();
			pCategory.setDiscount(product.getDiscounts());
			pCategory.setProductCategoty(product.getProductSubCatagory());
			pCategory.setProductDesc(product.getDescription());
			pCategory.setProductUrl(product.getUrl());
			categoryList.add(pCategory);
		}
		return categoryList;
	}*/

	/*public int insertCustomer(Customer customer) {
		int value = getMapper().insertCustomer(customer);
		if(value == 1){
			
		}
		else {
			
		}
		return value;
	}

	public int updateCustomer(Customer customer) {
		return getMapper().updateCustomer(customer);
	}

	public int deleteCustomer(Customer customer) {
		return getMapper().deleteCustomer(customer);
	}

	public Customer selectCustomerByMobileNumber(int mobileNumber) {
		return getMapper().selectCustomerByMobileNumber(mobileNumber);
	}

	public Customer selectCustomerByUserId(String userId) {
		return getMapper().selectCustomerByUserId(userId);
	}*/
	
	public static void main(String[] args) {
		/*List<Product> pList = new ArrayList<Product>();
		Product product = new Product();
		product.setProductId("27");
		product.setAvbleQuantity(2);
		pList.add(product);
			Product product1 = new Product();
			product1.setProductId("26");
			product1.setAvbleQuantity(2);
			pList.add(product1);
			
			Map<String, List<String>> mapData = new HashMap<String, List<String>>();
			List<String> strList = new ArrayList<String>();
			strList.add("Hemanta");
			strList.add("Titi");
			strList.add("Himakashi");
			strList.add("Hamshini");
			mapData.put("name", strList);
			strList = new ArrayList<String>();
			strList.add("fdsgdg");
			strList.add("jyiulkl");
			strList.add("dgdfjj");
			mapData.put("asdsf", strList);
			
			strList = new ArrayList<String>();
			strList.add("cow");
			strList.add("dog");
			strList.add("cat");
			mapData.put("animal", strList);
			

			List<Map.Entry<String, List<String>>> entryList =  new ArrayList<Map.Entry<String, List<String>>>(mapData.entrySet());

			for (Map.Entry<String, List<String>> entry : entryList.subList(2, 3)) {
			    List<String> list = entry.getValue();
			    // Display list of people in City
			    System.out.println(list);
			}
//		new ProductServiceImpl().updateProduct(product);
		System.out.println("22+2 : ");*/
		List<ProductDetail> plist = new ProductServiceImpl().getAllProducts();
		System.out.println("plist "+plist.size());
		System.out.println("subList "+plist.subList(0, 200).size());
		System.out.println(plist.subList(0, 20));
		
		
		
	}

	
}
