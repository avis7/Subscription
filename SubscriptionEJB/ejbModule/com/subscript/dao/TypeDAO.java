package com.subscript.dao;


import javax.ejb.Stateless;

import com.subscript.entities.Type;

@Stateless
public class TypeDAO extends AbstractDAO<Type, Integer> {

	public TypeDAO() {
		super(Type.class);
		
	}

}
