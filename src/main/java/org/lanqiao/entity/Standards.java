package org.lanqiao.entity;

public class Standards {
    private Integer stanId;

    private String stanName;

    public Integer getStanId() {
        return stanId;
    }

    public void setStanId(Integer stanId) {
        this.stanId = stanId;
    }

    public String getStanName() {
        return stanName;
    }

    public void setStanName(String stanName) {
        this.stanName = stanName == null ? null : stanName.trim();
    }

    @Override
    public String toString() {
        return "Standards{" +
                ", stanName='" + stanName + '\'' +
                '}';
    }
}