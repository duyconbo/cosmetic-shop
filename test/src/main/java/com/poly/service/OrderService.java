package com.poly.service;

import java.util.List;
import java.util.Map;

import com.poly.model.Order;
import com.poly.report.ReportCategory;
import com.fasterxml.jackson.databind.JsonNode;

public interface OrderService {

	Order create(JsonNode order);

	Order findById(Long id);

	List<Order> findByUsername(String username);

//	Double sumCostInMonth(Integer month);

	List<Order> findOrderInMonth(Integer month);

	Integer countOrderInMonth(Integer month);
	
}
