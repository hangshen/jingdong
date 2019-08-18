package org.lanqiao.entity;

import java.util.Date;

public class Cart {
    private Integer cartId;

    private Integer carProNum;

    private Date addTime;

    private Integer cartFlag;

    private Integer carUserId;

    private ProDetail proDetail;
    private Integer carProdeId;

    public Integer getCartId() {
        return cartId;
    }

    public void setCartId(Integer cartId) {
        this.cartId = cartId;
    }

    public Integer getCarProNum() {
        return carProNum;
    }

    public void setCarProNum(Integer carProNum) {
        this.carProNum = carProNum;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public Integer getCartFlag() {
        return cartFlag;
    }

    public void setCartFlag(Integer cartFlag) {
        this.cartFlag = cartFlag;
    }

    public Integer getCarUserId() {
        return carUserId;
    }

    public void setCarUserId(Integer carUserId) {
        this.carUserId = carUserId;
    }

    public ProDetail getProDetail() {
        return proDetail;
    }

    public void setProDetail(ProDetail proDetail) {
        this.proDetail = proDetail;
    }

    public Integer getCarProdeId() {
        return carProdeId;
    }

    public void setCarProdeId(Integer carProdeId) {
        this.carProdeId = carProdeId;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "carProNum=" + carProNum +
                ", proDetail=" + proDetail +
                '}';
    }
}