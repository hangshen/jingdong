package org.lanqiao.entity;

public class Login {
    private Integer loginId;

    private String accountNum;

    private String password;

    private Integer loginSate;

    private Integer loginUserId;

    public Integer getLoginId() {
        return loginId;
    }

    public void setLoginId(Integer loginId) {
        this.loginId = loginId;
    }

    public String getAccountNum() {
        return accountNum;
    }

    public void setAccountNum(String accountNum) {
        this.accountNum = accountNum == null ? null : accountNum.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getLoginSate() {
        return loginSate;
    }

    public void setLoginSate(Integer loginSate) {
        this.loginSate = loginSate;
    }

    public Integer getLoginUserId() {
        return loginUserId;
    }

    public void setLoginUserId(Integer loginUserId) {
        this.loginUserId = loginUserId;
    }
}