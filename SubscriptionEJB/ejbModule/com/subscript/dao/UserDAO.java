package com.subscript.dao;
import javax.ejb.Stateless;
import com.subscript.entities.User;
@Stateless
public class UserDAO extends AbstractDAO<User, Integer> {
	public UserDAO() {
		super(User.class);
		
	}
}
