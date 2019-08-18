package org.lanqiao.entity;

public class Brand {
    private Integer brandId;

    private String bradName;

    public Integer getBrandId() {
        return brandId;
    }

    public void setBrandId(Integer brandId) {
        this.brandId = brandId;
    }

    public String getBradName() {
        return bradName;
    }

    public void setBradName(String bradName) {
        this.bradName = bradName == null ? null : bradName.trim();
    }
}