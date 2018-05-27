package com.nonveggies.common;

import java.io.Serializable;

/**
 * This class is not to be called by any service class it will break all the idea of layered based approach.
 * 
 * This class need to be extended by the DAO layer classes only.
 * 
 * @author Gaurav
 *
 * @param <T> Entity class which need to used for executing DB operations
 * @param <PK> Primary Key Class of the Entity Class
 */
public interface CommonBaseDAO<T, PK extends Serializable> {
	
	T create(T t);

	T update(T t);

	void delete(T t);
	
	T findById(PK id);
}