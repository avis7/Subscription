package com.subscript.dao;


import javax.ejb.Stateless;

import com.subscript.entities.Payment;
@Stateless
public class PaymentDAO extends AbstractDAO<Payment, Integer> {
	public PaymentDAO()
    {
	super(Payment.class);
    }
}
