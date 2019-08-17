package org.lanqiao.entity;

public class OrderDetail {
    private Integer orDeId;

    private Double proPrice;

    private Integer proNum;

    private String leaveMsg;

    private String returnWorry;

    private Integer deOrderId;

    private Integer deProId;

    private Product product;

    public Integer getOrDeId() {
        return orDeId;
    }

    public void setOrDeId(Integer orDeId) {
        this.orDeId = orDeId;
    }

    public Double getProPrice() {
        return proPrice;
    }

    public void setProPrice(Double proPrice) {
        this.proPrice = proPrice;
    }

    public Integer getProNum() {
        return proNum;
    }

    public void setProNum(Integer proNum) {
        this.proNum = proNum;
    }

    public String getLeaveMsg() {
        return leaveMsg;
    }

    public void setLeaveMsg(String leaveMsg) {
        this.leaveMsg = leaveMsg == null ? null : leaveMsg.trim();
    }

    public String getReturnWorry() {
        return returnWorry;
    }

    public void setReturnWorry(String returnWorry) {
        this.returnWorry = returnWorry == null ? null : returnWorry.trim();
    }

    public Integer getDeOrderId() {
        return deOrderId;
    }

    public void setDeOrderId(Integer deOrderId) {
        this.deOrderId = deOrderId;
    }

    public Integer getDeProId() {
        return deProId;
    }

    public void setDeProId(Integer deProId) {
        this.deProId = deProId;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }
}