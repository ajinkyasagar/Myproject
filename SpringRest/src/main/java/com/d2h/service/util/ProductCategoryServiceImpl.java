package com.d2h.service.util;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Service;

import com.d2h.service.domain.ProductCategory;
import com.d2h.service.persistance.ProductCategoryMapper;

@Service("productCategoryService")
public class ProductCategoryServiceImpl implements ProductCategoryService{

	
	private static ProductCategoryMapper getMapper() {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		return sqlSession.getMapper(ProductCategoryMapper.class);
	}

	public List<ProductCategory> getAllProductCategory() {
		SqlSession sqlSession = ConnectionFactory.getSqlSessionFactory().openSession();
		List<ProductCategory> categotyList = sqlSession.getMapper(ProductCategoryMapper.class).getAllProductCategory();
		if (sqlSession != null) {
        	sqlSession.close();
        }
		return categotyList;
	}


	/*public List<ProductCategory> getAllProducts() {
		// TODO Auto-generated method stub
		 * if (sqlSession != null) {
	        	sqlSession.close();
	        }
		return  getMapper().getAllProducts();
	}

	public int updateProduct(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int insertProduct(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	public int deleteProduct(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	public Product selectProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public Product selectProductByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<ProductCategory> getMobileAllProductCategoty() {
		
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

	
}
