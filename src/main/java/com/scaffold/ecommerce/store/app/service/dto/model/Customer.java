package com.scaffold.ecommerce.store.app.service.dto.model;

import java.util.Date;

public class Customer {
    private Integer customerId;
    private String firstName;
    private String lastName;
    private String email;
    private Date birthDate;
    private Address billingAddress;
    private Address shippingAddress;
}
