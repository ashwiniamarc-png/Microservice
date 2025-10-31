package com.order.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.order.orderservice.model.OrderDTO;
import com.order.orderservice.service.OrderService;
import com.order.orderservice.service.OrderStatus;

@RestController
@RequestMapping("/api/orders")

public class OrderController {
	
	@Autowired
	private  OrderService orderService ;
	
	@PostMapping
	public ResponseEntity<OrderDTO> createOrder(@RequestBody OrderDTO dto) {
	OrderDTO created = orderService.createOrder(dto);
	return ResponseEntity.status(HttpStatus.CREATED).body(created);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<OrderDTO> getOrder(@PathVariable Long id) {
	OrderDTO dto = orderService.getOrderById(id);
	return ResponseEntity.ok(dto);
	}


	@GetMapping
	public ResponseEntity<List<OrderDTO>> listOrders() {
	return ResponseEntity.ok(orderService.listOrders());
	}


	@PutMapping("/{id}/status")
	public ResponseEntity<OrderDTO> updateStatus(@PathVariable Long id, @RequestParam("status") OrderStatus status) {
	OrderDTO updated = orderService.updateOrderStatus(id, status);
	return ResponseEntity.ok(updated);
	}


	@DeleteMapping("/{id}")
	public ResponseEntity<Void> cancelOrder(@PathVariable Long id) {
	orderService.cancelOrder(id);
	return ResponseEntity.noContent().build();
	}
}
