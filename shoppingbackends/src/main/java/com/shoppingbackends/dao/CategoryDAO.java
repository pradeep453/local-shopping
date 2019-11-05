package com.shoppingbackends.dao;

import java.util.List;

import com.shoppingbackends.dto.Category;

public interface CategoryDAO {

	
	List<Category> list();
	Category get(int id);
}
