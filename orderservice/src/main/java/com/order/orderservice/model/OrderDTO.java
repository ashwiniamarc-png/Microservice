package com.order.orderservice.model;

import java.math.BigDecimal;

import com.order.orderservice.service.OrderStatus;

public class OrderDTO {

	
	
	    private Long id;
	    private Long customerId;
	    private BigDecimal totalAmount;
	    private OrderStatus status;
	    
	    
	    
	    public OrderDTO() {}

	    public OrderDTO(Long id, Long customerId, BigDecimal totalAmount, OrderStatus status) {
	        this.id = id;
	        this.customerId = customerId;
	        this.totalAmount = totalAmount;
	        this.status = status;
	        
	    }

	    // getters & setters
	    public Long getId() { return id; }
	    public void setId(Long id) { this.id = id; }
	    public Long getCustomerId() { return customerId; }
	    public void setCustomerId(Long customerId) { this.customerId = customerId; }
	    public BigDecimal getTotalAmount() { return totalAmount; }
	    public void setTotalAmount(BigDecimal totalAmount) { this.totalAmount = totalAmount; }
	    
	    public OrderStatus getStatus() { return status; }
	    public void setStatus(OrderStatus status) { this.status = status; }
	}

	
	

