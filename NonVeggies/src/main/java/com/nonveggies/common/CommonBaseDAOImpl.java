package com.nonveggies.common;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.log4j.Logger;

public class CommonBaseDAOImpl<T, PK extends Serializable> implements CommonBaseDAO<T, PK> {

	protected Class<T> entityClass;


	@PersistenceContext(unitName = "mysql")
	protected EntityManager entityManager;
	
	private static Logger log = null;
	

	@SuppressWarnings("unchecked")
	public CommonBaseDAOImpl() {
		ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
		this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
		
		log = Logger.getLogger(entityClass.getClass());
	}

	@Override
	public T create(T t) {
		log.info("Starting : Creation of " + t.getClass());
		try {
			this.entityManager.persist(t);
		} catch (RuntimeException re) {
			throw re;
		}
		log.info("Completed : Creation of " + t.getClass());
		return t;
	}


	@Override
	public T update(T t) {
		log.info("Starting : Updation of " + t.getClass());
		T merge;
		try {
		       merge = this.entityManager.merge(t);
		} catch (RuntimeException re) {
			throw re;
		}
		log.info("Completed : Updation of " + t.getClass());
		return merge;
	}

	@Deprecated
	@Override
	public void delete(T t) {
		log.info("Starting : Deletion of " + t.getClass());
		try {
			t = this.entityManager.merge(t);
			this.entityManager.remove(t);
		} catch (RuntimeException re) {
			throw re;
		}
		log.info("Completed : Deletion of " + t.getClass());
	}
	
	@Override
	public T findById(PK id) {
		log.info("Starting : Looking of " + entityClass.getClass());
		T find;
		try {
			find = this.entityManager.find(entityClass, id);
		} catch (RuntimeException re) {
			throw re;
		}
		log.info("Completed : Looking of " + entityClass.getClass());
		return find;
	}
}