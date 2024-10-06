package com.rp.reactiveKafka.dto;

import lombok.Data;

@Data
public class OrderResponse {
    private String id;
    private String name;
    private String description;
    private String shippingAddress;
}


