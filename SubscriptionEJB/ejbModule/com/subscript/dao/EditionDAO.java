package com.subscript.dao;

import javax.ejb.Stateless;

import com.subscript.entities.Edition;



@Stateless
public class EditionDAO extends AbstractDAO<Edition, Integer>{

    public EditionDAO()
    {
	super(Edition.class);
    }
}
