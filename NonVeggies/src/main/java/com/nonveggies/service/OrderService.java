package com.nonveggies.service;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nonveggies.android.dto.AndroidOrderDTO;
import com.nonveggies.order.dao.OrderDAO;
import com.nonveggies.order.dao.OrderHistoryDAO;
import com.nonveggies.order.dao.OrderStatusDAO;
import com.nonveggies.order.dto.OrderDTO;
import com.nonveggies.order.dto.OrderHistoryDTO;

@Service("orderService")
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class OrderService {

	@Autowired
	OrderDAO orderDAO;
	@Autowired
	OrderStatusDAO orderStatusDAO;
	@Autowired
	OrderHistoryDAO orderHistoryDAO;
	
	public OrderDTO getOrder(long id) throws Exception{
		OrderDTO orderDTO = orderDAO.findOrder(new Long(id).intValue());
		return orderDTO;
	}

	public String getOrderStatus(long id) throws Exception{
		OrderDTO orderDTO = orderDAO.findOrder(new Long(id).intValue());
		int currentState = orderDTO.getCurrentState();
		String status = orderStatusDAO.find(currentState);
		return status;
	}
	
	public Map<Integer, String> allStatusMap (){
		return orderStatusDAO.findAllStatus();
	}
	
	@Transactional
	public void setOrderStatus(OrderDTO updatedOrderDTO){
		
		/*Creating of new dbOrderDTO is not actually required but we are making it 
		 * so that by mistake also nothing EXCEPT STATUS must be updated in db; 
		 * Since it is the most frequent operation on every order*/
		//------------- Updating ORDER TABLE ------------------
		OrderDTO dbOrderDTO = orderDAO.findOrder(updatedOrderDTO.getIdOrder());
		dbOrderDTO.setCurrentState(updatedOrderDTO.getCurrentState());
		OrderDTO updateOrder = orderDAO.updateOrder(dbOrderDTO);
		
		//------------- Updating ORDER HISTORY TABLE ------------------
		//@TODO need to set the employee id to track 
		//which employee has changed the status
		OrderHistoryDTO orderHistoryDTO = new OrderHistoryDTO();
		orderHistoryDTO.setIdOrder(updateOrder.getIdOrder());
		orderHistoryDTO.setIdOrderState(updateOrder.getCurrentState());
		orderHistoryDTO.setDateAdd(new Date());
//		orderHistoryDTO.setIdEmployee();
		
		orderHistoryDAO.createOrderHistory(orderHistoryDTO);
	}

	
	
	/**
	 * This method is responsible for getting count of all orders with different status.
	 * The statuses are passed as a list of integers passed order
	 * 
	 * @param orderStatusList
	 * @return
	 */
	public Map<Integer, Long> geOrdersStatusCount(List<Integer> orderStatusList) {
		
		return orderDAO.getAllOrdersCountWithStatus(orderStatusList);
	}

	public AndroidOrderDTO getOrderDetail(long id) {
		
		AndroidOrderDTO androidOrderDTO = new AndroidOrderDTO();
		
		OrderDTO orderDTO = orderDAO.findOrder(new Long(id).intValue());
		
		
		
		androidOrderDTO.setId(orderDTO.getIdOrder());
		androidOrderDTO.setId_Customer(orderDTO.getIdCustomer());
		//TODO: NEED TO DISCUSS WITH THE PRESTASHOP TEAM, IT MUST BE ID NOT STRING FROM NV_DELIVERYSLOT TABLE
		androidOrderDTO.setId_DeliverySlots(0000000000000);
		androidOrderDTO.setId_DeliveryBoy(orderDTO.getIdDeliveryBoy());
		androidOrderDTO.setId_Status(orderDTO.getCurrentState());
		androidOrderDTO.setTotal(null);
		androidOrderDTO.setDiscount(orderDTO.getTotalDiscounts());
		androidOrderDTO.setTax(null);
		//TODO: NEED TO BE IMPLEMENTED BY PRESTASHOP TEAM.
		androidOrderDTO.setPreviousPendings(null);
		androidOrderDTO.setFinalAmount(orderDTO.getTotalPaidReal());
		androidOrderDTO.setOrderCreatedDate(orderDTO.getInvoiceDate());
		androidOrderDTO.setDeliveryDate(orderDTO.getDeliveryDate());
		androidOrderDTO.setCustomerComments(orderDTO.getOrderComment());
		//TODO: NEED TO BE IMPLEMENTED BY PRESTASHOP TEAM.
		androidOrderDTO.setStaffComments(null);
		androidOrderDTO.setDataCreationDate(orderDTO.getDateAdd());
		androidOrderDTO.setDataLastModifiedDate(orderDTO.getDateUpd());
		
		return androidOrderDTO;
	}
	

}
