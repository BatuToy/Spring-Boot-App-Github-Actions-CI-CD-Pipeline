package com.rp.reactiveKafka.dto;

import lombok.Data;

@Data
public class OrderResponse {
    private String id;
    private String orderName;
    private String orderStatus;
    private String orderAmount;
    private String shippingAddress;
}


