package com.shoppingbackends.test;

import static org.junit.Assert.assertEquals;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.shoppingbackends.dao.UserDAO;
import com.shoppingbackends.dto.Address;
import com.shoppingbackends.dto.Cart;
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
	
	
	/*
	 * @Test public void testUpdateCart() {
	 * 
	 * Cart cart = null;
	 * 
	 * // fetch the user by its email user = userDAO.getByEmail("user@test.com");
	 * 
	 * // get the cart of the user cart = user.getCart();
	 * 
	 * cart.setGrandTotal(5555);
	 * 
	 * cart.setCartLines(2);
	 * 
	 * assertEquals("Failed to update the cart !", true,userDAO.updateCart(cart));
	 * 
	 * }
	 */
	
	/*
	 * @Test public void testAddUser() {
	 * 
	 * 
	 * User user = new User(); user.setContactNumber("9876543210");
	 * user.setFirstName("Rama"); user.setLastName("Krishna");
	 * user.setPassword("test"); user.setRole("USER");
	 * user.setEmail("user@test.com");
	 * 
	 * // add the user
	 * 
	 * 
	 * 
	 * 
	 * 
	 * if(user.getRole().equals("USER")) { // create a cart for this user
	 * 
	 * Cart cart = new Cart(); cart.setUser(user);
	 * 
	 * // add the cart
	 * 
	 * //attach cart with the user user.setCart(cart);
	 * 
	 * 
	 * } assertEquals("Failed to add user !",true,userDAO.addUser(user));
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	 
	
	/*
	 * @Test public void testAddUser() { User user = new User();
	 * user.setContactNumber("9876543210"); user.setFirstName("Rama");
	 * user.setLastName("Krishna"); user.setPassword("test"); user.setRole("USER");
	 * user.setEmail("user@test.com");
	 * 
	 * // add the user
	 * 
	 * assertEquals("Failed to add user !",true,userDAO.addUser(user));
	 * 
	 * 
	 * 
	 * Address address = new Address();
	 * address.setAddressLineOne("101/B Rama Nivas");
	 * address.setAddressLineTwo("Kujendri"); address.setCity("Gunupur");
	 * address.setCountry("India"); address.setPostalCode("765023"); // set billing
	 * to true address.setBilling(true);
	 * 
	 * // link the user with the address using user id
	 * address.setUserId(user.getId());
	 * 
	 * 
	 * // add the address
	 * 
	 * assertEquals("Failed to add address!",true,userDAO.addAddress(address));
	 * 
	 * if(user.getRole().equals("USER")) { // create a cart for this user
	 * 
	 * Cart cart = new Cart(); cart.setUser(user);
	 * 
	 * // add the cart
	 * 
	 * assertEquals("Failed to add cart!",true,userDAO.addCart(cart)); // add a
	 * shipping address for this user
	 * 
	 * 
	 * address = new Address(); address.setAddressLineOne("JayaRamNagar");
	 * address.setAddressLineTwo("Hijewadi"); address.setCity("Pune");
	 * address.setCountry("India"); address.setPostalCode("411057"); // set billing
	 * to true address.setShipping(true);
	 * 
	 * // link the user with the address using user id
	 * address.setUserId(user.getId());
	 * 
	 * 
	 * // add the shipping address
	 * 
	 * assertEquals("Failed to add shipping address!",true,userDAO.addAddress(
	 * address));
	 * 
	 * }
	 * 
	 * 
	 * 
	 * 
	 * 
	 * }
	 */
	
	
	/*
	 * @Test public void testAddAddress() {
	 * 
	 * // we need to add an user
	 * 
	 * User user = new User(); user.setContactNumber("9876543210");
	 * user.setFirstName("Rama"); user.setLastName("Krishna");
	 * user.setPassword("test"); user.setRole("USER");
	 * user.setEmail("user@test.com");
	 * 
	 * assertEquals("Failed to add user !",true,userDAO.addUser(user));
	 * 
	 * // we are going to add the address
	 * 
	 * Address address = new Address();
	 * address.setAddressLineOne("101/B Rama Nivas");
	 * address.setAddressLineTwo("Kujendri"); address.setCity("Gunupur");
	 * address.setCountry("India"); address.setPostalCode("765023"); // set billing
	 * to true address.setBilling(true);
	 * 
	 * // attached the user to the address address.setUser(user);
	 * 
	 * assertEquals("Failed to add billing address!",true,userDAO.addAddress(address
	 * ));
	 * 
	 * 
	 * // we are also going to add the shipping address
	 * 
	 * address = new Address(); address.setAddressLineOne("JayaRamNagar");
	 * address.setAddressLineTwo("Hijewadi"); address.setCity("Pune");
	 * address.setCountry("India"); address.setPostalCode("411057"); // set billing
	 * to true address.setShipping(true);
	 * 
	 * // attached the user to the address address.setUser(user);
	 * 
	 * assertEquals("Failed to add shipping address!",true,userDAO.addAddress(
	 * address));
	 * 
	 * 
	 * }
	 */
	
	
	/*
	 * @Test public void testAddAddress() {
	 * 
	 * User user = userDAO.getByEmail("user@test.com");
	 * 
	 * // we are also going to add the shipping address Address address = new
	 * Address(); address = new Address();
	 * address.setAddressLineOne("JayaRamNagar"); 
	 * address.setAddressLineTwo("Patia"); address.setCity("Bhubaneswar");
	 * address.setCountry("India"); address.setPostalCode("500032"); // set billing
	 * to true address.setShipping(true); // attached the user to the address
	 * address.setUser(user);
	 * assertEquals("Failed to add shipping address!",true,userDAO.addAddress(
	 * address));
	 * 
	 * }
	 */
	
	
	@Test
	public void testGetAddress() {
		
		user = userDAO.getByEmail("user@test.com");  
		
		assertEquals("Failed to fetch the list of address and size does not match !",3,userDAO.listShippingAddress(user).size());
		
		
		assertEquals("Failed to fetch the billing address and size does not match !","Gunupur",userDAO.getBillingAddress(user).getCity());
	}
}