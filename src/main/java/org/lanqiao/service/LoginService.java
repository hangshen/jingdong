package org.lanqiao.service;

import org.lanqiao.entity.Login;
import org.springframework.stereotype.Repository;

@Repository
public interface LoginService {
    Login selectByAccount(String account);
    int insertLogin(String account, String password, Integer userId);
    int updatePassword(String oldPassword, String newPassword, String reNewPassword, String account);
    int deleteLogin(Integer loginId);
}
