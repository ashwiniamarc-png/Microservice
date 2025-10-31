// OrderServiceImpl.java
package com.order.orderservice.service;



import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.order.orderservice.model.OrderDTO;

import io.github.resilience4j.circuitbreaker.annotation.CircuitBreaker;
import payment.paymentservice.model.PaymentDTO;
import payment.paymentservice.model.PaymentStatus;

@Service
public class OrderServiceImpl implements OrderService {

    private static final String PAYMENT_SERVICE = null;

	// Simulated in-memory data store
    private final List<OrderDTO> orders = new ArrayList<>();
    
    @Autowired
    private RestTemplate restTemplate;
    


    public OrderServiceImpl(RestTemplate restTemplate) {
    	this.restTemplate = restTemplate;
    	   
        // Hardcoded sample data
        orders.add(new OrderDTO(1L, 101L, new BigDecimal("2500.00"), OrderStatus.NEW));
        orders.add(new OrderDTO(2L, 102L, new BigDecimal("1800.50"), OrderStatus.PROCESSING));
        orders.add(new OrderDTO(3L, 103L, new BigDecimal("4999.99"), OrderStatus.COMPLETED));
    }

    
    @CircuitBreaker(name = "paymentService", fallbackMethod = "fallbackPayment")
    @Override
    public OrderDTO createOrder(OrderDTO dto) {
        dto.setId((long) (orders.size() + 1));

        PaymentDTO paymentRequest = new PaymentDTO();
        paymentRequest.setOrderId(dto.getId());
        paymentRequest.setAmount(dto.getTotalAmount());
        paymentRequest.setPaymentMethod("UPI");

        String paymentServiceUrl = "http://localhost:8020/api/payments";

        ResponseEntity<PaymentDTO> response = restTemplate.postForEntity(
                paymentServiceUrl, paymentRequest, PaymentDTO.class);

        PaymentDTO paymentResponse = response.getBody();

        // Update order status based on payment
        if (paymentResponse != null && paymentResponse.getStatus() == PaymentStatus.SUCCESS) {
            dto.setStatus(OrderStatus.COMPLETED);
        } else {
            dto.setStatus(OrderStatus.CANCELLED);
        }

        orders.add(dto);
        return dto;
    }
    
    public OrderDTO fallbackPayment(OrderDTO dto, Throwable throwable) {
        System.out.println("⚠️ Payment Service is unavailable. Triggered fallback: " + throwable.getMessage());

        dto.setStatus(OrderStatus.PENDING);
        orders.add(dto);
        return dto;
    }

    @Override
    public OrderDTO getOrderById(Long id) {
        return orders.stream()
                .filter(order -> order.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Order not found with id: " + id));
    }

    @Override
    public List<OrderDTO> listOrders() {
        return orders;
    }

    @Override
    public OrderDTO updateOrderStatus(Long id, OrderStatus status) {
        OrderDTO order = getOrderById(id);
        order.setStatus(status);
        return order;
    }

    @Override
    public void cancelOrder(Long id) {
        OrderDTO order = getOrderById(id);
        order.setStatus(OrderStatus.CANCELLED);
    }
}
