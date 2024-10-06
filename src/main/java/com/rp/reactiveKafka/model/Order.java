package com.rp.reactiveKafka.model;

import jakarta.persistence.*;
import lombok.Data;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;

import java.util.Date;

@Data
@Entity
@Table(name =  "t_orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private String id;
    @Column(name = "ORDER_NAME")
    private String orderName;
    @Column(name = "ORDER_STATUS")
    private Boolean orderStatus;
    @Column(name = "ORDER_AMOUNT")
    private Long orderAmount;
    @Column(name = "SHIPPING_ADDRESS")
    private String shippingAddress;

    @CreatedDate
    @Column(name = "CREATED_DATE")
    private Date createdDate;
    @LastModifiedDate
    @Column(name = "LAST_MODIFIED_DATE")
    private Date lastModifiedDate;
}
