package com.nonveggies.common;

import com.nonveggies.controller.OrderController;


public class RestClientTester {

	public static void main(String[] args) {

		OrderController orderController = new OrderController();
		ResponseDTO status = orderController.getOrder(1);
		
		System.out.println(status);
	
	}

}
