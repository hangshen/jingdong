package org.lanqiao.entity;

public class StandardsVal {
    private Integer stanValId;

    private String stanValName;

    private Standards standards;

    public Integer getStanValId() {
        return stanValId;
    }

    public void setStanValId(Integer stanValId) {
        this.stanValId = stanValId;
    }

    public String getStanValName() {
        return stanValName;
    }

    public void setStanValName(String stanValName) {
        this.stanValName = stanValName == null ? null : stanValName.trim();
    }

    public Standards getStandards() {
        return standards;
    }

    public void setStandards(Standards standards) {
        this.standards = standards;
    }

    @Override
    public String toString() {
        return "StandardsVal{" +
                ", stanValName='" + stanValName + '\'' +
                ", standards=" + standards +
                '}';
    }
}