package com.d2h.service.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.d2h.service.domain.Product;
import com.d2h.service.domain.ProductCategory;
import com.d2h.service.domain.ProductSelection;
import com.d2h.service.domain.ui.ProductDetail;
import com.d2h.service.util.ProductCategoryService;
import com.d2h.service.util.ProductService;
import com.d2h.service.util.ProductServiceImpl;

@Controller
//@RequestMapping("/productDetails")
public class ProductController {
	
	private int itemsTosend = 50;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private ProductCategoryService productCategoryService;
	
	
	@RequestMapping(value = "/products/{from}", method = RequestMethod.GET)
	public @ResponseBody List<ProductDetail> getAllProducts(@PathVariable("from") int from) {
		List<ProductDetail> prodDetails = productService.getAllProducts().subList(from, from + itemsTosend);
		return prodDetails;
	}
	
	@RequestMapping(value = "/allProducts", method = RequestMethod.GET)
	public @ResponseBody List<ProductDetail> getAllProductsForCache() {
		return productService.getAllProducts();
	}
	
	
	
	@RequestMapping(value = "/productMap", method = RequestMethod.GET)
	public @ResponseBody Map<String, List<ProductDetail>> getAllProductsByCategory() {
//		Map<String, List<Product>> prodMap = productMap(productService.getAllProducts());
		Map<String, List<ProductDetail>> prodMap = productMap(new ProductServiceImpl().getAllProducts());
		return prodMap;
	}
	

	@RequestMapping(value = "/mproducts", method = RequestMethod.GET)
	public @ResponseBody List<ProductCategory> getAllProductCategory() {
		return productCategoryService.getAllProductCategory();
	}
	
	@RequestMapping(value = "/selectCatagory/{categoryName}", method = RequestMethod.GET)
	public  @ResponseBody List<ProductDetail> selectProductByName(@PathVariable("categoryName") String categoryName) {
		return productService.selectProductByName(categoryName);
	}
	
	@RequestMapping(value = "/selectCatagory/{categoryByName}/{itemsRequested}", method = RequestMethod.GET)
	public  @ResponseBody List<ProductDetail> selectProductByCatName(@PathVariable("categoryByName") String categoryByName, @PathVariable("itemsRequested") int itemsRequested) {
		List<ProductDetail> productlist=productService.selectProductByName(categoryByName);
		if((itemsRequested + itemsTosend)>productlist.size())
		{
			return productlist.subList(itemsRequested, productlist.size());
		}else
		{
			return productlist.subList(itemsRequested, itemsRequested + itemsTosend);
		}
			
	}
	
	
	@RequestMapping(value = "/selectId/{productCode}", method = RequestMethod.GET)
	public @ResponseBody ProductDetail selectProductById(@PathVariable("productCode") String productCode) {
		return productService.selectProductById(productCode);
	}
	
	@RequestMapping(value = "/priceRange", method = RequestMethod.GET)
	public @ResponseBody List<ProductDetail> selectProductByPrice(@RequestBody ProductSelection productCode) {
		return productService.selectProductByPrice(productCode);
	}
	
	@RequestMapping(value = "/priceRangeList", method = RequestMethod.GET)
	public @ResponseBody List<ProductDetail> selectProductByPriceByLimit(@RequestBody ProductSelection productCode, @PathVariable("from") int from) {
		return productService.selectProductByPrice(productCode).subList(from, from + itemsTosend);
	}
	
	@RequestMapping(value = "/hotSell", method = RequestMethod.GET)
	public @ResponseBody List<ProductDetail> selectHotSell() {
		return productService.selectHotSale();
	}
	
	@RequestMapping(value = "/hotSellList", method = RequestMethod.GET)
	public @ResponseBody List<ProductDetail> selectHotSellRange(@PathVariable("from") int from) {
		return productService.selectHotSale().subList(from, from + itemsTosend);
	}
	
	
	/*@RequestMapping(value = "/products", method = RequestMethod.GET)
	public List<Product> getAllProducts() {
		return productService.getAllProducts();
	}*/
	
	/*@RequestMapping(value = "/select/{id}", method = RequestMethod.GET)
	public Product selectProductById(@PathVariable("id") int id) {
		return productService.selectProductById(id);
	}
	
	@RequestMapping(value = "/select/{name}", method = RequestMethod.GET)
	public Product selectProductByName(@PathVariable("name") String name) {
		return productService.selectProductByName(name);
	}*/
	
	@RequestMapping(value = "/insertProduct", method = RequestMethod.POST)
	public int insertProduct(@RequestBody Product product) {
		product.setProductId("Prd-"+generateUniqueId());
		product.setProductEntryDate(new SimpleDateFormat("dd-M-yyyy hh:mm:ss").format(new Date()));
		return productService.insertProduct(product);
	}
	/*
	
	@RequestMapping(value = "/delete", method = RequestMethod.PUT)
	public int deleteProduct(@RequestBody  Product Product) {
		return productService.deleteProduct(Product);
	}
	
	@RequestMapping(value = "/update", method = RequestMethod.GET)
	public int updateProduct(@RequestBody Product Product) {
		return productService.updateProduct(Product);
	}*/
	
	public Map<String, List<ProductDetail>> dataCache(List<ProductDetail> prodList, int from){
		List<ProductDetail> prodSubList = prodList.subList(from, from + itemsTosend);
		Map<String, List<ProductDetail>> prodMap = productMap(prodSubList); 
		return prodMap;
	}
	
	
	private Map<String, List<ProductDetail>> productMap(List<ProductDetail> prodList){
		Map<String, List<ProductDetail>> prodMap = new HashMap<String, List<ProductDetail>>();
		ArrayList<ProductDetail> categoryList = null;
		
		for (Iterator<ProductDetail> iterator = prodList.iterator(); iterator.hasNext();) {
			ProductDetail product = (ProductDetail) iterator.next();
			if(prodMap.get(product.getProductCatagory()) == null){
				categoryList = new ArrayList<ProductDetail>();
				categoryList.add(product);
				prodMap.put(product.getProductCatagory(), categoryList);
			}
			else {
				prodMap.get(product.getProductCatagory()).add(product);
			}
		}
		return prodMap;
	}
	
	private String generateUniqueId() {      
        UUID idOne = UUID.randomUUID();
        String str=""+idOne;        
        int uid=str.hashCode();
        String filterStr=""+uid;
        str=filterStr.replaceAll("-", "");
        return str;
    }
	
	public static void main(String[] args) {
		/*List<ProductDetail> plist = new ProductController().getAllProducts();
		List<ProductDetail> plist1 = plist.subList(0, 200);
		System.out.println(plist1.size());*/
		
	}
	
}
