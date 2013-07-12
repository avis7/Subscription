package com.subscript.dao;

import java.io.Serializable;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.PersistenceUnit;

public abstract class AbstractDAO<T, PK extends Serializable> implements
		GenericDAO<T, PK> {
	@PersistenceUnit(unitName = "SubscriptionPU")
	private EntityManagerFactory emf;
	
	private Class<T> type;

	public AbstractDAO(Class<T> type) {
		this.type = type;
	}

	private EntityManager getEntityManager() {
		return emf.createEntityManager();
	}

	public void create(T o) {
		EntityManager em = getEntityManager();
		em.persist(o);
	}

	public T read(PK id) {
		EntityManager em = getEntityManager();
		return em.find(type, id);
	}

	public void update(T o) {
		EntityManager em = getEntityManager();
		em.merge(o);
	}

	public void delete(T o) {
		EntityManager em = getEntityManager();
		em.remove(o);
	}

}