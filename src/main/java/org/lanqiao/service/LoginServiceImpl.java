package org.lanqiao.service;

import org.lanqiao.entity.Login;
import org.lanqiao.mapper.LoginMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    LoginMapper loginMapper;
    public Login selectByAccount(String account){
        return loginMapper.selectByAccount(account);
    }

    @Override
    public int updatePassword(String oldPassword, String newPassword, String reNewPassword,String account) {
        return loginMapper.updatePassword(oldPassword,newPassword,reNewPassword,account);
    }

    @Override
    public int insertLogin(String account,String password,Integer userId) {
        Login login=new Login();
        login.setAccountNum(account);
        login.setPassword(password);
        login.setLoginUserId(userId);
        return loginMapper.insertLogin(login);
    }

    @Override
    public int deleteLogin(Integer userId) {
        return loginMapper.deleteLogin(userId);
    }
}
