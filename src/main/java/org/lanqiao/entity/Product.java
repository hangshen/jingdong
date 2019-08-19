package org.lanqiao.entity;

import java.util.Date;
import java.util.Set;

public class Product {
    private Integer proId;

    private String proName;

    private Integer proTypeId;

    private Integer proBrandId;

    private Date upTime;

    private Date downTime;

    private String proState;
    private Integer proUserId;

    private User user;

    private Set<Standards> standardsSet;

    public Integer getProId() {
        return proId;
    }

    public void setProId(Integer proId) {
        this.proId = proId;
    }

    public String getProName() {
        return proName;
    }

    public void setProName(String proName) {
        this.proName = proName == null ? null : proName.trim();
    }

    public Integer getProTypeId() {
        return proTypeId;
    }

    public void setProTypeId(Integer proTypeId) {
        this.proTypeId = proTypeId;
    }

    public Integer getProBrandId() {
        return proBrandId;
    }

    public void setProBrandId(Integer proBrandId) {
        this.proBrandId = proBrandId;
    }

    public Date getUpTime() {
        return upTime;
    }

    public void setUpTime(Date upTime) {
        this.upTime = upTime;
    }

    public Date getDownTime() {
        return downTime;
    }

    public void setDownTime(Date downTime) {
        this.downTime = downTime;
    }

    public String getProState() {
        return proState;
    }

    public void setProState(String proState) {
        this.proState = proState == null ? null : proState.trim();
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Set<Standards> getStandardsSet() {
        return standardsSet;
    }

    public void setStandardsSet(Set<Standards> standardsSet) {
        this.standardsSet = standardsSet;
    }

    public Integer getProUserId() {
        return proUserId;
    }

    public void setProUserId(Integer proUserId) {
        this.proUserId = proUserId;
    }

    @Override
    public String toString() {
        return "Product{" +
                "proId=" + proId +
                ", proName='" + proName + '\'' +
                ", proTypeId=" + proTypeId +
                ", proBrandId=" + proBrandId +
                ", upTime=" + upTime +
                ", downTime=" + downTime +
                ", proState='" + proState + '\'' +
                ", proUserId=" + proUserId +
                ", user=" + user +
                ", standardsSet=" + standardsSet +
                '}';
    }
}