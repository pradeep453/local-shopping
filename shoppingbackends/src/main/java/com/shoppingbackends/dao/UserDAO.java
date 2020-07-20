package com.shoppingbackends.dao;

import java.util.List;

import com.shoppingbackends.dto.Address;
import com.shoppingbackends.dto.Cart;
import com.shoppingbackends.dto.User;

public interface UserDAO {
	
	
	// add an user
	boolean addUser(User user);
	User getByEmail(String email);

	// add an address
	boolean addAddress(Address address);
	
	Address getBillingAddress(User user);
	List<Address> listShippingAddress(User user);
	
	// update a cart
	boolean updateCart(Cart cart);
}
