package org.lanqiao.entity;

import java.util.Date;
import java.util.Set;

public class Orders {
    private Integer orderId;

    private String orderState;

    private Integer orExpressType;

    private String payType;

    private Double total;

    private Date orderTime;

    private Date payTime;

    private Integer orAddId;

    private Integer orUserId;

    private Address address;

    private Set<OrderDetail> orderDetailSet;

    public Integer getOrderId() {
        return orderId;
    }

    public void setOrderId(Integer orderId) {
        this.orderId = orderId;
    }

    public String getOrderState() {
        return orderState;
    }

    public void setOrderState(String orderState) {
        this.orderState = orderState;
    }

    public void setPayType(String payType) {
        this.payType = payType;
    }

    public Integer getOrExpressType() {
        return orExpressType;
    }

    public void setOrExpressType(Integer orExpressType) {
        this.orExpressType = orExpressType;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    public Date getOrderTime() {
        return orderTime;
    }

    public void setOrderTime(Date orderTime) {
        this.orderTime = orderTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public Integer getOrAddId() {
        return orAddId;
    }

    public void setOrAddId(Integer orAddId) {
        this.orAddId = orAddId;
    }

    public Integer getOrUserId() {
        return orUserId;
    }

    public void setOrUserId(Integer orUserId) {
        this.orUserId = orUserId;
    }

    public String getPayType() {
        return payType;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Set<OrderDetail> getOrderDetailSet() {
        return orderDetailSet;
    }

    public void setOrderDetailSet(Set<OrderDetail> orderDetailSet) {
        this.orderDetailSet = orderDetailSet;
    }
}