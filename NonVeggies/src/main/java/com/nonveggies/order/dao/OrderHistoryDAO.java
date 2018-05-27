package com.nonveggies.order.dao;

// Generated Jan 2, 2016 7:58:40 AM by Hibernate Tools 3.4.0.CR1

import org.springframework.stereotype.Repository;

import com.nonveggies.common.CommonBaseDAOImpl;
import com.nonveggies.common.NVUtility;
import com.nonveggies.entity.order.NvOrderHistory;
import com.nonveggies.order.dto.OrderDTO;
import com.nonveggies.order.dto.OrderHistoryDTO;

/**
 * Home object for domain model class NvOrderHistory.
 * 
 * @see com.nonveggies.dao.NvOrderHistory
 * @author Hibernate Tools
 */
@Repository("orderHistoryDAO")
public class OrderHistoryDAO extends CommonBaseDAOImpl<NvOrderHistory, Integer> {

	NVUtility utility = new NVUtility();

	public void createOrderHistory(OrderHistoryDTO transientInstance) {
		NvOrderHistory tnvInstance = new NvOrderHistory();
		utility.copyPOJO(transientInstance, tnvInstance);
		create(tnvInstance);
	}

	public void removeOrderHistory(OrderHistoryDTO persistentInstance) {
		NvOrderHistory pnvInstance = new NvOrderHistory();
		utility.copyPOJO(persistentInstance, pnvInstance );
		delete(pnvInstance);
	}

	public OrderDTO updateOrderHistory(OrderHistoryDTO detachedInstance) {
		NvOrderHistory dnvInstance = new NvOrderHistory();
		utility.copyPOJO(detachedInstance, dnvInstance );
		OrderDTO orderDTO = new OrderDTO();
		NvOrderHistory result = update(dnvInstance);
		utility.copyPOJO(result, orderDTO);
		return orderDTO;
	}

	public OrderDTO findOrderHistory(Integer id) {
		OrderDTO orderDTO = new OrderDTO();
		NvOrderHistory instance = findById(id);
		utility.copyPOJO(instance, orderDTO);
		return orderDTO;
	}
}
