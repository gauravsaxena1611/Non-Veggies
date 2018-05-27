package com.nonveggies.controller;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.nonveggies.common.ExceptionDTO;
import com.nonveggies.common.NVExceptions;
import com.nonveggies.common.RequestDTO;
import com.nonveggies.common.ResponseDTO;
import com.nonveggies.order.dto.OrderDTO;
import com.nonveggies.service.OrderService;

@RequestMapping("/order")
@Controller
public class OrderController {

	@Autowired
	OrderService orderService;

	private ResponseDTO responseDTO;

	private static final Logger logger = Logger.getLogger(OrderController.class);
	
	
	// -------------------- Android --- Web-services ----- Start --------------------------------------------
	@RequestMapping(value = "/getOrderDetail/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseDTO getOrderDetail(@PathVariable("id") long id) {
		responseDTO = new ResponseDTO();
		try {
			responseDTO.setResponse(orderService.getOrderDetail(id));
		} catch (Exception e) {
			responseDTO.setExceptionDTO(new ExceptionDTO(300, NVExceptions.DATABASE_ERROR.getErrorDescription()));
			logger.error("OrderController - getStatus " + NVExceptions.DATABASE_ERROR.getErrorDescription());
		}
		return responseDTO;
	}
	
	
	
	
	
	// -------------------- Android --- Web-services ----- ENDS --------------------------------------------
	// -------------------- Generic Web-services ----- Start --------------------------------------------

	@RequestMapping(value = "/getOrder/{id}", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseDTO getOrder(@PathVariable("id") long id) {
		responseDTO = new ResponseDTO();
		try {
			responseDTO.setResponse(orderService.getOrder(id));
			
		} catch (Exception e) {
			responseDTO.setExceptionDTO(new ExceptionDTO(300, NVExceptions.DATABASE_ERROR.getErrorDescription()));
			logger.error("OrderController - getStatus " + NVExceptions.DATABASE_ERROR.getErrorDescription());
		}
		return responseDTO;
	}
	
	@RequestMapping(value = "/setStatus", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseDTO setStatus(@RequestBody OrderDTO orderDTO) {
		responseDTO = new ResponseDTO();
		try {
			orderService.setOrderStatus(orderDTO);
			responseDTO.setResponse(true);
		} catch (Exception e) {
			responseDTO.setExceptionDTO(new ExceptionDTO(300, NVExceptions.DATABASE_ERROR.getErrorDescription()));
			logger.error("OrderController - setStatus " + NVExceptions.DATABASE_ERROR.getErrorDescription());
		}
		return responseDTO;
	}
	
	@RequestMapping(value = "/getAllOrderStatus", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseDTO getAllOrderStatus() {
		responseDTO = new ResponseDTO();
		try {
			responseDTO.setResponse(orderService.allStatusMap());
			
		} catch (Exception e) {
			responseDTO.setExceptionDTO(new ExceptionDTO(300, NVExceptions.DATABASE_ERROR.getErrorDescription()));
			logger.error("OrderController - getStatus " + NVExceptions.DATABASE_ERROR.getErrorDescription());
		}
		return responseDTO;
	}
	
	@RequestMapping(value = "/getOrdersCount", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody ResponseDTO getOrdersCount(@RequestBody ArrayList<Integer> orderStatusList) {
		
		responseDTO = new ResponseDTO();
		
		try {
			responseDTO.setResponse(orderService.geOrdersStatusCount(orderStatusList));
			
		} catch (Exception e) {
			responseDTO.setExceptionDTO(new ExceptionDTO(300, NVExceptions.DATABASE_ERROR.getErrorDescription()));
			logger.error("OrderController - getStatus " + NVExceptions.DATABASE_ERROR.getErrorDescription());
		}
		return responseDTO;
	}
	
	@RequestMapping(value = "/test", method = RequestMethod.GET, consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public @ResponseBody Object test() {
		
		RequestDTO dto = new RequestDTO();
		
		ArrayList<Integer> orderStatusList = new ArrayList<Integer>();
		orderStatusList.add(new Integer(1));
		orderStatusList.add(new Integer(1));
		orderStatusList.add(new Integer(1));
		orderStatusList.add(new Integer(1));
		
		dto.setInput(orderStatusList);
		
		return dto;
	}
	
	// -------------------- Generic Web-services ----- ENDS --------------------------------------------
	
}
