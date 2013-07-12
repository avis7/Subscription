package com.subscript.dao;


import javax.ejb.Stateless;

import com.subscript.entities.Subscription;
@Stateless
public class SubscriptionDAO extends AbstractDAO<Subscription, Integer> {
	public SubscriptionDAO()
    {
	super(Subscription.class);
    }
}
