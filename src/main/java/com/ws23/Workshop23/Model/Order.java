package com.ws23.Workshop23.Model;

public class Order {
    private String id;
    private Long order_date;
    private String customer_id;
    private Float total;
    private Float costPrice;
    
    public Order(String id, Long order_date, String customer_id, Float total, Float costPrice) {
        this.id = id;
        this.order_date = order_date;
        this.customer_id = customer_id;
        this.total = total;
        this.costPrice = costPrice;
    }
    public Order() {
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public Long getOrder_date() {
        return order_date;
    }
    public void setOrder_date(Long order_date) {
        this.order_date = order_date;
    }
    public String getCustomer_id() {
        return customer_id;
    }
    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }
    public Float getTotal() {
        return total;
    }
    public void setTotal(Float total) {
        this.total = total;
    }
    public Float getCostPrice() {
        return costPrice;
    }
    public void setCostPrice(Float costPrice) {
        this.costPrice = costPrice;
    }
    
}
