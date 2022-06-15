package com.contact.contactservice.entity;

public class Contact {
    private Long customerId;
    private String email;
    private String customerName;
    private Long userId;

    public Contact() {
    }

    public Contact(Long customerId, String email, String customerName, Long userId) {
        this.customerId = customerId;
        this.email = email;
        this.customerName = customerName;
        this.userId = userId;
    }



    public Long getCustomerId() {
        return customerId;
    }

    public void setCustomerId(Long customerId) {
        this.customerId = customerId;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
