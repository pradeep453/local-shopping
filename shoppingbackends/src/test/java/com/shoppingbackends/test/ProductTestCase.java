package com.shoppingbackends.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shoppingbackends.dao.ProductDAO;
import com.shoppingbackends.dto.Product;

public class ProductTestCase {
private static AnnotationConfigApplicationContext context;
	
	private static ProductDAO productDAO;
	
	private Product product;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.shoppingbackends");
		context.refresh();
		productDAO = (ProductDAO) context.getBean("productDAO");
	}
	
	
	@Test
	public void testCRUDProduct() {
		// create operation
		product = new Product();
		product.setName("PRIME");
		product.setBrand("SAMSUNG");
		product.setDescription("This is some description for SAMSUNG mobile phones !");
		product.setUnitPrice(25000);
		product.setActive(true);
		product.setCategoryId(1);
		product.setSupplierId(1);
		
		assertEquals("Something went wrong while inserting a new product!",true,productDAO.add(product));
		//reading and updating the category
		product = productDAO.get(1);
		product.setName("samsung galaxy s7");
		//assertEquals("Something went wrong while updating the existing record!",true,productDAO.update(product));
		//assertEquals("Something went wrong while deleting the existing record! ",true,productDAO.delete(product));
		//list
		//assertEquals("Something went wrong while fetching the list of products !",1,productDAO.list().size());
		
	}
	
	@Test
	public void testListActiveProducts() {
		//assertEquals("Something went wrong while fetching the list of products !",0,productDAO.listActiveProducts().size());
	}
	@Test
	public void testListActiveProductsByCategory() {
		//assertEquals("Something went wrong while fetching the list of products !",0,productDAO.listActiveProductsByCategory(1).size());
	}
	
	@Test
	public void testGetLatestActiveProduct() {
		//assertEquals("Something went wrong while fetching the list of products !",0,productDAO.getLatestActiveProducts(3).size());
	}
}
