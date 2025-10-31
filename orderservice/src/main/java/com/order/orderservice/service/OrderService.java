package com.order.orderservice.service;


import java.util.List;

import com.order.orderservice.model.OrderDTO;

public interface OrderService {
    OrderDTO createOrder(OrderDTO dto);
    OrderDTO getOrderById(Long id);
    List<OrderDTO> listOrders();
    OrderDTO updateOrderStatus(Long id, OrderStatus status);

    void cancelOrder(Long id);
}
