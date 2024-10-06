package com.rp.reactiveKafka.controller;

import com.rp.reactiveKafka.dto.OrderRequest;
import com.rp.reactiveKafka.dto.OrderResponse;
import com.rp.reactiveKafka.model.Order;
import com.rp.reactiveKafka.services.OrderService;
import com.rp.reactiveKafka.services.OrderServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/api/v1/order")
public class OrdersController {

    private final OrderService orderService;

    @PostMapping
    public ResponseEntity<OrderResponse> createOrder(@RequestBody OrderRequest orderRequest) {
        return ResponseEntity.ok(
                orderService.createOrder(orderRequest)
        );
    }

    @GetMapping
    public ResponseEntity<List<OrderResponse>> getAllOrders(){
        return ResponseEntity.ok(
                orderService.getAllOrders()
        );
    }


}
