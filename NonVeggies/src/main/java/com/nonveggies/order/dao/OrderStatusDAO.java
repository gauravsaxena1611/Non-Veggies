package com.nonveggies.order.dao;

// Generated Jan 2, 2016 7:58:40 AM by Hibernate Tools 3.4.0.CR1

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import org.springframework.stereotype.Repository;

import com.nonveggies.common.CommonBaseDAOImpl;
import com.nonveggies.entity.order.NvOrderStateLang;
import com.nonveggies.entity.order.NvOrderStateLangId;

/**
 * Home object for domain model class NvOrderStateLang.
 * @see com.nonveggies.dao.NvOrderStateLang
 * @author Hibernate Tools
 */

@Repository("orderStatusDAO")
public class OrderStatusDAO extends CommonBaseDAOImpl<NvOrderStateLang, NvOrderStateLangId> {

	public void persist(NvOrderStateLang transientInstance) {
		create(transientInstance);
	}

	public void remove(NvOrderStateLang persistentInstance) {
		delete(persistentInstance);
	}

	public NvOrderStateLang merge(NvOrderStateLang detachedInstance) {
		return update(detachedInstance);
	}

	public String find(int id) {
		//Passed 1 as the language is english
		NvOrderStateLangId newobj = new NvOrderStateLangId(id, 1);
		NvOrderStateLang findById = findById(newobj);
		return findById.getName();
	}
	
	public Map<Integer, String> findAllStatus() {
		List<NvOrderStateLang> allStatus = new ArrayList<NvOrderStateLang>();
		
			CriteriaQuery<NvOrderStateLang> query = entityManager.getCriteriaBuilder().createQuery(NvOrderStateLang.class);
			Root<NvOrderStateLang> orderStatusRoot = query.from(NvOrderStateLang.class);
			query.select(orderStatusRoot);
			
			allStatus = entityManager.createQuery(query).getResultList();
			
			Map<Integer, String> statusMap = new HashMap<Integer, String>();
			for (NvOrderStateLang nvOrderStateLang : allStatus) 
				statusMap.put(nvOrderStateLang.getId().getIdOrderState(),nvOrderStateLang.getName());
			return statusMap;
	}
	
}
