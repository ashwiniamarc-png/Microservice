package com.order.orderservice.service;


public enum OrderStatus {
    NEW,
    PROCESSING,
    COMPLETED,
    CANCELLED,
    fallbackPayment, PENDING
}
