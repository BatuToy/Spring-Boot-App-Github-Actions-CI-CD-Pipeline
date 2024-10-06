package com.rp.reactiveKafka.services;

import com.rp.reactiveKafka.dto.OrderRequest;
import com.rp.reactiveKafka.dto.OrderResponse;

import java.util.List;

public interface OrderService {
    OrderResponse createOrder(OrderRequest orderRequest);
    List<OrderResponse> getAllOrders();
    OrderResponse getOrderById(String id);
}
