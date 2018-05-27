package com.nonveggies.order.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.persistence.metamodel.EntityType;

import org.springframework.stereotype.Repository;

import com.nonveggies.common.CommonBaseDAOImpl;
import com.nonveggies.common.NVUtility;
import com.nonveggies.entity.order.NvOrders;
import com.nonveggies.order.dto.OrderDTO;

@Repository("orderDAO")
public class OrderDAO extends CommonBaseDAOImpl<NvOrders, Integer> {

	NVUtility utility = new NVUtility();

	public void createOrder(OrderDTO transientInstance) {
		NvOrders tnvInstance = new NvOrders();
		utility.copyPOJO(transientInstance, tnvInstance);
		create(tnvInstance);
	}

	public void removeOrder(OrderDTO persistentInstance) {
		NvOrders pnvInstance = new NvOrders();
		utility.copyPOJO(persistentInstance, pnvInstance);
		delete(pnvInstance);
	}

	public OrderDTO updateOrder(OrderDTO detachedInstance) {
		NvOrders dnvInstance = new NvOrders();
		utility.copyPOJO(detachedInstance,dnvInstance);
		OrderDTO orderDTO = new OrderDTO();
		NvOrders result = update(dnvInstance);
		utility.copyPOJO(result, orderDTO);
		return orderDTO;
	}

	public OrderDTO findOrder(Integer id) {
		OrderDTO orderDTO = new OrderDTO();
		NvOrders instance = findById(id);
		utility.copyPOJO(instance, orderDTO);
		return orderDTO;
	}
	
	
	public Map<Integer, Long> getAllOrdersCountWithStatus(List<Integer> orderStatusList) {
		
		Map<Integer, Long> statusCount = new HashMap<Integer, Long>();
		
		for (Integer orderStatus : orderStatusList) {
			
			CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
			CriteriaQuery<Long> query = criteriaBuilder.createQuery(Long.class);
			Root<NvOrders> orderRoot = query.from(NvOrders.class);
			EntityType<NvOrders> model = orderRoot.getModel();
			
			query.select(criteriaBuilder.countDistinct(orderRoot));
			
			query.where( criteriaBuilder.equal( orderRoot.get(model.getSingularAttribute("currentState")), orderStatus.intValue()) );
			long orderStatusCount = entityManager.createQuery(query).getSingleResult();
			
			statusCount.put(orderStatus.intValue(),new Long(orderStatusCount));
		}
		
		return statusCount;
	}
}
