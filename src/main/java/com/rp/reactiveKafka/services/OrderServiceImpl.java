package com.rp.reactiveKafka.services;

import com.rp.reactiveKafka.config.mapperConfig.Mapper;
import com.rp.reactiveKafka.dto.OrderRequest;
import com.rp.reactiveKafka.dto.OrderResponse;
import com.rp.reactiveKafka.model.Order;
import com.rp.reactiveKafka.repository.OrderRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;
    private final Mapper mapper;

    @Override
    public OrderResponse createOrder(OrderRequest orderRequest) {
        Order order = mapper.map(orderRequest, Order.class);
        log.info("{}",order);
        orderRepository.save(order);
        return mapper.map(order, OrderResponse.class);
    }
    @Override
    public List<OrderResponse> getAllOrders(){
        return orderRepository.findAll().stream().map( (order -> mapper.map(order, OrderResponse.class))).toList();
    }

    @Override
    public OrderResponse getOrderById(String id) {
        Order order = orderRepository.findById(id).orElseThrow(
                () -> new IllegalStateException("Cannot find a order!")
        );
        return mapper.map(order, OrderResponse.class);
    }

}
