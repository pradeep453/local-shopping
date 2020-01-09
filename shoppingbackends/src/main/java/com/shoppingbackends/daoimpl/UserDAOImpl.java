package com.shoppingbackends.daoimpl;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.shoppingbackends.dao.UserDAO;
import com.shoppingbackends.dto.User;


@Repository("userDAO")
@Transactional
public class UserDAOImpl implements UserDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public boolean add(User user) {
		try {
			// add the category to the database table 
			sessionFactory.getCurrentSession().persist(user);
			return true;
		} catch(Exception ex) {
			ex.printStackTrace();
			return false;
		}
	}

}
