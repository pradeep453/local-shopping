package com.shoppingbackends.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shoppingbackends.dao.UserDAO;
import com.shoppingbackends.dto.User;

public class UserTestCase {

	private static AnnotationConfigApplicationContext context;

	private static UserDAO userDAO;

	private User user;

	@BeforeClass
	public static void init() {
		context = new AnnotationConfigApplicationContext();
		context.scan("com.shoppingbackends");
		context.refresh();
		userDAO = (UserDAO) context.getBean("userDAO");

	}
	
	@Test
	public void testAddUser() {
		User user = new User();
		user.setContactNumber("9876543210");
		user.setEnabled(true);
		user.setFirstName("Jhon");
		user.setLastName("Sena");
		user.setPassword("om");
		user.setRole("supllier");
		user.setEmail("abc@test.com");

		 assertEquals("Successfully added a category inside the table !",true,userDAO.add(user));
	}
}