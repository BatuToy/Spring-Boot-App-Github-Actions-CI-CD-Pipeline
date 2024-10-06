package com.rp.reactiveKafka.dto;

import lombok.Data;

@Data
public class OrderRequest {
    private String orderName;
    private String orderStatus;
    private String orderAmount;
    private String shippingAddress;
}
