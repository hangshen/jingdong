package org.lanqiao.entity;

import java.util.Set;

public class Standards {
    private Integer stanId;

    private String stanName;

    private Set<StandardsVal> standardsvalSet;


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

    public Set<StandardsVal> getStandardsvalSet() {
        return standardsvalSet;
    }

    public void setStandardsvalSet(Set<StandardsVal> standardsvalSet) {
        this.standardsvalSet = standardsvalSet;
    }

    @Override
    public String toString() {
        return "Standards{" +
                ", stanName='" + stanName + '\'' +
                '}';
    }
}