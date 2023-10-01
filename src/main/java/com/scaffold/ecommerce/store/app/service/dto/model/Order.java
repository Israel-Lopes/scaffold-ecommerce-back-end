package com.scaffold.ecommerce.store.app.service.dto.model;

import java.util.Date;

public class Order {
    private Integer orderId;
    private Customer customer;
    private List<CartItem> items;
    private Date orderDate;
    private double totalAmount;
    private Address shippingAddress;
}
