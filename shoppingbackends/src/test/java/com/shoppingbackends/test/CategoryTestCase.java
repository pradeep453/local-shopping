package com.shoppingbackends.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shoppingbackends.dao.CategoryDAO;
import com.shoppingbackends.dto.Category;

public class CategoryTestCase {
	private static AnnotationConfigApplicationContext context;
	
	private static CategoryDAO categoryDAO;
	
	private Category category;
	
	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.shoppingbackends");
		context.refresh();
		categoryDAO = (CategoryDAO) context.getBean("categoryDAO");
	}
	
	
	@Test
	public void testAddCategory() {
		Category category = new Category();

		category.setName("FootWear");
		category.setDescription("This is some description for footwear !");
		category.setImageURL("CAT_6.png");
		
		 assertEquals("Successfully added a category inside the table !",true,categoryDAO.add(category));
	}
	
	
	@Test
	public void testGetCategory() {
		category = categoryDAO.get(3);
		category.setName("Lapi");
		//assertEquals("Successfully fetched a single category from the table !","Laptop",category.getName());
		//assertEquals("Successfully update a single category from the table !",true,categoryDAO.update(category));
	}
	
	@Test
	public void testDeleteCategory() {
		category = categoryDAO.get(3);
		//assertEquals("Successfully fetched a single category from the table !","Laptop",category.getName());
		//assertEquals("Successfully update a single category from the table !",true,categoryDAO.update(category));
		assertEquals("Successfully delete a single category from the table !",true,categoryDAO.delete(category));
	}
	
	@Test
	public void testListCategory() {
		//assertEquals("Successfully fetch the list of categories from the table  !",2,categoryDAO.list().size());
	}
	
	
	@Test
	public void testCRUDCategory() {
		// add operation
		Category category = new Category();

		category.setName("Medicine");
		category.setDescription("This is some description for Medicine !");
		category.setImageURL("CAT_4.png");
	//	assertEquals("Successfully added a category inside the table !",true,categoryDAO.add(category));
		
	   category = new Category();

		category.setName("roys");
		category.setDescription("This is some description for Toys !");
		category.setImageURL("CAT_5.png");
	//	assertEquals("Successfully added a category inside the table !",true,categoryDAO.add(category));
		

		// fetching and updating the category
		category = categoryDAO.get(5);
		category.setName("Toys");
	//	assertEquals("Successfully update a single category from the table !",true,categoryDAO.update(category));
		
		// delete the category 
		
		category = categoryDAO.get(4);
	//	assertEquals("Successfully delete a single category from the table !",true,categoryDAO.delete(category));
		
		//fetching the list
	//	assertEquals("Successfully fetch the list of categories from the table  !",3,categoryDAO.list().size());
		
		
	}
	
	
}
