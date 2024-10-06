package com.rp.reactiveKafka.dto;

import lombok.Data;

@Data
public class OrderRequest {
    private String name;
    private String description;
    private String shippingAddress;
}
